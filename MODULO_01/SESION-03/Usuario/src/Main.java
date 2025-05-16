public class Main {
    public static void main(String[] args) {
        Usuario u = new Usuario("Mario", 500.0);

        Empleado empleado = new Empleado();

        // Accedemos al nombre (método público)
        System.out.println("👤 Usuario: " + u.getNombre());

        // Accedemos al saldo usando método getter
        System.out.println("💰 Saldo inicial: $" + u.getSaldo());

        // Usamos un método público para modificar saldo
        u.depositar(250.0);
        System.out.println("💰 Saldo después del depósito: $" + u.getSaldo());

        empleado.mostrarNacionalidad();
    }
}