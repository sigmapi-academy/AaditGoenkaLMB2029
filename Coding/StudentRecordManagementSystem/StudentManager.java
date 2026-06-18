import java.io.*;
import java.util.*;

/**
 * Write a description of class StudentManager here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentManager
{
    private static String Path = "./StudentsFiles/";
    // Add Student
    public void addStudent(Student st, String fileName){
        try(BufferedWriter bw = new BufferedWriter(
                            new FileWriter(Path+fileName, true))){
            bw.write(st.toString());
            bw.newLine();
            System.out.print("\nStudent Added Successfully.");
        }catch(IOException ioe){
            System.err.print("\nFile is not created!");
        }
    }
    
    //Display Students
    public void displayStudents(String fileName){
        try(BufferedReader br = new BufferedReader(
                        new FileReader(Path+fileName))){
            String line;
            int count = 0;
            System.out.print("\n--------------------------------\n");
            while((line = br.readLine())!= null){
                System.out.print(line+"\n");
                count++;
            }
            System.out.print("\nNumber of records read: " + count);
        }catch(FileNotFoundException fnfe){
            System.err.print("\nFile is not present in the system.");
        }
        catch(IOException ioe){
            System.err.print("\nError reading file.");
        }
    }
    
    //Search Student
    public void searchStudent(int rollNum, String fileName){
        boolean found = false;
        try(BufferedReader br = new BufferedReader(
                        new FileReader(Path+fileName))){
            String line;
            int count = 0;
            System.out.print("\n--------------------------------\n");
            while((line = br.readLine())!= null){
                String[] data = line.split(", ");
                if(rollNum == Integer.parseInt(data[0])){
                    found = true;
                    System.out.print(line+"\n");
                    break;
                }
            }
            if(!found){
                System.out.print("\nThe given roll number didn't match!");
            }
        }catch(FileNotFoundException fnfe){
            System.err.print("\nFile is not present in the system.");
        }
        catch(IOException ioe){
            System.err.print("\nError reading file.");
        }
    }
    
    //Update marks
    public void updateMarks(int rollNum, double newMarks, String fileName){
        boolean found = false;
        ArrayList<String> records = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(
                        new FileReader(Path+fileName))){
            String line;
            int count = 0;
            System.out.print("\n--------------------------------\n");
            while((line = br.readLine())!= null){
                String[] data = line.split(", ");
                if(rollNum == Integer.parseInt(data[0])){
                    found = true;
                    data[2] = String.valueOf(newMarks);
                }
                records.add(data[0]+", " + data[1]+", " + data[2]);
            }
            if(!found){
                System.out.print("\nThe given roll number didn't match!");
            }
        }catch(FileNotFoundException fnfe){
            System.err.print("\nFile is not present in the system.");
        }
        catch(IOException ioe){
            System.err.print("\nError reading file.");
        } 
        
        try(BufferedWriter bw = new BufferedWriter(
                new FileWriter(Path+fileName))){
            for(String rec: records){
                bw.write(rec);
                bw.newLine();
            }
        }catch(IOException ioe){
            System.err.print("\nFile not created!");
        }
        
        if(found){
            System.out.print("\nMarks Updated Successfully.");
        }
        else{
            System.out.print("\nStudent record not found.");
        }
    }
    
    //Delete student
    public void deleteStudent(int rollNum, String fileName){
        boolean found = false;
        ArrayList<String> records = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(
                        new FileReader(Path+fileName))){
            String line;
            int count = 0;
            System.out.print("\n--------------------------------\n");
            while((line = br.readLine())!= null){
                String[] data = line.split(", ");
                if(rollNum == Integer.parseInt(data[0])){
                    found = true;
                    continue;
                }
                records.add(data[0]+", " + data[1]+", " + data[2]);
            }
        }catch(FileNotFoundException fnfe){
            System.err.print("\nFile is not present in the system.");
        }
        catch(IOException ioe){
            System.err.print("\nError reading file.");
        } 
        
        try(BufferedWriter bw = new BufferedWriter(
                new FileWriter(Path+fileName))){
            for(String rec: records){
                bw.write(rec);
                bw.newLine();
            }
        }catch(IOException ioe){
            System.err.print("\nFile not created!");
        }
        
        if(found){
            System.out.print("\nStudent Deleted Successfully.");
        }
        else{
            System.out.print("\nStudent record not found.");
        }
    }
}