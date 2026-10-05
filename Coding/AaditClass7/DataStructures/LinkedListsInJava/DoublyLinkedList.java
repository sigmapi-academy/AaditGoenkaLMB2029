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

    public void insertNodeAtTail(int data){
        //
        DoubleNode t = new DoubleNode(data);
        if(head==null){
            head = t;
            tail = t;
        }
        else{
            tail.setNext(t);
            t.setPrev(tail);
            tail = t;
        }

    }

    public void insertNodeAfterANode(int node, int data){
        //insert the new node after the node.
        if(head == null){
            System.out.print("List is Empty ");
        }
        else{
            for(DoubleNode t = head; t!=null; t=t.getNext()){
                if(t.getData() == node){                   
                    if(t.getNext() ==null){ //case of last node
                        insertNodeAtTail(data);
                        return;
                    } 
                    DoubleNode n = new DoubleNode(data);
                    n.setPrev(t);
                    n.setNext(t.getNext());
                    n.getNext().setPrev(n);
                    t.setNext(n);
                    return;
                }
            }
            System.out.print("\nNode Not Present in the List ");
        }
    }

    public void insertNodeBeforeANode(int node, int data){
        //insert the new node before the node.
        if(head == null){
            System.out.print("List is Empty ");
        }
        else{
            for(DoubleNode t = head; t!=null; t=t.getNext()){
                if(t.getData() == node){                
                    if(t.getPrevious() ==null){
                        insertNodeAtHead(data);
                        return;
                    }  
                    DoubleNode n = new DoubleNode(data);   
                    n.setNext(t);
                    n.setPrev(t.getPrevious());
                    t.getPrevious().setNext(n);
                    t.setPrev(n);
                    return;
                }
            }
            System.out.print("\nNode Not Present in the List ");
        }

    }

    public void deleteFromHead(){
        if(head == null){
            System.out.print("\nList is Empty ");
        }
        if(head == tail){ //case of 1-node
            System.out.print("\nNode Deleted Successfully : " + head.getData());
            head = tail = null;
        }
        else{
            System.out.print("\nNode Deleted Successfully : " + head.getData());
            head = head.getNext();
            head.getPrevious().setNext(null);
            head.setPrev(null); 

        }
    }

    public void deleteFromTail(){
        if(tail == null){
            System.out.print("\nList is Empty ");
        }
        if(head == tail){ //case of 1-node
            System.out.print("\nNode Deleted Successfully : " + head.getData());
            head = tail = null;
        }
        else{
            System.out.print("\nNode Deleted Successfully : " + tail.getData());
            tail = tail.getPrevious();
            tail.getNext().setPrev(null);
            tail.setNext(null);
        }
    }

    public void deleteAGivenNode(int node){
        // if node is present then delete it
        if(head == null){
            System.out.print("\nList is Empty ");
        }
        else{
            for(DoubleNode t = head;t!=null;t= t.getNext()){
                if(t.getData() == node){
                    if(t.getPrevious() == null){
                        deleteFromHead();
                    }
                    else if(t.getNext() == null){
                        deleteFromTail();
                    }
                    else{
                        System.out.print("\nNode Deleted Successfully : " + t.getData());
                        t.getPrevious().setNext(t.getNext());
                        t.getNext().setPrev(t.getPrevious());
                        t.setPrev(null);
                        t.setNext(null);
                    }
                    return;
                }
            }
            System.out.print("\nNode Not Present ");
        }
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
        if(tail == null){
            System.out.print("\nList is empty ");
            return;
        }
        System.out.print("\nList traversal from tail: \n");
        for(DoubleNode t = tail;t != null; t = t.getPrevious()){
            System.out.print(t);
        }
        System.out.print("\n");
    }
}