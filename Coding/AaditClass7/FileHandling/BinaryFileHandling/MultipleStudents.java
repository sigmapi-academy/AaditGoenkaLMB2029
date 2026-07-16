package FileHandling.BinaryFileHandling;
import java.util.*;


/**
 * Write a description of class MultipleStudents here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MultipleStudents
{
    public static void main(String args[]){
        ArrayList<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int rn;
        String name, ch;
        double marks;
        System.out.print("\f");
        do{
            System.out.print("Enter roll number: ");
            rn = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter name: ");
            name = sc.nextLine();
            System.out.print("Enter marks: ");
            marks = sc.nextDouble();
            list.add(new Student(rn, name, marks));
            System.out.print("Enter Y/y for more records: ");
            ch = sc.next();
        }while(ch.equalsIgnoreCase("Y"));
        sc.nextLine();
        System.out.print("\nEnter File name: ");
        String fileName = sc.nextLine();
        StudentOperation so = new StudentOperation();
        so.writeMultipleObjects(fileName, list);
        
        so.readMultipleObjects(fileName);
    }
}