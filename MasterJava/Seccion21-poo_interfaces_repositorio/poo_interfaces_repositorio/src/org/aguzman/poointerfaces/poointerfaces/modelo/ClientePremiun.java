package org.aguzman.poointerfaces.poointerfaces.modelo;

import java.util.Comparator;

public class ClientePremiun extends Cliente implements Comparator<ClientePremiun> {

    public ClientePremiun(String nombre, String apellido) {
        super(nombre, apellido);
    }

    @Override
    public int compare(ClientePremiun o1, ClientePremiun o2) {
        return 0;
    }
}
