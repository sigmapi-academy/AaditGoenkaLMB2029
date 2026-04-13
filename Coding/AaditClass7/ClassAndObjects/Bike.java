package ClassAndObjects;

/**
 * Write a description of class Bike here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bike
{
    // instance variables - replace the example below with your own
    private int regNum;
    private int chasisNum;
    private String manufName;
    /**
     * Constructor for objects of class Bike
     */
    public Bike() //Default constructor
    {
        // initialise instance variables
        regNum = 0;
        chasisNum = 0;
    }

    /**
     * Parameterized constructor
     * @param  rn  a registration number
     * @param cn a chasis number
     * @param mn a manufacturer name
     */
    
    public Bike(int rn, int cn, String mn){
        regNum = rn;
        chasisNum = cn;
        manufName = mn;
    }
    /**
     * @return returns String format of the given object.
     */
    @Override
    public String toString(){
        return "[regNum = " + regNum + ", chasisNum = " + chasisNum +
        ", manufName = " + manufName + "]";
    }
}
