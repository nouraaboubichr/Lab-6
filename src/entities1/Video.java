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

public class Video extends Media {

    private int duree;
    private String resolution;

    public Video(String titre, int duree, String resolution) {
        super(titre);
        this.duree = duree;
        this.resolution = resolution;
    }

    public String getResolution() {
        return resolution;
    }

    public void lire() {
        System.out.println("Lecture video : " + titre + " [" + resolution + "]");
    }

    public int getDuree() {
        return duree;
    }
}
