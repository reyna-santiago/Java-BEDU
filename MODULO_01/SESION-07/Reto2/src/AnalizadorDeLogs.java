import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AnalizadorDeLogs {
    public static void main(String[] args) {
        //VARIABLES PARA EL CONTEO
        double totalLineas=0; //Total de lineas leidas
        double errores=0; //Total de errores leidos
        double advertencias=0; //Total de advertencias leidas
        double porcentajeErrores; //Porcentaje de errores encontrados
        double porcentajeAdvertencias; //Porcentaje de advertencias

        Path rutaLeer = Paths.get("src/errores.log"); //Ruta del archivo que va a leer
        Path rutEscribir = Paths.get("src/registro_fallos.txt"); //Ruta del archivo que va a escribir

        try (BufferedReader lector = Files.newBufferedReader(rutaLeer)) {
            String linea; //Cadena para leer cada línea del archivo
            while ((linea = lector.readLine()) != null) {
                totalLineas++; //Contar lineas leidas
                System.out.println("➡️ " + linea); //Imprimir la linea
                if (linea.contains("ERROR")) { //Si contiene "ERROR"
                    errores++; //Aumenta el contador
                }
                if (linea.contains("ADVERTENCIA")) { //Si contiene "ADVERTENCIA"
                    advertencias++; //Aumenta el contador
                }
            }
            //CALCULAR PORCENTAJE DE ERRORES Y ADVERTENCIAS
            porcentajeErrores = (errores / totalLineas) * 100; //Calcular porcentaje de errores
            porcentajeAdvertencias = (advertencias / totalLineas) * 100; //Calcular porcentaje de advertencias

            //MOSTRAR RESULTADOS
            System.out.println("ANÁLISIS TERMINADO\nTotal de líneas leídas: " + (int) totalLineas ); //Se imprime con (int) para que solo sea la parte entera
            System.out.println("Total de errores leídos: " +(int)  errores);
            System.out.println("Total de advertencias leídas: " +(int)  advertencias);
            System.out.println("Porcentaje de errores: " + porcentajeErrores + "%"); //Sin (int) porque la variable ya es double
            System.out.println("Porcentaje de advertencias: " + porcentajeAdvertencias + "%\n");
        } catch (IOException e) {
            System.out.println("Error al procesar archivo: " + e.getMessage());

            try (BufferedWriter escribirError = Files.newBufferedWriter(rutEscribir)) {
                escribirError.write("Se produjo un error al leer el archivo: " + e.getMessage()); //Escribir el error
            } catch (IOException ex) {
                System.out.println("Erro al escribir en el archivo de registro de fallos.");
            }


        }
    }
}