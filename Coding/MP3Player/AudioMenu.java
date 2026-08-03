import java.util.*;

/**
 * Write a description of class AudioMenu here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AudioMenu
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("\f===================================================");
        System.out.print("\n     MP3 Music Player Using JLayer");
        System.out.print("\n===================================================");
        
        System.out.print("\nEnter MP3 Folder Path: ");
        String folder = sc.nextLine();
        
        MusicPlayerOne player = new MusicPlayerOne(folder);
        
        if (player.totalSongs() == 0){
            System.out.print("\nNo MP3 Files Found");
            return;
        }
        
        System.out.print("\nSongs found: " + player.totalSongs());
        player.showSongs();
        
        int choice;
        do{
            System.out.print("\n===================================================");
            System.out.print("\n\t\tMain Menu");
            System.out.print("\n===================================================");
            System.out.print("\n 1. Show Playlist");
            System.out.print("\n 2. Play");
            System.out.print("\n 3. Next Song");
            System.out.print("\n 4. Previous Song");
            System.out.print("\n 5. Stop");
            System.out.print("\n 6. exit");
            System.out.print("\n===================================================");
            System.out.print("\nEnter your choice: ");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    player.showSongs();
                    break;
                case 2:
                    player.play();
                    break;
                case 3:
                    player.next();
                    break;
                case 4:
                    player.previous();
                    break;
                case 5:
                    player.stop();
                    break;
                case 6:
                    player.stop();
                    System.out.print("\nThank you for using MP3 player");
                    sc.close();
                    System.exit(choice);
                default:
                    System.out.print("\nWrong option selected");
            }
        }while(true);
        
    }
}