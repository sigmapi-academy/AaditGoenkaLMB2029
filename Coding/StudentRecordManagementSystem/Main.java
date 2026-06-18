import java.util.*;

/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StudentManager sm = new StudentManager();
        int choice;
        System.out.print("\f");
        do{
            System.out.print("\n==========STUDENT MANAGEMENT SYSTEM==========");
            System.out.print("\n1. Add Student"+
                            "\n2. Display Student"+
                            "\n3. Search Student" +
                            "\n4. Update Marks" +
                            "\n5. Delete Student" +
                            "\n0. Exit"+
                            "\nEnter your choice: ");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("\nEnter Roll number: ");
                    int rn = sc.nextInt();
                    sc.nextLine(); //remove keybord buffer
                    System.out.print("Enter name: ");
                    String nm = sc.nextLine();
                    System.out.print("Enter marks: ");
                    double mk = sc.nextDouble();
                    sc.nextLine(); //remove keybord buffer
                    Student st = new Student(rn, nm, mk);
                    System.out.print("Enter file name to store the record: ");
                    String fileName = sc.nextLine();
                    sm.addStudent(st, fileName);
                    break;
                case 2:
                    sc.nextLine(); //remove keybord buffer
                    System.out.print("Enter file name to display the records: ");
                    fileName = sc.nextLine();
                    sm.displayStudents(fileName);    
                    break;
                case 3:
                    System.out.print("\nEnter roll number to search: ");
                    rn = sc.nextInt();
                    sc.nextLine(); //remove keybord buffer
                    System.out.print("Enter file name to search the record: ");
                    fileName = sc.nextLine();
                    sm.searchStudent(rn, fileName);
                    break;
                case 4:
                    System.out.print("\nEnter roll number to update marks: ");
                    rn = sc.nextInt();
                    System.out.print("\nEnter new marks: ");
                    mk = sc.nextDouble();
                    sc.nextLine(); //remove keybord buffer
                    System.out.print("Enter file name to update the record: ");
                    fileName = sc.nextLine();
                    sm.updateMarks(rn, mk, fileName);
                    break;
                case 5:
                    System.out.print("\nEnter roll number to delete: ");
                    rn = sc.nextInt();
                    sc.nextLine(); //remove keybord buffer
                    System.out.print("Enter file name to delete the record: ");
                    fileName = sc.nextLine();
                    sm.deleteStudent(rn, fileName);
                    break;
                case 0:
                    System.out.print("\n\nGood Bye.");
                    return; //exit from main()
                default:
                    System.out.print("\nWrong Option Selected!");
            }
        }while(true);
    }
}