package tarea;

import java.util.ArrayList;
import java.util.Date;

public class OrdenCompra {
    private int id;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Producto[] productos;

    private static int ultimoId = 0;
    private int indiceProductos;

    public OrdenCompra() {

    }

    public OrdenCompra(String descripcion) {
        this.descripcion = descripcion;
        productos = new Producto[4];
        this.id = ultimoId++;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public static int getUltimoId() {
        return ultimoId;
    }

    public void addProducto(Producto producto){
        if (indiceProductos < this.productos.length) {
            this.productos[indiceProductos++] = producto;
        }
    }
}
