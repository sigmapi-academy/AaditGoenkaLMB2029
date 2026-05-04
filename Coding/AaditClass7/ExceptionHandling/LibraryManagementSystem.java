package ExceptionHandling;
import java.util.*;

/**
 * 10. Write a Java program to simulate a library management system. 
 * The system should allow issuing and returning books. 
 * Handle exceptions when:
 * • A book is not available
 * • The user enters an invalid book ID
 * • The member ID is incorrect
 * • The return date exceeds the due dateUse custom exceptions,
 *      try-catch-finally, and proper exception messages.
 *      
 * @author (your name)
 * @version (a version number or a date)
 */
public class LibraryManagementSystem
{
    //it will create single copy of the variable used by every object or
    //method
    static Scanner sc = new Scanner(System.in);
    static int bookIDs[] = {101, 102, 103, 104, 105};
    static int memberIDs[] = {1, 2, 3, 4, 5};
    static boolean isIssued[] = {false, false, false, false, false};

    //Validate Book ID
    static int getBookIndex(int bookID)throws InvalidBookIDException{
        for(int i = 0; i < bookIDs.length; i++){
            if(bookIDs[i] == bookID){
                return i;
            }
        }
        throw new InvalidBookIDException("Invalid book ID!");
    }

    //Validate member ID
    static int validateMemberIndex(int memberID) throws InvalidMemberIDException{
        for(int i = 0; i < memberIDs.length; i++){
            if(memberIDs[i] == memberID){
                return i;
            }
        }
        throw new InvalidMemberIDException("Invalid Member ID!");
    }

    //Issue Book
    static void issueBook(){
        try{
            System.out.print("\nEnter Bood ID: ");
            int bookId = sc.nextInt();
            System.out.print("Enter Member ID: ");
            int memberID = sc.nextInt();
            int index = getBookIndex(bookId);
            int memIndex = validateMemberIndex(memberID);
            if(isIssued[index]){
                throw new BookNotAvailableException("Book already issued!");
            }

            isIssued[index] = true;
            System.out.print("\nBook issued Successfully!");
        }
        catch(Exception e){
            System.err.print("\n" + e.getMessage());
        }
        finally{
            System.out.print("\n----Issue operation completed----\n");
        }
    }

    //Return Book
    static void returnBook(){
        try{
            System.out.print("\nEnter Book ID: ");
            int bookID = sc.nextInt();
            System.out.print("Enter days taken: ");
            int days = sc.nextInt();

            int index = getBookIndex(bookID);

            if(!isIssued[index]){
                throw new BookNotAvailableException("\nBook was not issued!");
            }

            if(days > 7){
                throw new LateReturnException("\n Late return! Fine applicable!");
            }

            isIssued[index] = false;
            System.out.print("\nBook returned successfully!");
        }
        catch(Exception e){
            System.err.print("\n"+e.getMessage());
        }
        finally{
            System.out.print("\n------Return Operation Completed------\n");
        }
    }

    //Display Books
    static void displayBooks(){
        System.out.print("\nBook Status: ");
        for(int i = 0; i < bookIDs.length; i++){
            System.out.print("\nBook ID: " + bookIDs[i] + 
                " | Issued: " + isIssued[i]);
        }
        System.out.print("\n");
    }
    
    public static void main(String[] args){
        int choice = 0;
        System.out.print("\f");
        do{
            System.out.print("\n====== Library Menu =====");
            System.out.print("\n1. Issue Book");
            System.out.print("\n2. Return Book");
            System.out.print("\n3. Display Book");
            System.out.print("\n0. Exit");
            System.out.print("\nEnter choice: ");
            try{
                choice = sc.nextInt();
                switch(choice){
                    case 1:
                        issueBook();
                        break;
                    case 2:
                        returnBook();
                        break;
                    case 3:
                        displayBooks();
                        break;
                    case 0:
                        System.out.print("\nExiting....");
                        break;
                    default:
                        System.out.print("\nInvalid Choice!");
                }
            }
            catch(InputMismatchException e){
                System.err.print("\nPlease enter nnumeric input!");
                sc.nextLine(); //clear buffer
            }
        }while(choice != 0);
    }
}

class BookNotAvailableException extends Exception{
    public BookNotAvailableException(String msg){
        super(msg);
    }
}

class InvalidBookIDException extends Exception{
    public InvalidBookIDException(String msg){
        super(msg);
    }
}

class InvalidMemberIDException extends Exception{
    public InvalidMemberIDException(String msg){
        super(msg);
    }
}

class LateReturnException extends Exception{
    public LateReturnException(String msg){
        super(msg);
    }
}