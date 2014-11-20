/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.comerciobici.entidades;

import com.fasterxml.jackson.annotation.JsonInclude;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Familia Torres
 */
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
@Entity
@JsonSerialize
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Producto {
   @Id
   long id;
   String nombre;
   public double precio;

    public Producto() {
        this(0,"",0);
    }

    public Producto(long id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }
    
    
     public String getNombre() {
        return nombre;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
   
    public Producto ObtenerProducto(String Nombre)
    {
        Producto producto = new Producto();
        producto.setNombre(Nombre);
        return producto;
    }
   
}
