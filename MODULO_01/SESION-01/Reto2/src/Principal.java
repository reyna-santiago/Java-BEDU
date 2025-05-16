public class Principal {
    public static void main(String[] args){
        //Crear el objetos de tipo Entrada
        Entrada entrada1 = new Entrada("Obra de Teatro",450.0);
        Entrada entrada2 = new Entrada("Obra de Teatro 2",500.0);
        //Llamar al método mostrarInformacion()
        entrada1.mostrarInformacion();
        entrada2.mostrarInformacion();

        //Crear un objeto usando el record
        Entrada_Record entrada_record1 = new Entrada_Record("Obra de Teatro",450.0);
        //Mostrar el toString() generado por el record
        System.out.println(entrada_record1);
    }
}
