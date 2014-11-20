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
public class Usuario {
    
    public String Nombre;
    public String NombreUsuario;
    public String Correo;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public void setNombreUsuario(String NombreUsuario) {
        this.NombreUsuario = NombreUsuario;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }
    
    public Usuario()
    {
        this.Nombre        = "";
        this.NombreUsuario = "";
        this.Correo        = "";
    }
    
    public Usuario(String Nom, String User, String Corr)
    {
        this.Nombre        = Nom;
        this.NombreUsuario = User;
        this.Correo        = Corr;
    }
    
    
}
