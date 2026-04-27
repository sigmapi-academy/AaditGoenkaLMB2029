package ExceptionHandling;


/**
 * Write a description of class ExceptionPropagation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ExceptionPropagation
{
    public void m(){
        int a = 100;
        int b = a / 0; //   Divide by zero throws ArithmeticException. 
        
    }
    
    public void n(){
        m(); // Exception is not handled here. 
    }
    
    public void p(){
        try{
            n(); // Exception propagates to here.     
        }
        catch(ArithmeticException e){
            System.err.print("\nException handled!");
        }
    }
    
    public static void main(String[] args){
        System.out.print("\f");
        ExceptionPropagation obj = new ExceptionPropagation();
        obj.p(); //   Starts the chain of method call.  
        // The line is executed only if the exception is handled properly. 
        System.out.print("\nNormal flow...");
    }
}