package modelo;

public interface Imprimible {

    // Por defecto ya es final y static
    final static  String TEXTO_DEFECTO = "Imprimiendo un valor por defecto";


    // Siempre expone metodo publicos o default, no tiene sentido ponerlo en privado
    //String imprimir();

    // Se da una implementacion por defecto
    default String imprimir(){
        return TEXTO_DEFECTO;
    }

    // Los metodo estaticos le pertenecen a la clase o la interfaz, no a la instancia

    static void imprimir(Imprimible imprimible){
        System.out.println(imprimible.imprimir());
    }
}
