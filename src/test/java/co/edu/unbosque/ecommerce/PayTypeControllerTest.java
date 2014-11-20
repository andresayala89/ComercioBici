/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.unbosque.ecommerce;

import com.mycompany.comerciobici.controlador.PayTypeController;
import com.mycompany.comerciobici.entidades.Pago;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *
 * @author Familia Torres
 */
public class PayTypeControllerTest {
     @Test
    public void listarFormaPago(){
        PayTypeController pc=new PayTypeController();
        List<Pago> lista= pc.listarFormaPago();
        Assert.assertEquals(1, lista.size());
    }
    
     @Test
    public void InseratarFormaPago()
    {
      PayTypeController pc=new PayTypeController();
      Pago producto = new Pago();
      producto.setNombre("TestP");
      producto.setId(225);
      Pago Data=pc.InsertarFormaPago(producto);
      Assert.assertEquals(Data.getId(),producto.getId());
    }
    
    @Test
    public void ActualizarFormaPago()
    {
      PayTypeController pc=new PayTypeController();
      Pago producto = new Pago();
      producto.setNombre("TestP");
      producto.setId(225);
      Pago Data=pc.ActualizarFormaPago(producto);
      Assert.assertEquals(Data.getId(),producto.getId());
    }

    @Test
    public void EliminarFormaPago()
    {
      PayTypeController pc=new PayTypeController();
      Pago producto = new Pago();
      producto.setNombre("TestP");
      producto.setId(225);
      Pago Data=pc.EliminarFormaPago(producto);
      Assert.assertEquals(Data.getId(),producto.getId());
    }
}