import modelo.*;

public class EjemploImprenta {
    public static void main(String[] args) {
        Curriculo cv = new Curriculo("Resumen laboral.","Ingeniero de Sistemas",new Persona("John","Doe"));
        cv.addExperiencia("Java")
                .addExperiencia("Oracle DBA")
                .addExperiencia("Spring Framework")
                .addExperiencia("Angular");

        Libro libro = new Libro(new Persona("Eich","Gamma"),"Patrones de diseños: Elem. Reusables", Genero.PROGRAMACION);
        libro.addPagina(new Pagina("Patron Singleton"))
                .addPagina(new Pagina("Patron observador"))
                .addPagina(new Pagina("Patron Factory"));

        Informe informe = new Informe("Estudio de microservicios","Martin Fowler",new Persona("James","Gosling"));
        Imprimible.imprimir(cv);
        Imprimible.imprimir(informe);
        Imprimible.imprimir(libro);

        Imprimible objImp = new Imprimible() {
            @Override
            public String imprimir() {
                return "Hola que tal";
            }
        };

        Imprimible.imprimir(objImp);
    }


}