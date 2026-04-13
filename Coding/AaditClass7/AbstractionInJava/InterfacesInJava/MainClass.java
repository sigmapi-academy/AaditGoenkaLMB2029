package AbstractionInJava.InterfacesInJava;


/**
 * Write a description of class MainClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MainClass
{
    public static void main(String[] args){
        System.out.print("\f");
        Printer p = new Printer();
        p.msg();
        
        MessagePrinter mp = new MessagePrinter();
        mp.msg();
        mp.printMsg();
    }
}