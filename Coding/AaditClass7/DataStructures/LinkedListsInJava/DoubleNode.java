package DataStructures.LinkedListsInJava;


/**
 * Write a description of class NodeWithDoubleRef here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DoubleNode
{
    private int Data;
    private DoubleNode prev, next;
    
    public DoubleNode(int data){
        this.Data = data;
        this.prev = this.next = null;
    }
    
    public int getData(){
        return Data;
    }
    
    public DoubleNode getPrevious(){
        return prev;
    }
    
    
    public DoubleNode getNext(){
        return next;
    }
    
    public DoubleNode getCurrentNode(){
        return this;
    }
    
    public void setNext(DoubleNode node){
        this.next = node;
    }
    
    public void setPrev(DoubleNode node){
        this.prev = node;
    }
    
    public void setData(int data){
        this.Data = data;
    }
    
    @Override
    public String toString(){
        return "==>"+Data;
    }
}