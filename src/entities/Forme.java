/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author hp
 */

public class Forme {

    protected String couleur;

    public Forme(String couleur) {
        this.couleur = couleur;
    }

    public String getCouleur() {
        return couleur;
    }

    public void dessiner() {
        System.out.println("Dessiner une forme de couleur " + couleur);
    }
}
