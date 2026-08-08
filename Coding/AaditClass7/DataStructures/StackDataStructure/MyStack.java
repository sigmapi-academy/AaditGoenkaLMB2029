package DataStructures.StackDataStructure;


/**
 * Write a description of class MyStack here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyStack
{
    private int stack[];
    private int top, count, capacity;
    
    public MyStack(int size){
        capacity = size;
        stack = new int[capacity];
        top = -1; //Because initially there are no elements in the stack
        count = 0;
    }
    
    public MyStack(){
        this(10);
    }
    
    public void push(int ele){
        if(isFull()){
            System.out.print("\nStack overflow!");
            return;
        }
        stack[++top] = ele;
        count++;
    }
    
    public boolean isFull(){
        return top == capacity - 1;
    }
    
    /**
     * @return number of elements present in the current MyStack object
     */
    public int numberOfElements(){
        return count;
    }
    
    public int pop(){
        if(isEmpty()){
            return Integer.MIN_VALUE;    
        }
        int v = stack[top--];
        count--;
        return v;
    }
    
    public int peek(){
        if(isEmpty()){
            return Integer.MIN_VALUE;
        }
        
        return stack[top];
    }
    
    public boolean isEmpty(){
        return top == -1;
    }
    
    public int capacityOfStack(){
        return capacity;
    }
}