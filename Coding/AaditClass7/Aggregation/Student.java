package Aggregation;
import java.util.*;

/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    private int rollNum;
    private Name studentName;
    private Address address;

    public Student(){
        studentName = new Name();
        address = new Address();
    }

    public void inputDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter roll number: ");
        rollNum = sc.nextInt();
        sc.nextLine(); // to remove int buffer.
        System.out.print("Enter first name: ");
        studentName.setfName(sc.nextLine());
        System.out.print("Enter middle name: ");
        studentName.setmName(sc.nextLine());
        System.out.print("Enter surname name: ");
        studentName.setsName(sc.nextLine());

        System.out.print("\nEnter the details of Address: ");
        System.out.print("\nEnter street name: ");
        address.setStreetName(sc.nextLine());
        System.out.print("Enter state: ");
        address.setState(sc.nextLine());
        System.out.print("Enter pincode: ");
        address.setPincode(sc.nextLine());
        System.out.print("Enter your city or village: ");
        address.setCityOrVillage(sc.nextLine());
        System.out.print("Enter your house name or building name: ");
        address.setHouseNameOrBuildingName(sc.nextLine());
    }

    @Override
    public String toString(){
        return "\nName: "+studentName.toString() + 
        "\nAddress: \n" + address.toString();
    }
}