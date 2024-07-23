package ar.charlycimino.ejemplos.maxmin;

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

    public int cantAutos() {
        return autos.size();
    }

    public Auto autoMasKmsRecorridos() {
        Auto autoMax = null;
        int kmsMax = -1;
        for (Auto auto : autos) {
            if (auto.getKmsRecorridos() > kmsMax) {
                kmsMax = auto.getKmsRecorridos();
                autoMax = auto;
            }
        }
        return autoMax;
    }

    /*private int maxKmsRecorridos() {
        int kmsMax = -1;
        for (Auto auto : autos) {
            if (auto.getKmsRecorridos() > kmsMax) {
                kmsMax = auto.getKmsRecorridos();
            }
        }
        return kmsMax;
    }

    public ArrayList<Auto> autosMasKmsRecorridos() {
        ArrayList<Auto> listaDeMaximos = new ArrayList<>();
        int kmsMax = maxKmsRecorridos();
        for (Auto auto : autos) {
            if (auto.getKmsRecorridos() == kmsMax) {
                listaDeMaximos.add(auto);
            }
        }
        return listaDeMaximos;
    }*/
    public ArrayList<Auto> autosMasKmsRecorridos() {
        ArrayList<Auto> listaDeMaximos = new ArrayList<>();
        int kmsMax = -1;
        for (Auto auto : autos) {
            if (auto.getKmsRecorridos() == kmsMax) {
                listaDeMaximos.add(auto);
            } else if (auto.getKmsRecorridos() > kmsMax) {
                kmsMax = auto.getKmsRecorridos();
                listaDeMaximos.clear();
                listaDeMaximos.add(auto);
            }
        }
        return listaDeMaximos;
    }

    public Auto autoMenosKmsRecorridos() {
        Auto autoMin = null;
        int kmsMin = Integer.MAX_VALUE;
        for (Auto auto : autos) {
            if (auto.getKmsRecorridos() < kmsMin) {
                kmsMin = auto.getKmsRecorridos();
                autoMin = auto;
            }
        }
        return autoMin;
    }

}
