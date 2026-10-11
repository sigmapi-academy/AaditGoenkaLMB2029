package DataStructures.StackDataStructure;

import DataStructures.LinkedListsInJava.*;
/**
 * Write a description of class LinkedStack here.
 * 	For linked list implementation:
	1. LinkedList object
	2. Push() => insertAtStart()
	3. Pop() => deleteAtStart()
	4. display()
	5. checkEmpty()
	
* Implement or write down a program using LinkedList class to implement 
* linkedstack datastructure.
 * @author (your name)
 * @version (a version number or a date)
 */
public class LinkedStack
{
    private MyLinkedList stack;
    private int count;
    public LinkedStack(){
        stack = new MyLinkedList();
    }
    
    public void push(int data){
        //write your code here
        //Update the value of count 
    }
    
    public int pop(){
        //write your code here
        //Update the value of count 
        return 0;
    }
    
    public void display(){
        //write your code here
    }
    
    public boolean isEmpty(){
        //write your code here and modify the return statement
        return false;
    }
    
    public int peek(){
        //write your code here and modify the return statement
        return 0;
    }
    
    public int numberOfElements(){
        return count;
    }
}