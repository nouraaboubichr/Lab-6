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

public class Cercle extends Forme {

    private double rayon;

    public Cercle(String couleur, double rayon) {
        super(couleur);
        this.rayon = rayon;
    }

    public double getRayon() {
        return rayon;
    }

    public void dessiner() {
        System.out.println("Dessiner un cercle de couleur " + couleur + " et de rayon " + rayon);
    }
}
