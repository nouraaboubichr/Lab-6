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

public class Audio extends Media {

    private int duree;

    public Audio(String titre, int duree) {
        super(titre);
        this.duree = duree;
    }

    public void lire() {
        System.out.println("Lecture audio : " + titre);
    }

    public int getDuree() {
        return duree;
    }
}
