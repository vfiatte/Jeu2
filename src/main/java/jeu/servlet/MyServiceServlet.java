/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeu.servlet;

import jeu.spring.AutowireServlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import jeu.service.EffacemoiCrudService;

/**
 *
 * @author tom
 */
@WebServlet(name = "MyServiceServlet", urlPatterns = {"/MyServiceServlet"}) 
public class MyServiceServlet extends AutowireServlet {

    @Autowired
    private EffacemoiCrudService service;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        System.out.println( "*** Nombre de records: " + service.count() );
    }
}
