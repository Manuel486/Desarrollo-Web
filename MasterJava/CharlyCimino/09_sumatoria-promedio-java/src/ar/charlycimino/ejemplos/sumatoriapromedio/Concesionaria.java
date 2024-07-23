package ar.charlycimino.ejemplos.sumatoriapromedio;

import java.util.ArrayList;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class Concesionaria {

    private String nombre;
    private ArrayList<Auto> autos;

    public Concesionaria(String nombre) {
        this.nombre = nombre;
        this.autos = new ArrayList<>();
    }

    public void agregarAuto(Auto a) {
        this.autos.add(a);
    }

    public int sumatoriaKmsRecorridos() {
        int acu = 0;
        for (Auto auto : autos) {
            acu = acu + auto.getKmsRecorridos();
            // acu += auto.getKmsRecorridos();
        }
        return acu;
    }

    public int cantAutos() {
        return autos.size();
    }

    public double promedioKmsRecorridos() {
        /*double promedio = 0;
        if (cantAutos() > 0) {
            promedio = (double) sumatoriaKmsRecorridos() / cantAutos();
        }
        return promedio;*/
        return (cantAutos() > 0 ? (double) sumatoriaKmsRecorridos() / cantAutos() : 0);
    }

}
