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

public class Developpeur extends Personne {

    public Developpeur(String nom, double salaireBase) {
        super(nom, salaireBase);
    }

    public double calculerSalaire() {
        return salaireBase * 1.10;
    }
}
