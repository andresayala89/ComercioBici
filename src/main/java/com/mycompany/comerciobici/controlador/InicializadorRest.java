/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.comerciobici.controlador;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 *
 * @author Familia Torres
 */
public class InicializadorRest implements WebApplicationInitializer{
    public void onStartup(ServletContext servletContext) throws ServletException {  
            AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();  
            ctx.register(CargadorApplicacion.class);  
            ctx.setServletContext(servletContext);    
            ServletRegistration.Dynamic dynamic = servletContext.addServlet("dispatcher", new DispatcherServlet(ctx));  
            dynamic.addMapping("/");  
            dynamic.setLoadOnStartup(1);  
   }  
}