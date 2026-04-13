package AbstractionInJava.InterfacesInJava;


/**
 * Write a description of interface Displayable here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface Displayable
{
    static void print(String str){
        System.out.print(str);
    }
    
    static void println(String str){
        System.out.println(str);
    }
    
    static void println(){
        System.out.println();
    }
    
    default void msg(){
        System.out.print("\nThis displayable interface is designed during Aadit's class.");
    }
}