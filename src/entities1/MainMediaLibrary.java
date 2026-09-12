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
public class MainMediaLibrary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MediaLibrary lib = new MediaLibrary();

        lib.add(new Audio("Podcast Java", 1800));
        lib.add(new Video("Tutoriel UML", 900, "1080p"));
        lib.add(new LiveStream("Concert en direct", "http://live.example.com"));
        lib.add(new Audio("Musique Classique", 2400));

        lib.playAll();
        System.out.println();
        System.out.println("Duree totale (sec) : " + lib.totalDuration());
    }
    
}
