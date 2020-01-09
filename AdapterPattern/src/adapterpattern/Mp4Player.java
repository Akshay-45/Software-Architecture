/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterpattern;

/**
 *
 * @author student
 */
public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playVLC() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void playMP4() {
        System.out.println("Mp4 song is playing");
    }
    
}
