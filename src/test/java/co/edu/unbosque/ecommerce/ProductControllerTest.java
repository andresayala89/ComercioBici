/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.unbosque.ecommerce;


import com.mycompany.comerciobici.controlador.ProductController;
import com.mycompany.comerciobici.entidades.Producto;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *
 * @author Alejandro
 */
public class ProductControllerTest {
   
    @Test
    public void retornaElListadoDeProductos(){
        ProductController pc=new ProductController();
        List<Producto> lista=pc.listarProductos();
        Assert.assertEquals(1, lista.size());
    }
    
     @Test
    public void InseratarProducto()
    {
      ProductController pc=new ProductController();
      Producto producto = new Producto();
      producto.setNombre("TestP");
      producto.setPrecio(225.68);
      Producto Data=pc.InsertarProducto(producto);
      Assert.assertEquals(Data.getPrecio(),producto.getPrecio());
    }
    
    @Test
    public void ActualizarProducto()
    {
      ProductController pc=new ProductController();
      Producto producto = new Producto();
      producto.setNombre("TestP");
      producto.setPrecio(225.68);
      Producto Data=pc.ActualizarProducto(producto);
      Assert.assertEquals(Data.getPrecio(),producto.getPrecio());
    }

    @Test
    public void EliminarProducto()
    {
      ProductController pc=new ProductController();
      Producto producto = new Producto();
      producto.setNombre("TestP");
      producto.setPrecio(225.68);
      Producto Data=pc.EliminarProducto(producto);
      Assert.assertEquals(Data.getPrecio(),producto.getPrecio());
    }
}

