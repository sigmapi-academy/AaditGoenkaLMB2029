import java.io.*;
import javax.sound.sampled.*;
import java.util.*;

/**
 * Write a description of class PlayUsingBinay here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PlayUsingBinary
{
    public static void main(String[] args) {
        String path = "./music/summermusic/summer-song-1.wav";
        File file = new File(path);
        try{
            FileInputStream fis = new FileInputStream(file);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            
            byte buffer[] = new byte[4096];
            int bytesRead;
            while((bytesRead=fis.read(buffer))!=-1){
                baos.write(buffer, 0, bytesRead);
            }
            
            fis.close();
            byte audioData[] = baos.toByteArray();
            
            ByteArrayInputStream bis = new ByteArrayInputStream(audioData);
            AudioInputStream ais = AudioSystem.getAudioInputStream(bis);
            
            Clip clip = AudioSystem.getClip();
            clip.open(ais);
            System.out.print("\f");
            Scanner sc = new Scanner(System.in);
            while(true){
                System.out.print("\n1.Play\n2.Stop\n3.exit\n"+
                "Enter your choice: ");
                int ch = sc.nextInt();
                switch(ch){
                    case 1:
                        clip.setFramePosition(0);
                        clip.start();
                        break;
                    case 2:
                        clip.stop();
                        break;
                    case 3:
                        clip.close();
                        System.exit(ch);
                }
            }
            //clip.start();
            //System.out.print("\nPlaying from binary data...");
            //Thread.sleep(clip.getMicrosecondLength()/1000);
        }
        catch(FileNotFoundException fnfe){
            System.err.append("\nFile not found");
        }
        catch(IOException e){
            System.err.print("\nNetwork error!");
        }
        catch(UnsupportedAudioFileException ue){
            System.err.print("\nAudio format not supported exception");
        }
        catch(LineUnavailableException lue){
            System.out.print("\nLine is not available.");
        }
        /*catch(InterruptedException e){
            System.err.print("\nTimer is interrupted.");
        }*/
    }
}