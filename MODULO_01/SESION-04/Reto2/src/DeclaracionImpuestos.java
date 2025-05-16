public record DeclaracionImpuestos (String rfcContribuyente,double montoDeclarado){

    @Override
    public String toString(){
        return "\uD83D\uDCC4 Declaración enviada por RFC: "+rfcContribuyente+" por $"+montoDeclarado;
    }
}
