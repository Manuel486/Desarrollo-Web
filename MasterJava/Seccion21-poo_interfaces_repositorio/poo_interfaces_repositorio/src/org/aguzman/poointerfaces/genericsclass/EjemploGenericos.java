package org.aguzman.poointerfaces.genericsclass;

public class EjemploGenericos {

    public static void main(String[] args) {
        Camion transporteCaballos = new Camion(5);
        transporteCaballos.add(new Animal("Peregrino","Caballo"));
        transporteCaballos.add(new Animal("grillo","Caballo"));
        transporteCaballos.add(new Animal("Topocalma","Caballo"));
        
        for (Object o: transporteCaballos){
            Animal a = (Animal) o;
            System.out.println(a.getNombre() + " tipo: "+a.getTipo());
        }

        Camion transMaquinas = new Camion(3);
        transMaquinas.add(new Maquinaria("Buldozer"));
        transMaquinas.add(new Maquinaria("Grúa"));

        Camion transAuto = new Camion(3);
        transAuto.add(new Automovil("Toyota"));
        transAuto.add(new Automovil("Chevrolet"));

        for (Object o: transAuto){
            Automovil a = (Automovil) o;
            System.out.println(a.getMarca());
        }
    }
}
