package Chapter2;
import java.util.*;


/**
 * Write a description of class InputDemo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class InputDemo
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("\fEnter a boolean value(true/false): ");
        boolean b = sc.nextBoolean();
        System.out.print("Enter a byte value: ");
        byte y = sc.nextByte();
        System.out.print("Enter a short value: ");
        short s = sc.nextShort();
        System.out.print("Enter a int value: ");
        int i = sc.nextInt();
        System.out.print("Enter a long value: ");
        long l = sc.nextLong();
        System.out.print("Enter a float value: ");
        float f = sc.nextFloat();
        System.out.print("Enter a double value: ");
        double d = sc.nextDouble();
        System.out.print("Enter a char value: ");
        char c = sc.next().charAt(0);
        System.out.print("Enter any word: ");
        String word = sc.next();
        System.out.print("Enter any sentence: ");
        sc.nextLine(); //this statement will remove keyboard buffer jam
        String sent = sc.nextLine();
        
        System.out.print("\n b = " + b+
        "\n y = " + y +
        "\n s = " + s +
        "\n i = " + i +
        "\n l = " + l +
        "\n f = " + f +
        "\n d = " + d +
        "\n c = " + c + 
        "\n word = " + word +
        "\n sent = " + sent);
    }
}