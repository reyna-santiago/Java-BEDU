import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RegistroSimulacion {
    public static void main(String[] args) {
        // Crear directorios dentro de este package si no existen
        Path rutaCarpeta = Paths.get("src/Config/");
        Path rutaArchivo = rutaCarpeta.resolve("parametros.txt");

        String contenido = "\nDATOS:\nTiempo de ciclo: 55.8 segundos.\nVelocidad de línea: 1.2 m/s.\nNúmero de estaciones: 8.";
        try {

            if (!Files.exists(rutaCarpeta)) {
                Files.createDirectory(rutaCarpeta); //Crear carpeta
                System.out.println("Carpeta creada correctamente.");
            }
            //Escribir contenido en el archivo (crea o sobrescribe)
            Files.write(rutaArchivo, contenido.getBytes());
            System.out.println("Archivo escrito correctamente.");

            if (Files.exists(rutaArchivo)) {
                System.out.println("El archivo fue creado exitosamente en: " + rutaArchivo.toAbsolutePath());

                String textoLeido = Files.readString(rutaArchivo);
                System.out.println("Contenido leído:");
                System.out.println(textoLeido);

            } else {
                System.out.println("El archivo no existe");
            }


        } catch (IOException e) {
            System.out.println("❌ Error al trabajar con el archivo: " + e.getMessage());
        }
    }
}