/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.unbosque.ecommerce;


import com.mycompany.comerciobici.controlador.ClienteController;
import com.mycompany.comerciobici.entidades.Cliente;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *
 * @author Familia Torres
 */
public class ClientControllerTest {
    @Test
    public void retornaElListadoDeClientes(){
        ClienteController pc=new ClienteController();
        List<Cliente> lista=pc.listarClientes();
        Assert.assertEquals(1, lista.size());
    }
    
    @Test
    public void InsertarCliente()
    {
      ClienteController pc=new ClienteController();
      Cliente Usuario = new Cliente();
      Usuario.setNombre("Torres");
      Usuario.setUsuario("Ayala");
      Usuario.setCorreo("TOAYA");
      Cliente Usuario2=pc.InsertarCliente(Usuario);
      Assert.assertEquals(Usuario.getNombre(),Usuario2.getNombre());
    }
    
    @Test
    public void ActualizarCliente()
    {
      ClienteController pc=new ClienteController();
      Cliente Usuario = new Cliente();
      Usuario.setNombre("Torres");
      Usuario.setUsuario("Ayala");
      Usuario.setCorreo("TOAYA");
      Cliente Usuario2=pc.ActualizarCliente(Usuario);
      Assert.assertEquals(Usuario.getNombre(),Usuario2.getNombre());
    }

    @Test
    public void EliminarCliente()
    {
      ClienteController pc=new ClienteController();
      Cliente Usuario = new Cliente();
      Usuario.setNombre("Torres");
      Usuario.setUsuario("Ayala");
      Usuario.setCorreo("TOAYA");
      Cliente Usuario2=pc.EliminarCliente(Usuario);
      Assert.assertEquals(Usuario.getNombre(),Usuario2.getNombre());
    }
}
