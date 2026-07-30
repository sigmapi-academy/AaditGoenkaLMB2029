
/**
 * Write a description of class TestMusicPlayer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestMusicPlayer
{
    
    public static void main(String[] args){
        // "C:\Users\bluej\Documents\Students\Aadit Goenka\Java\Github\Coding\MP3Player\Songs\Collection1\hanuman.mp3"
        String fileName = "./Songs/Collection1/hanuman.mp3";
        
        MusicPlayer mp = new MusicPlayer();
        mp.playSong(fileName);
    }
}