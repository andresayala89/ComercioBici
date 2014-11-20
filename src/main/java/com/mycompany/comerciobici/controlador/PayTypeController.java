/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.comerciobici.controlador;


import com.mycompany.comerciobici.entidades.Pago;
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
@RequestMapping(value = "/api/v1/formaPago" )
public class PayTypeController {
    @RequestMapping(value = "/listar", method =RequestMethod.GET, produces = {MediaType.APPLICATION_JSON})
    public List<Pago> listarFormaPago(){
        ArrayList<Pago> lista=new ArrayList<Pago>();
        lista.add(new Pago(10, "TestP"));
        return lista;
    }
    
    @RequestMapping(value = "/insertar", method =RequestMethod.POST, produces = {MediaType.APPLICATION_JSON} , consumes = {MediaType.APPLICATION_JSON})
    public @ResponseBody Pago InsertarFormaPago(@RequestBody Pago producto){
        Pago data = producto;
        return data;
    }
    
    
    @RequestMapping(value = "/actualizar/{id}", method =RequestMethod.PUT, produces = {MediaType.APPLICATION_JSON}, consumes = {MediaType.APPLICATION_JSON})
    public @ResponseBody Pago ActualizarFormaPago(@RequestBody Pago producto){
        Pago data = producto;
        return data;
    }
    
    @RequestMapping(value = "/eliminar/{id}", method =RequestMethod.DELETE, produces = {MediaType.APPLICATION_JSON}, consumes = {MediaType.APPLICATION_JSON})
    public @ResponseBody Pago  EliminarFormaPago(@RequestBody Pago producto){
       Pago data = producto;
       return data;
    }

    public List<Pago> listarPago() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}