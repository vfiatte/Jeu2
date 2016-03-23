/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeu.service;

import javax.servlet.http.HttpServletRequest;
import jeu.entity.Joueurs;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author admin
 */
public class ConfigService {

    @Autowired
    JoueursService joueursService;

    public Joueurs recupererUtilisateur(HttpServletRequest req) {
        Joueurs j = joueursService.findOneByLogin(req.getSession().getAttribute("user").toString());
        return j;
    }
}
