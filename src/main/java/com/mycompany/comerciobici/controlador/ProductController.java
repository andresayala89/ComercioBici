/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.comerciobici.controlador;

import com.mycompany.comerciobici.entidades.Producto;
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
 * @author Alejandro
 */
@RestController
@RequestMapping(value = "/api/v1/producto" )
public class ProductController {
    private Object json;
    @RequestMapping(value = "/listar", method =RequestMethod.GET, produces = {MediaType.APPLICATION_JSON})
    public List<Producto> listarProductos(){
        ArrayList<Producto> lista=new ArrayList<Producto>();
        lista.add(new Producto(10, "TestP", 225.68));
        return lista;
    }
    
    @RequestMapping(value = "/insertar", method =RequestMethod.POST, produces = {MediaType.APPLICATION_JSON} , consumes = {MediaType.APPLICATION_JSON})
    public @ResponseBody Producto InsertarProducto(@RequestBody Producto producto){
        Producto data = producto;
        return data;
    }
    
    
    @RequestMapping(value = "/actualizar/{id}", method =RequestMethod.PUT, produces = {MediaType.APPLICATION_JSON}, consumes = {MediaType.APPLICATION_JSON})
    public @ResponseBody Producto ActualizarProducto(@RequestBody Producto producto){
        Producto data = producto;
        return data;
    }
    
    @RequestMapping(value = "/eliminar/{id}", method =RequestMethod.DELETE, produces = {MediaType.APPLICATION_JSON}, consumes = {MediaType.APPLICATION_JSON})
    public @ResponseBody Producto  EliminarProducto(@RequestBody Producto producto){
       Producto data = producto;
        return data;
    }
}
