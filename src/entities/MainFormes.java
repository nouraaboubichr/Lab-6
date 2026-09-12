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
public class MainFormes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Forme[] formes = new Forme[5];
        formes[0] = new Cercle("Rouge", 5.0);
        formes[1] = new Rectangle("Bleu", 4.0, 3.0);
        formes[2] = new Triangle("Vert", 6.0, 2.5);
        formes[3] = new Forme("Noir");
        formes[4] = new Cercle("Jaune", 2.5);

        for (int i = 0; i < formes.length; i++) {
            formes[i].dessiner();
        }
    }
    
}
