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
public class MediaAdapter implements MediaPlayer{

    AdvancedMediaPlayer amp;
    @Override
    public void Play(String Songname) {
        if(Songname.equals("mp4")){
            amp=new Mp4Player();
            amp.playMP4();
        }
        
        if(Songname.equals("vlc")){
            amp=new VlcPlayer();
            amp.playVLC();
    }
    }
    
}
