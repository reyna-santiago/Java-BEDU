//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Bienvenida bienvenida = new Bienvenida();
        Suma suma = new Suma();
        Persona persona = new Persona("Reyna");
        Saludo saludo = new Saludo();

        bienvenida.mostrarBienvenida(); // Se realiza la llamada al método.

        suma.mostrarSuma(10,5);
        int s = suma.obtenerSuma(5, 7);
        System.out.println("🧮 Resultado: " + s);

        int x = 10;
        suma.duplicar(x);
        System.out.println("Fuera del método: " + x);  // x no cambia

        persona.cambiarNombre(persona);
        System.out.println("Nombre actualizado: " + persona.nombre);

        saludo.saludar();              // Hola
        saludo.saludar("Mario");       // Hola, Mario

    }
}