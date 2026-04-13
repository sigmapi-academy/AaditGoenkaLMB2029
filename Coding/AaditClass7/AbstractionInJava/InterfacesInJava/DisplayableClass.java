package AbstractionInJava.InterfacesInJava;


/**
 * Write a description of class DisplayableClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
//factory class
public class DisplayableClass implements Displayable
{
    //factory method use to create instances of Abstract types or Interfaces
    public static Displayable createObject(){
        return new DisplayableClass();
    }
}