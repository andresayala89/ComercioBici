/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.unbosque.ecommerce;

import com.mycompany.comerciobici.controlador.UsarioController;
import com.mycompany.comerciobici.entidades.Usuario;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;
/**
 *
 * @author Familia Torres
 */
public class UserControllerTest {
    @Test
    public void retornaElListadoDeUsuarios(){
        UsarioController pc=new UsarioController();
        List<Usuario> lista=pc.listarUsuarios();
        Assert.assertEquals(1, lista.size());
    }
    
    @Test
    public void InsertarUsuario()
    {
      UsarioController pc=new UsarioController();
      Usuario Usuario = new Usuario();
      Usuario.setNombre("Torres");
      Usuario.setNombreUsuario("ayala");
      Usuario.setCorreo("AYATO");
      Usuario Usuario2=pc.InsertarUsuario(Usuario);
      Assert.assertEquals(Usuario.getNombre(),Usuario2.getNombre());
    }
    
    @Test
    public void ActualizarUsuario()
    {
      UsarioController pc=new UsarioController();
      Usuario Usuario = new Usuario();
      Usuario.setNombre("Torres");
      Usuario.setNombreUsuario("ayala");
      Usuario.setCorreo("AYATO");
      Usuario Usuario2=pc.ActualizarUsuario(Usuario);
      Assert.assertEquals(Usuario.getNombre(),Usuario2.getNombre());
    }

    @Test
    public void EliminarUsuario()
    {
      UsarioController pc=new UsarioController();
      Usuario Usuario = new Usuario();
      Usuario.setNombre("Torres");
      Usuario.setNombreUsuario("ayala");
      Usuario.setCorreo("AYATO");
      Usuario Usuario2=pc.EliminarUsuario(Usuario);
      Assert.assertEquals(Usuario.getNombre(),Usuario2.getNombre());
    }
}

