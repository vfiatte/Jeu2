/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeu.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import jeu.entity.Joueurs;
import jeu.service.ConfigService;
import jeu.service.JoueursService;
import jeu.spring.AutowireServlet;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author admin
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/loginservlet"})
public class LoginServlet extends AutowireServlet {

    @Autowired
    JoueursService joueursService;
    
    @Autowired
    ConfigService config;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String login = req.getParameter("login");
        String mdp = req.getParameter("mdp");

        Joueurs loginJoueur = joueursService.findOneByLogin(login);

        if (loginJoueur == null) {
            req.getRequestDispatcher("blocs/_inscription.jsp").include(req, resp);
        } else if ((loginJoueur.getMdp().equals(mdp))) {
            req.getSession().setAttribute("user", req.getParameter("login"));
            req.getSession().setAttribute("userMdp", req.getParameter("mdp"));
            Joueurs j = config.recupererUtilisateur(req);
            req.getRequestDispatcher("blocs/_contenuLoger.jsp").forward(req, resp);


        }
    }
}
