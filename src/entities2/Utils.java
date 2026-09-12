/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities2;

import java.util.List;

/**
 *
 * @author hp
 */

public class Utils {

    public static void listerPersonnes(List<? extends Personne> personnes) {
        for (int i = 0; i < personnes.size(); i++) {
            Personne p = personnes.get(i);
            p.affiche();
        }
    }
}
