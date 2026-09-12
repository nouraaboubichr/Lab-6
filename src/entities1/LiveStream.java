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

public class LiveStream extends Media {

    private String url;

    public LiveStream(String titre, String url) {
        super(titre);
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void lire() {
        System.out.println("Demarrage du flux en direct : " + titre + " - " + url);
    }

    public int getDuree() {
        return -1;
    }
}