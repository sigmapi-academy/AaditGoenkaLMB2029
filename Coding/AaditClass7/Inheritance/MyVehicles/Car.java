package Inheritance.MyVehicles;


/**
 * Write a description of class Car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Car extends Vehicle
{
    private String typeOfCar;
    
    public Car(int engineNum, int numOfTyres, int numOfDoors, String color, String typeOfCar){
        super(engineNum, numOfTyres, numOfDoors, color);
        this.typeOfCar = typeOfCar;
    }
    
    @Override
    public String toString(){
        return super.toString() + "[ typeOfCar = " + typeOfCar + "]";
    }
    
    @Override
    public void move(){
        System.out.print("\nCar is moving");
    }
}