package Chapter1;

/**
 * Write a description of class Dice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dice
{
    public static void main(String args[]) throws InterruptedException {
        int k;
        int max = 6;
        int pnum = 1;
        System.out.print("\f");
        for(;;){
            System.out.print("\nPlayer" + pnum%5);
            System.out.print("\nTo roll a dice press 1 and close the board press '0': ");
            int ch = new java.util.Scanner(System.in).nextInt();
            if(ch == 0){
                System.out.print("\nBoard is closed.");
                break;
            }
            k = (int)(Math.random() * max + 1);
            System.out.print("\nYour dice is rolling...");
            for(int i = 0; i < k; i++){
                for(int j = 0; j <= i; j++){
                    System.out.print("...."+k);
                    k = (int)(Math.random() * max + 1);
                }
                Thread.sleep(700);
            }
            System.out.print("...."+k);
            System.out.print("\nYour current dice roll value: " + k);
            pnum++;
            if(pnum%5 == 0){
                pnum++;
            }
        }
    }
}
