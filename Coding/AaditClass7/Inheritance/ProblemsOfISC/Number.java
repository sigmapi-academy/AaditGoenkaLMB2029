package Inheritance.ProblemsOfISC;


/**
 * Write a description of class Number here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Number
{
    protected int n;
    
    public Number(int nn){
        n = nn;
    }
    
    public int factorial(int a){
        if(a>1){
            return a * factorial(a-1);
        }
        else{
            return 1;
        }
    }
    
    public void display(){
        System.out.print("\nn = " + n);
    }
}