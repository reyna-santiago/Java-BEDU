public class Suma {
    //Ejemplo de clase con métodos  sin parámetros y sin retorno, y un método con parámetro y sin retorno

    //Método sin parámetros sin retorno
    public void mostrarSuma(int a, int b) {
        int resultado = a + b;
        System.out.println("➕ La suma es: " + resultado);
    }

    //Método con parámetros sin retorno
    public int obtenerSuma(int a, int b) {
        return a + b;
    }

    //Método con parámetros y con retorno
    public void duplicar(int numero) {
        numero = numero * 2;
        System.out.println("Dentro del método: " + numero); //devuelve el resultado de la suma en lugar de solo mostrarlo.
    }
}
