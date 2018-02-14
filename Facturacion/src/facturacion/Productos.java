/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacion;

/**
 *
 * @author villegasevil
 */
public class Productos {
     private String nombre;
    private String id;
    private String marca;
    private double precio;

    public Productos(String nombre, String id, String marca, double precio) {
        this.nombre = nombre;
        this.id = id;
        this.marca = marca;
        this.precio = precio;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getmarca() {
        return marca;
    }

    public void setNmarca(String nmarca) {
        this.marca = nmarca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
