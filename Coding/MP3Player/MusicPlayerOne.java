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

    public void play(){
        if(playlist.size() == 0){
            System.out.print("\nPlaylist Empty.");
            return;
        }

        stop(); // Writing the function later. 
        File song = playlist.get(currentSong);
        playThread = new Thread(new Runnable(){
                public void run(){
                    playing = true;
                    try(FileInputStream fis = new FileInputStream(song);
                    BufferedInputStream bis = new BufferedInputStream(fis)){
                        player = new AdvancedPlayer(bis);
                        System.out.print("\nPlaying : " + song.getName());
                        player.play();
                    }
                    catch(IOException ioe ){

                    }
                    catch(javazoom.jl.decoder.JavaLayerException jle){

                    }
                    finally{
                        playing = false;
                    }
                }
            });

            playThread.start(); //activating run method
    }
    
    public void stop(){
        if(player!= null){
            player.close();
        }
        playing = false;
    }
    
    public void next(){
        if(playlist.size() == 0){
            return;
        }
        
        stop();
        currentSong++;
        if(currentSong >= playlist.size()){
            currentSong = 0;
        }
        
        play();
    }
    
    public void previous(){
        
        if(playlist.size() == 0){
            return;
        }
        
        stop();
        currentSong--;
        if(currentSong < 0){
            currentSong = playlist.size() - 1;
        }
        
        play();
    }
    
    public int totalSongs(){
        return playlist.size();
    }
    
}

