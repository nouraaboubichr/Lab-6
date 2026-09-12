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

public class Triangle extends Forme {

    private double base;
    private double hauteur;

    public Triangle(String couleur, double base, double hauteur) {
        super(couleur);
        this.base = base;
        this.hauteur = hauteur;
    }

    public double getBase() {
        return base;
    }

    public double getHauteur() {
        return hauteur;
    }

    public void dessiner() {
        System.out.println("Dessiner un triangle de couleur " + couleur + ", base=" + base + ", hauteur=" + hauteur);
    }
}
