public class CuentaFiscal {
    private final String rfc; //(no modificable una vez asignado).
    private double saldoDisponible;

    //Constructor con validación para que el saldo no sea negativo.
    public CuentaFiscal(String rfc, double saldo ){
        this.rfc = rfc;
        if(saldo>0){
            this.saldoDisponible = saldo;
        }
    }
    //Getters para ambos atributos
    public String getRfc(){
        return rfc;
    }
    public double getSaldoDisponible(){
        return saldoDisponible;
    }
    //método que compare el RFC de la cuenta con el de la declaración, usando Objects.equals().
    public boolean validarRFC(DeclaracionImpuestos d){
        return this.rfc.equals(d.rfcContribuyente());

    }
}
