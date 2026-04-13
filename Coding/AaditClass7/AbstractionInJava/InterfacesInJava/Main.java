package AbstractionInJava.InterfacesInJava;
import java.util.*;


/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args){
        ArrayList<Drawable> d = new ArrayList<>();
        System.out.print("\f");
        d.add(new Circle());
        d.add(new Triangle());
        d.add(new IsocelesTriangle());
        
        for(Drawable dr : d){
            dr.draw();
        }
    }
}