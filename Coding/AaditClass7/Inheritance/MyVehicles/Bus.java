package Inheritance.MyVehicles;


/**
 * Write a description of class Bus here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bus extends Vehicle
{
    private String typeOfBus;
    
    public Bus(int engineNum, int numOfTyres, int numOfDoors, String color, String typeOfBus){
        super(engineNum, numOfTyres, numOfDoors, color); //calling parent class constructor.
        this.typeOfBus = typeOfBus;
    }
    
    @Override
    public String toString(){
        return super.toString()+"[ typeOfBus = " + typeOfBus + "]";
    }
    
    
    @Override
    public void move(){
        System.out.print("\nBus is moving");
    }
}