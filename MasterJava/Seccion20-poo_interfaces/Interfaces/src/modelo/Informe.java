package modelo;

public class Informe extends Hoja implements Imprimible{
    private Persona autor;
    private String revisor;

    public Informe(String contenido, String revisor, Persona autor) {
        super(contenido);
        this.autor = autor;
        this.revisor = revisor;
    }

    @Override
    public String imprimir() {
        return "Informse escrito por : "+autor+"\n"
                + "Revisador por : "+revisor
                + "\n"+this.contenido;
    }
}
