import java.io.*;
import javax.sound.sampled.*;
/**
 * Write a description of class PlayAudio here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PlayAudio
{
    public static void main(String[] args){
        String path = "./music/summermusic/summer-song-1.wav";
        File file = new File(path);
        try
        {
            AudioInputStream audio = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audio);
            clip.start();
            System.out.print("\nPlaying...");
            Thread.sleep(clip.getMicrosecondLength()/1000);
        }
        catch (Exception uafe)
        {
            uafe.printStackTrace();
        }

    }
}