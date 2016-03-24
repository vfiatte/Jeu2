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
import jeu.service.JoueursService;
import jeu.spring.AutowireServlet;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author admin
 */
@WebServlet(name = "InscriptionServlet", urlPatterns = {"/inscriptionservlet"})
public class InscriptionServlet extends AutowireServlet {

    @Autowired
    private JoueursService joueursService;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String mdp = req.getParameter("mdpinsc");
        String mdp2 = req.getParameter("mdpinsc2");
        Joueurs loginJoueur = joueursService.findOneByLogin(login);

        if (loginJoueur == null) {
            if (mdp.equals(mdp2)) {
                Joueurs j = new Joueurs();
                j.setLogin(login);
                j.setMdp(mdp);
                joueursService.save(j);
                req.getRequestDispatcher("blocs/_contenuAcceuil.jsp").include(req, resp);

            } else {
                req.setAttribute("mdpdifferent", "Les mots de passe ne correspondent pas");
                req.getRequestDispatcher("blocs/_inscription.jsp").include(req, resp);
            }

        } else {
            req.setAttribute("loginExistant", "Le login choisi existe deja");
            req.getRequestDispatcher("blocs/_inscription.jsp").include(req, resp);

        }

    }
}
