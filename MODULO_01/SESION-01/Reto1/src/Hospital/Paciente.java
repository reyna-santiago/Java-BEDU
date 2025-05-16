package Hospital;

public class Paciente {
    // Caracteristicas del paciente
    String nombre; //Nombre del paciente
    int edad; //Edad del paciente
    String expediente; //Número de expediente


    public void mostrarInformacion(){
        System.out.println("INFORMACIÓN DEL PACIENTE");
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println("Expediente: "+expediente);
    }
}
