public class Main {
    public static void main(String[] args) {
        //Crea una declaración de impuestos.
        DeclaracionImpuestos declaracionImpuestos = new DeclaracionImpuestos("LOPE800101HDFRRN09",4500.0);
        //Crea una cuenta fiscal.
        CuentaFiscal cuentaFiscal = new CuentaFiscal("LOPE800101HDFRRN09",5000.0);
        //Muestra la información de ambas.
        System.out.println(declaracionImpuestos.toString());
        System.out.println("\uD83C\uDFE6 Cuenta fiscal registrada con RFC: "+cuentaFiscal.getRfc()+", saldo disponible: $"+cuentaFiscal.getSaldoDisponible());
        //Valida si el RFC coincide y muestra el resultado.
        boolean validar = cuentaFiscal.validarRFC(declaracionImpuestos);
        System.out.println("✅ ¿RFC válido para esta cuenta?: "+validar);
    }
}