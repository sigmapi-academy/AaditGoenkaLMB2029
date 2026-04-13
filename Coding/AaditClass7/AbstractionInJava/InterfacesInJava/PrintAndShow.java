package AbstractionInJava.InterfacesInJava;


/**
 * Write a description of class PrintAndShow here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PrintAndShow implements Showable
{
    @Override
    public void show(){
        System.out.print("\nHello, ");
    }
    
    @Override
    public void print(){
        System.out.print("\nWelcome!");
    }
    
    public static void main(String[] args){
        System.out.print("\f");
        PrintAndShow ps = new PrintAndShow();
        ps.print();
        ps.show();
    }
}