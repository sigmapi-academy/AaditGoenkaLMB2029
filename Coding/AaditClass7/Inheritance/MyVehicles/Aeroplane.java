package Inheritance.MyVehicles;

/**
 * Write a description of class Aeroplane here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Aeroplane extends Vehicle
{
    private String typeOfAeroplane;

    public Aeroplane(int engineNum, int numOfTyres, int numOfDoors, String color, 
    String typeOfAeroplane){
        super(engineNum, numOfTyres, numOfDoors, color);
        this.typeOfAeroplane = typeOfAeroplane;
    }
    
    @Override
    public String toString(){
        return super.toString() + "[ typeOfAeroplane = " + typeOfAeroplane + "]"; 
    }
    
    
    @Override
    public void move(){
        System.out.print("\nAeroplane is moving");
    }
}