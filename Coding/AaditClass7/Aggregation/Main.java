package Aggregation;


/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args){
        System.out.print("\f");
        int numOfStudents = Integer.parseInt(args[0]);
        Student[] st = new Student[numOfStudents];
        int i;
        for(i = 0; i < numOfStudents; i++){
            //allocating the memory for the object
            st[i] = new Student();
            st[i].inputDetails(); //we insert details of the student
        }
        
        //printing the details of each student
        for(Student s : st){
            System.out.print("\n" + s);
        }
    }
}