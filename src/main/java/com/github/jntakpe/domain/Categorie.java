package com.github.jntakpe.domain;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Bean représentant une catégorie
 *
 * @author jntakpe
 */
@Document
public class Categorie extends GenericDomain {

    private String nom;

    public Categorie(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Categorie categorie = (Categorie) o;

        return !(nom != null ? !nom.equals(categorie.nom) : categorie.nom != null);

    }

    @Override
    public int hashCode() {
        return nom != null ? nom.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Categorie{" +
                "nom='" + nom + '\'' +
                '}';
    }
}
