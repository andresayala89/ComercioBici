/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.comerciobici.controlador;

import com.mycompany.comerciobici.entidades.Cliente;
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
 * @author Familia Torres
 */
@RestController
@RequestMapping(value = "/api/v1/cliente" )
public class ClienteController {
    @RequestMapping(value = "/listar", method =RequestMethod.GET, produces = {MediaType.APPLICATION_JSON})
    public List<Cliente> listarClientes(){
        ArrayList<Cliente> lista=new ArrayList<Cliente>();
        lista.add(new Cliente("aaaa", "bbbb", "cccc"));
        return lista;
    }
    
    @RequestMapping(value = "/insertar",method =RequestMethod.POST, produces = {MediaType.APPLICATION_JSON} , consumes = {MediaType.APPLICATION_JSON})
    public @ResponseBody Cliente InsertarCliente(@RequestBody Cliente name){
        Cliente Usuario = name;
        return Usuario;
    }
    
    
    @RequestMapping(value = "/actualizar/{id}", method =RequestMethod.PUT, produces = {MediaType.APPLICATION_JSON} , consumes = {MediaType.APPLICATION_JSON})
    public @ResponseBody Cliente ActualizarCliente(@RequestBody Cliente name){
        Cliente Usuario = name;
        return Usuario;
    }
    
    @RequestMapping(value = "/eliminar/{id}", method =RequestMethod.DELETE, produces = {MediaType.APPLICATION_JSON}, consumes = {MediaType.APPLICATION_JSON})
    public @ResponseBody Cliente EliminarCliente(@RequestBody Cliente name){
        Cliente Usuario = name;
        return Usuario;
    }
    
}

