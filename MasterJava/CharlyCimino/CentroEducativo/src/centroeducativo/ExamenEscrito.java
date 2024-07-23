/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package centroeducativo;

/**
 *
 * @author Manuel
 */
public class ExamenEscrito extends Examen {
    private static int MIN_NOTA = 0;
    private static int MAX_NOTA = 10;
    private static int NOTA_APROB = 6;
    private static int MAX_DURACION = 90;
    private int duracion;
    private int nota;

    public ExamenEscrito(int duracion, int nota, String fecha) {
        super(fecha);
        this.duracion = duracion;
        this.nota = nota;
    }

    @Override
    public boolean aprobo() {
        return notaValida() && (this.nota>= NOTA_APROB && this.duracion<MAX_DURACION);
    }
    
    public boolean notaValida(){
        return this.nota >= MIN_NOTA && this.nota <= MAX_NOTA;
    }
    
   
}
