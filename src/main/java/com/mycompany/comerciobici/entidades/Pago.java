/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.comerciobici.entidades;

/**
 *
 * @author Familia Torres
 */
public class Pago {
    
    public Integer Id;
    public String  Nombre;
    private int codigoTarjeta;
    private int numCuota;
    
    public Pago()
    {
        Id = 0;
        Nombre = "";
    }
    
    public Pago(int ids , String nombre, int codigoTarje, int numC)
    {
        Id     = ids;
        Nombre = nombre;
        codigoTarjeta = codigoTarje;
        numCuota = numC;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public int getCodigoTarjeta() {
        return codigoTarjeta;
    }

    public void setCodigoTarjeta(int codigoTarjeta) {
        this.codigoTarjeta = codigoTarjeta;
    }

    public int getNumCuota() {
        return numCuota;
    }

    public void setNumCuota(int numCuota) {
        this.numCuota = numCuota;
    }
    
    
       
    
    
    
}
