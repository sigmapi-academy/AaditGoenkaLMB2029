package AbstractionInJava.InterfacesInJava;


/**
 * Write a description of class MyPrint here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyPrint extends AbstractPrinting 
{
    @Override
    public void print(){
        System.out.print("\nThis is AbstractPrinting.\n");   
    }
}