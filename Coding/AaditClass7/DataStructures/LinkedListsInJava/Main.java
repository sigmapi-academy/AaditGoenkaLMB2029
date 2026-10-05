package DataStructures.LinkedListsInJava;

import java.util.*;

/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int data, node;
        DoublyLinkedList obj = new DoublyLinkedList();
        for(;;){
            System.out.print("\n===================================" + 
                "\nChoose A Following Option : " +
                "\n1. Insert Node At Head " +
                "\n2. Insert Node At End " + 
                "\n3. Insert Node After A Node " +
                "\n4. Insert Node Before A Node " +
                "\n5. Delete Node At Head " +
                "\n6. Delete Node At End " +
                "\n7. Delete A Given Node " +
                "\n8. Traverse From Head " +
                "\n9. Traverse From Tail " + 
                "\n10. Exit " + 
                "\n==================================\n\n");
            int ch = sc.nextInt();
            switch(ch){
                case 1:
                    System.out.print("\nEnter Data to be Inserted At Head: ");
                    data = sc.nextInt();
                    obj.insertNodeAtHead(data);
                    break;
                case 2:
                    System.out.print("\nEnter Data to be Inserted At End: ");
                    data = sc.nextInt();
                    obj.insertNodeAtTail(data);
                    break;
                case 3:
                    System.out.print("\nEnter Data to be Inserted : ");
                    data = sc.nextInt();
                    System.out.print("\nEnter the Data After which it will be Inserted : ");
                    node = sc.nextInt();
                    obj.insertNodeAfterANode(node, data);
                    break;
                case 4:
                    System.out.print("\nEnter Data to be Inserted : ");
                    data = sc.nextInt();
                    System.out.print("\nEnter the Data Before which it will be Inserted : ");
                    node = sc.nextInt();
                    obj.insertNodeBeforeANode(node, data);
                    break;
                case 5:
                    obj.deleteFromHead();
                    break;
                case 6:
                    obj.deleteFromTail();
                    break;
                case 7:
                    System.out.print("\nEnter Data to be Deleted : ");
                    data = sc.nextInt();
                    obj.deleteAGivenNode(data);
                    break;
                case 8:
                    obj.traverseFromHead();
                    break;
                case 9:
                    obj.traverseFromTail();
                    break;
                case 10:
                    System.exit(0);

            }
        }
    }
}
