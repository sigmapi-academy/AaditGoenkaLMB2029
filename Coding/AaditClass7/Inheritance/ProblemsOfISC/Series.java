package Inheritance.ProblemsOfISC;


/**
 * Write a description of class Series here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Series extends Number
{
    private int sum;
    
    public Series(int nn){
        super(nn); //calling a super class constructor
        sum = 0;
    }
    
    public void calsum(){
        int i;
        // 'n' is protected variable in parent class
        for(i = 1; i <= n; i++){
            sum += factorial(i);
        }
    }
    
    public void display(){
        super.display(); //super class display function
        System.out.print("\n sum = " + sum);
    }
}