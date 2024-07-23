package org.mchunga.pooclasesabstractas.form.elementos;

import java.util.List;

abstract public class ElementoForm {

    protected String valor;
    protected String nombre;

    abstract public String dibujarHtml();

    public ElementoForm(){}

    public ElementoForm(String nombre) {
        this();
        this.nombre = nombre;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
