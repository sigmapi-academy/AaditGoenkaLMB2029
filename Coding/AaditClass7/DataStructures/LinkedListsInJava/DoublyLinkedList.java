package DataStructures.LinkedListsInJava;


/**
 * Write a description of class DoublyLinkedList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DoublyLinkedList
{
    private DoubleNode head, tail;
    
    public DoublyLinkedList(){
        System.out.print("\nMemory is allocated for Doubly Linked list.");
        head = tail = null;
    }
    
    public void insertNodeAtHead(int data){
        DoubleNode newNode = new DoubleNode(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        head.setPrev(newNode);
        newNode.setNext(head);
        head = newNode;
    }
    
    public void traverseFromHead(){
        if(head == null){
            System.out.print("\nList is empty!");
            return;
        }
        System.out.print("\nList traversal from start: \n");
        for(DoubleNode t = head;t != null; t = t.getNext()){
            System.out.print(t);
        }
        System.out.print("\n");
    }
    //backward traversing
    public void traverseFromTail(){
        //write your code here
    }
}