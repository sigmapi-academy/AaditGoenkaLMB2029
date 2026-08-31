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

    public void addNodeBeforeANode(int data, int before){
        if(head==null){
            System.out.print("\nList is empty");
            return;
        }
        for(Node p = null, t = head;t!=null; t = t.getNext()){
            if(t.getData() == before){
                Node n = new Node(data);
                n.setNext(t);
                if(p == null){head = n; return;}
                p.setNext(n);
                return;
            }
            p = t;
        }
        System.out.print("\n" + before +" is not present in the list.");
    }

    public void deleteNodeAtHead(){
        if(head == null){
            System.out.print("\nList is empty!");
            return;
        }
        Node t = head; 
        System.out.print("\nDeleted Node: " + t.getData());
        head = head.getNext();
        if(head != null){
            t.setNext(null); //disconnecting the node from the list.
        }
    }

    public void deleteNodeAtEnd(){
        if(head == null){
            System.out.print("\nList is empty!");
            return;
        }
        //Case of only one node
        if(head.getNext() == null){
            System.out.print("\nDeleted Node: " + head.getData()+ "\n");
            head = null;
            return;
        }
        //Case of multiple nodes
        Node t = head;
        while(t.getNext().getNext() != null){
            t = t.getNext();
        }

        System.out.print("\nDeleted Node: " + t.getNext().getData()+"\n");
        t.setNext(null);
    }

    public void deleteANode(int data){
        if(head == null){
            System.out.print("\nList is empty!\n");
            return;
        }
        Node p = null, t = head;
        //Case of 1st node match.
        if(t!= null && t.getData() == data){
            head = head.getNext();
            System.out.print("\nDeleted node successfully.\n");
            return;

        }
        //Case is in the middle or end
        for(; t != null && t.getData() != data; t = t.getNext()){
            p = t;
        }
        if(t == null){
            System.out.print("\nNode not found.\n");
            return;
        }

        p.setNext(t.getNext());
        t.setNext(null);
        System.out.print("\nDeleted node successfully.\n");
    }
}