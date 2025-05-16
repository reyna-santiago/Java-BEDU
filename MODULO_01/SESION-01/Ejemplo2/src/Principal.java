public class Principal {
    public static void main(String[] args) {
        // Crear objetos
        //1. Clase a la que pertene el objeto - Estudiante
        //2. Identificador - estudiante1
        //3. New + constructor - new Estudiante()

        Estudiante estudiante1 = new Estudiante();

        // Asignar valores a los atributos
        estudiante1.nombre = "Reyna";
        estudiante1.edad = 23;

        // Llamar al método saludar() del objeto
        estudiante1.saludar();
    }
}