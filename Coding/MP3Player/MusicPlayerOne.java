import java.util.*;
import java.io.*;
import javazoom.jl.player.advanced.*;
/**
 * Write a description of class MusicPlayerOne here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MusicPlayerOne
{
    private ArrayList<File> playlist;
    private int currentSong;

    private AdvancedPlayer player;
    private Thread playThread;

    private boolean playing;
    private boolean paused;

    public MusicPlayerOne(String folderPath){
        playlist = new ArrayList<File>();
        File folder = new File(folderPath);
        if(folder.exists() && folder.isDirectory()){
            File files[] = folder.listFiles();
            for(File f : files){
                if(f.getName().toLowerCase().endsWith(".mp3")){
                    playlist.add(f);
                }
            }
        }

        currentSong = 0;
        playing = false;
        paused = false;
    }

    public void showSongs(){
        if(playlist.size() == 0){
            System.out.print("\nNo mp3 files found.");
            return;
        }

        System.out.print("\nPlaylist");
        for(int i = 0; i < playlist.size(); i++){
            System.out.print("\n"+(i+1)+". " + 
                playlist.get(i).getName());
        }
    }
}