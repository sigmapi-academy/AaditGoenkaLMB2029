package AbstractionInJava.InterfacesInJava;


/**
 * Write a description of class Printer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Printer implements Messageable
{
    @Override
    public void msg(){
        System.out.print("\nThis is outer interface method.\n");
    }
}