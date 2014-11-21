/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.unbosque.ecommerce;

import com.mycompany.comerciobici.controlador.FacturaController;
import com.mycompany.comerciobici.entidades.Factura;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;
/**
 *
 * @author Andres Ayala
 */
public class FacturaControllerTest {
    @Test
    public void retornaElListadoDeClientes(){
        FacturaController pc=new FacturaController();
        List<Factura> lista=pc.listarFactura();
        Assert.assertEquals(1, lista.size());
    }
    
    @Test
    public void InsertarFactura()
    {
      FacturaController pc=new FacturaController();
      Factura Factura = new Factura();
      Factura.setId(1);
      Factura.setNumFactura("45");
      Factura.setValorTotal(10000);
      Factura Fac=pc.InsertarFactura(Factura);
      Assert.assertEquals(Factura.getNumFactura(),Fac.getNumFactura());
    }
    
    @Test
    public void ActualizarFactura()
    {
      FacturaController pc=new FacturaController();
      Factura Factura = new Factura();
      Factura.setId(1);
      Factura.setNumFactura("45");
      Factura.setValorTotal(10000);
      Factura Fac=pc.ActualizarFactura(Factura);
      Assert.assertEquals(Factura.getNumFactura(),Fac.getNumFactura());
    }

    @Test
    public void EliminarFactura()
    {
      FacturaController pc=new FacturaController();
      Factura Factura = new Factura();
      Factura.setId(1);
      Factura.setNumFactura("45");
      Factura.setValorTotal(10000);
      Factura Fac=pc.EliminarFactura(Factura);
      Assert.assertEquals(Factura.getNumFactura(),Fac.getNumFactura());
    }
}
