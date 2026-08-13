package DataStructures.LinkedListsInJava;
import java.util.*;


/**
 * Write a description of class TestMyLinkedList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestMyLinkedList
{
    public static void main(String args[]){
        System.out.print("\f");
        MyLinkedList list = new MyLinkedList();
        Scanner sc = new Scanner(System.in);
        // list.display();
        while(true){
            System.out.print("\n=========================");
            System.out.print("\n========MENU=============");
            System.out.print("\n=========================");
            System.out.print("\n1. Add node at head");
            System.out.print("\n2. Add node at end");
            System.out.print("\n3. Display linked list");
            System.out.print("\n4. Add a node after a node in the list");
            System.out.print("\n0. Exit");
            System.out.print("\nEnter your choice(0 to 3): ");
            int ch = sc.nextInt();
            System.out.print("\n=========================\n");
            switch(ch){
                case 1:
                    System.out.print("\nEnter data to add node at head: ");
                    list.addNodeAtHead(sc.nextInt());
                    break;
                case 2:
                    System.out.print("\nEnter data to add node at end: ");
                    list.addNodeAtEnd(sc.nextInt());
                    break;
                case 3:
                    list.display();
                    break;
                case 4:
                    System.out.print("\nEnter the value of data, and value of existing node: ");
                    list.addNodeAfterANode(sc.nextInt(), sc.nextInt());
                    break;
                case 0:
                    System.out.print("\nGood bye\n");
                    System.exit(ch);
                default:
                    System.out.print("\nWrong option selected!");
            }
        }
    }
}