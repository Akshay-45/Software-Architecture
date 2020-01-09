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
public class VlcPlayer implements AdvancedMediaPlayer{

    @Override
    public void playVLC() {
        System.out.println("VLC song is playing");
    }

    @Override
    public void playMP4() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
