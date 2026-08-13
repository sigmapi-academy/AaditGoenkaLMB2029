package DataStructures.LinkedListsInJava;


/**
 * Write a description of class Node here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Node
{
    private int data;
    private Node next;
    
    public Node(int data){
        this.data = data;
        next = null;
    }
    
    public int getData(){
        return data;
    }
    
    public void setData(int data){
        this.data = data;
    }
    
    public void setNext(Node n){
        this.next = n;
    }
    /**
     * @return Returns the next node reference
     */
    public Node getNext(){
        return next;
    }
    
    public String toString(){
        return "==>"+data+" ";
    }
}