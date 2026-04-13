package AccessModifiers;


/**
 * Write a description of class Demo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Demo
{
    public static void main(String[] args){
        A ob = new A();
        //ob.x = 10;
        ob.setX(10);
        System.out.print("\nx = " + ob.getX());
    }
}