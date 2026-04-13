package AbstractionInJava.InterfacesInJava;


/**
 * Write a description of class P here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class P implements Printing
{
    @Override
    public void println(String str){
        System.out.println(str);
    }
    
    @Override
    public void print(String str){
        System.out.print(str);
    }
    
    @Override
    public void println(){
        System.out.println();
    }
    

    
}