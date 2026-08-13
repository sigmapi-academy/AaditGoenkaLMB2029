package DataStructures.LinkedListsInJava;


/**
 * Write a description of class MyLinkedList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyLinkedList
{
    private Node head;
    
    public MyLinkedList(){
        head = null;
    }
    
    public void display(){
        System.out.print("\nLinked list: ");
        for(Node t = head; t != null; t = t.getNext()){
            System.out.print(t);
        }
        System.out.print("null\n");
        
    }
    
    public void addNodeAtHead(int data){
        Node n = new Node(data);
        if(head == null){
            head = n;
        }
        else{
            n.setNext(head);
            head = n;
        }
    }
    
    public void addNodeAtEnd(int data){
        Node n = new Node(data);
        if(head == null){
            head = n;
        }
        else{
            Node t = head;
            //loop used to point the last node of the linked list
            for(;t.getNext()!= null; t = t.getNext());
            
            t.setNext(n); //attaching the node at end;
        }
    }
    
    public void addNodeAfterANode(int data, int after){
        if(head == null){
            System.out.print("\nList is empty");
            return; //exit from the method
        }
        for(Node t = head; t!= null; t = t.getNext()){
            if(t.getData() == after){
                Node n = new Node(data);
                n.setNext(t.getNext());
                t.setNext(n);
                return ; //exit from the method
            }
            
        }
        System.out.print("\n"+ after +" is not present in the list.");
        
    }
    
    public void addNodeBeforeAnode(int data, int before){
        
    }
}