import java.io.*;
import javazoom.jl.player.Player;
import javazoom.jl.decoder.*;
/**
 * Write a description of class PlayerDemo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MusicPlayer
{
    public void playSong(String fileName){
        File file = new File(fileName);
        System.out.print("\f");
        try(FileInputStream fis = new FileInputStream(file)){
            Player player = new Player(fis);
            System.out.print("\nPlaying...");
            player.play();
            System.out.print("\nPlayback finished");
        }
        catch(IOException e){
            
        }
        catch(JavaLayerException e){
            
        }
    }
}