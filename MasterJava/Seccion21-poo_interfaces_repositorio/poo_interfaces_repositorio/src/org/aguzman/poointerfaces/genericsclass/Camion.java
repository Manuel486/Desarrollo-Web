package org.aguzman.poointerfaces.genericsclass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Camion implements Iterable {

    private List objetos;
    private int max;

    public Camion(int max) {
        this.max = max;
        this.objetos = new ArrayList();
    }

    public void add(Object object){
        if(this.objetos.size() <= max){
            this.objetos.add(object);
        } else {
            throw new RuntimeException("no hay más espacio");
        }
    }


    @Override
    public Iterator iterator() {
        return this.objetos.iterator();
    }
}
