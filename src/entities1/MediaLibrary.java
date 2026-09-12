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

public class MediaLibrary {

    private Media[] items;
    private int count;

    public MediaLibrary() {
        items = new Media[4];
        count = 0;
    }

    public void add(Media m) {

        if (count == items.length) {
            Media[] tmp = new Media[items.length * 2];
            for (int i = 0; i < items.length; i++) {
                tmp[i] = items[i];
            }
            items = tmp;
        }

        items[count] = m;
        count++;
    }

    public void playAll() {
        System.out.println("=== Lecture de la bibliotheque ===");

        for (int i = 0; i < count; i++) {
            items[i].lire();
        }
    }

    public int totalDuration() {
        int sum = 0;

        for (int i = 0; i < count; i++) {
            int d = items[i].getDuree();
            if (d > 0) {
                sum = sum + d;
            }
        }

        return sum;
    }
}
