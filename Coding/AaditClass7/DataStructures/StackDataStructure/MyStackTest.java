package DataStructures.StackDataStructure;
import java.util.*;

/**
 * Write a description of class MyProgram here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyStackTest
{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("\f");
        int size;
        System.out.print("\nEnter the size of your stack: ");
        size = sc.nextInt();
        MyStack s = new MyStack(size);

        while(true){
            System.out.print("\n==============================");
            System.out.print("\n========Menu========");
            System.out.print("\n==============================");
            System.out.print("\n1. Push\n2. Pop\n3. Peek"+
                "\n4 Number of elements\n5 Capacity of Stack\n6 Exit"+
                "\nEnter your choice: ");
            int ch = sc.nextInt();
            switch(ch){
                case 1:
                    System.out.print("\nEnter integer value to push into Stack: ");
                    int e = sc.nextInt();
                    s.push(e);
                    break;
                case 2:
                    e = s.pop();
                    if(e == Integer.MIN_VALUE){
                        System.out.print("\nStack Underflow!");
                    }
                    else{
                        System.out.print("\nPopped element: " + e);
                    }
                    break;
                case 3:
                    e = s.peek();
                    if(e == Integer.MIN_VALUE){
                        System.out.print("\nStack is empty!");
                    }
                    else{
                        System.out.print("\nPeak element: " + e);
                    }
                    break;
                case 4:
                    System.out.print(
                        "\nNumber of elements present in the Stack: "+
                        s.numberOfElements());

                    break;
                case 5:
                    System.out.print("\nCapacity of stack: "+
                        s.capacityOfStack());
                    break;
                case 6:
                    System.out.print("\nGood bye");
                    System.exit(ch);
                default:
                    System.out.print("\nWrong menu item selected.");
            }
        }
    }
}
