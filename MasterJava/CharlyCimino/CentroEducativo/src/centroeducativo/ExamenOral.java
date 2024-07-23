/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package centroeducativo;

/**
 *
 * @author Manuel
 */
public class ExamenOral extends Examen {

    private NivelSatisfaccion nivelSatisfaccion;
    private static NivelSatisfaccion MIN_NIVEL = NivelSatisfaccion.SUFICIENTE;

    public ExamenOral(NivelSatisfaccion nivelSatisfaccion, String fecha) {
        super(fecha);
        this.nivelSatisfaccion = nivelSatisfaccion;
    }
    
    @Override
    public boolean aprobo() {
        return nivelSatisfaccion.ordinal() >= MIN_NIVEL.ordinal();
    }
    
}
