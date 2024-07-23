package org.example;

public class Producto {

    private int id;
    private String nombre;
    private String descripcion;
    private double precio;
    private static int idCounter = 0;

    public Producto() {
        this.id = ++idCounter;
    }

    public Producto(String nombre, String descripcion, double precio) {
        this();
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
