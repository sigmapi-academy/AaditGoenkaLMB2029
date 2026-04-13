package Inheritance.MyVehicles;


/**
 * Write a description of class Vehicle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Vehicle
{
    private int engineNum;
    private int numberOfDoors;
    private int numberOfTyres;
    private String color;
    
    //parametrized constructor: it is used to initialize the instance variables
    public Vehicle(int engineNum, int numberOfDoors, int numberOfTyres, String color){
        this.engineNum = engineNum;
        this.numberOfDoors = numberOfDoors;
        this.numberOfTyres = numberOfTyres;
        this.color = color;
    }
    
    public void move(){
        System.out.print("\nVehicle is moving");
    }
    
    @Override
    public String toString(){
        return "[engineNum = "+ engineNum +
                    ", numberOfDoors = " + numberOfDoors +
                    ", numberOfTyres = " + numberOfTyres +
                    ", color = " + color + "]";
    }
}