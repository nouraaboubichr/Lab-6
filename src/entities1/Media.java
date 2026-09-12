/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities1;

/**
 *
 * @author hp
 */

public class Media {

    protected String titre;

    public Media(String titre) {
        this.titre = titre;
    }

    public String getTitre() {
        return titre;
    }

    public void lire() {
        System.out.println("Lecture de : " + titre);
    }

    public int getDuree() {
        return 0;
    }
}
