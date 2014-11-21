/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.comerciobici.entidades;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import javax.persistence.Entity;
import javax.persistence.Id;
/**
 *
 * @author Andres Ayala
 */
@Entity
@JsonSerialize
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Factura{
   
    @Id
    private int id;
    private String CnsFactura;
    private double valorFactura;
    
    
    public Factura()
    {
        this.id        = 0;
        this.CnsFactura = "";
        this.valorFactura = 0.0;
    }

    public Factura(int id, String CnsFactura, double valorFactura) {
        this.id = id;
        this.CnsFactura = CnsFactura;
        this.valorFactura = valorFactura;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumFactura() {
        return CnsFactura;
    }

    public void setNumFactura(String CnsFactura) {
        this.CnsFactura = CnsFactura;
    }

    public double getValorTotal() {
        return valorFactura;
    }

    public void setValorTotal(double valorFactura) {
        this.valorFactura = valorFactura;
    }
    
    
    @Override
    public String toString() {
        return "com.mycompany.comerciobici.entidades.Factura[ id=" + id + " ]";
    }
    
}
