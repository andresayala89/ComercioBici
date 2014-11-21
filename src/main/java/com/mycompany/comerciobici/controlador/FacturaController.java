/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.comerciobici.controlador;

import com.mycompany.comerciobici.entidades.Factura;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Andres Ayala
 */
@RestController
@RequestMapping(value = "/api/v1/cliente" )
public class FacturaController {
    @RequestMapping(value = "/listar", method =RequestMethod.GET, produces = {MediaType.APPLICATION_JSON})
    public List<Factura> listarFactura(){
        ArrayList<Factura> lista=new ArrayList<Factura>();
        lista.add(new Factura(1, "FACAYALA", 2));
        return lista;
    }
    
    @RequestMapping(value = "/insertar",method =RequestMethod.POST, produces = {MediaType.APPLICATION_JSON} , consumes = {MediaType.APPLICATION_JSON})
    public @ResponseBody Factura InsertarFactura(@RequestBody Factura name){
        Factura Factura = name;
        return Factura;
    }
    
    
    @RequestMapping(value = "/actualizar/{id}", method =RequestMethod.PUT, produces = {MediaType.APPLICATION_JSON} , consumes = {MediaType.APPLICATION_JSON})
    public @ResponseBody Factura ActualizarFactura(@RequestBody Factura name){
        Factura Factura = name;
        return Factura;
    }
    
    @RequestMapping(value = "/eliminar/{id}", method =RequestMethod.DELETE, produces = {MediaType.APPLICATION_JSON}, consumes = {MediaType.APPLICATION_JSON})
    public @ResponseBody Factura EliminarFactura(@RequestBody Factura name){
        Factura Factura = name;
        return Factura;
    }
    
}

