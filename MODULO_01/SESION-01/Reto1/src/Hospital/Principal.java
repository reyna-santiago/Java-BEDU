package Hospital;

import java.util.Scanner;

public class Principal { //Método principal
    public static void main(String[] args) {
        //Nuevo objeto tipo paciente
        Paciente paciente1 = new Paciente();

        //Nuevo objeto escaner
        Scanner sc = new Scanner(System.in);

        //Pedir datos del paciente
        System.out.print("Introduce tu nombre: ");
        paciente1.nombre = sc.nextLine(); //nombre
        System.out.print("Introduce tu edad (con números): ");
        paciente1.edad = sc.nextInt(); //edad
        sc.nextLine(); //limpia el salto de línea (buffer)
        System.out.print("Introduce tu número de expediente: ");
        paciente1.expediente = sc.nextLine(); //expediente

        sc.close();//Cerrar el scanner (Ya no se van a pedir más datos)
        paciente1.mostrarInformacion(); //Mostrar la información del paciente

    }
}
