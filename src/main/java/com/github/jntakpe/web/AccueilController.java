package com.github.jntakpe.web;

import com.github.jntakpe.domain.Categorie;
import com.github.jntakpe.repository.CategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Contrôleur de la page d'accueil
 *
 * @author jntakpe
 */
@Controller
@RequestMapping("/")
public class AccueilController {

    @Autowired
    private CategorieRepository categorieRepository;

    @RequestMapping(method = RequestMethod.GET)
    public String display() {
        categorieRepository.deleteAll();
        System.out.println("findAll before" + categorieRepository.findAll());
        categorieRepository.save(new Categorie("toto"));
        categorieRepository.save(new Categorie("titi"));
        System.out.println("findAll after" + categorieRepository.findAll());
        return "accueil";
    }
}
