package AbstractionInJava;


/**
 * Write a description of class Polygon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Polygon
{
    public abstract void draw(); //prototype of the method
    
    public void display(){
        System.out.print("\nThis is a polygon.");
    }
}