/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterpattern;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class AdapterPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MediaPlayer mp;
        mp = new AudioPlayer();
        System.out.println("Enter the name of the song");
        String song = sc.nextLine();
        mp.Play(song);
    }
    
}
