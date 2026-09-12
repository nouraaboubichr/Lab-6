/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities2;

/**
 *
 * @author hp
 */

public abstract class Personne {

    protected String nom;
    protected double salaireBase;

    public Personne(String nom, double salaireBase) {
        this.nom = nom;
        this.salaireBase = salaireBase;
    }

    public String getNom() {
        return nom;
    }

    public double getSalaireBase() {
        return salaireBase;
    }

    public abstract double calculerSalaire();

    public void affiche() {
        System.out.println("Je suis " + nom + ", salaire = " + calculerSalaire());
    }
}
