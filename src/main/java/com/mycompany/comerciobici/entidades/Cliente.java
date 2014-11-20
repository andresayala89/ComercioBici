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
public class Cliente {
    
    public String Nombre;
    public String Usuario;
    public String Correo;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }
    
    public Cliente()
    {
        this.Nombre  = "";
        this.Usuario = "";
        this.Correo  = "";
    }
    
    public Cliente(String Nombre, String Usuario, String Correo)
    {
        this.Nombre  = Nombre;
        this.Usuario = Usuario;
        this.Correo  = Correo;
    }
    
    
}
