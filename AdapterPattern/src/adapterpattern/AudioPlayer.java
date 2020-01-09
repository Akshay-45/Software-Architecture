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
public class AudioPlayer implements MediaPlayer {

    MediaAdapter ma = new MediaAdapter();
    @Override
    public void Play(String Songname) {
        if (Songname.endsWith("mp3"))
        {
            System.out.println("Mp3 song is playing");
        }
        
        if(Songname.endsWith("mp4"))
        {
            ma.Play("mp4");
        }
        
        if(Songname.endsWith("vlc"))
        {
            ma.Play("vlc");
        }
    }
    
}
