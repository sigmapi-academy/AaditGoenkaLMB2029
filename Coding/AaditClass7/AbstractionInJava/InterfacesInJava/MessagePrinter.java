package AbstractionInJava.InterfacesInJava;


/**
 * Write a description of class MessagePrinter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MessagePrinter implements Messageable.PrintableMessage
{
    //nested or inner interface methods
    @Override
    public void printMsg(){
        System.out.print("\nThis printMsg() is nested interface method.\n");    
    }
    
    @Override
    public void msg(){
        System.out.print("\nThis msg() is nested interface method.\n");
    }
}