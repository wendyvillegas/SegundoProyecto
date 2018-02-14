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
public class Clientes {
    
    public String nombre;
    public String apellido;
    public String ci;
    public String telefono;
    public String direccion;

    public Clientes(){
        
    }
    public Clientes(String nombres,String apellido, String ci, String telefono,String direccion) {
        this.nombre = nombre;
        this.apellido=apellido;
        this.ci = ci;
        this.telefono = telefono;
        this.direccion=direccion;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getDireccion() {
        return direccion;
    }
    
}
