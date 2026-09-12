/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hp
 */
public class TestPersonnes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Personne> equipe = new ArrayList<Personne>();
        equipe.add(new Developpeur("Ali", 2000));
        equipe.add(new Manager("Hamid", 3000));
        equipe.add(new Developpeur("Hanane", 2200));

        Utils.listerPersonnes(equipe);
    }
    
}
