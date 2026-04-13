package AbstractionInJava;
import java.util.*;


/**
 * Write a description of class Main1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main1
{
    public static void main(String[] args){
        System.out.print("\f");
        Triangle t1 = new Triangle();
        Square sq1 = new Square();
        Pentagon p1 = new Pentagon();
        
        Polygon p = t1; //assigning the reference of Triangle object t1 in p
        p.draw(); //it will call Triangle class draw() method
        
        p = sq1; //assigning the reference of Square object sq1 in p
        p.draw(); //it will call Square class draw() method
        
        p = p1; //assigning the reference of Pentagon object p1 in p
        p.draw(); //it will call Pentagon class draw() method
        
        Polygon pa[] = {t1, sq1, p1};
        System.out.print("\n=======================");
        for(Polygon pq : pa){
            pq.draw(); //depending upon the reference it will call the draw method
            pq.display(); //calling non-abstract method
        }
    }
}