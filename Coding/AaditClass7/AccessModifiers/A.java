package AccessModifiers;


/**
 * Write a description of class A here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class A
{
    /*private class nestedA{
        private nestedA(){
            
        }
    }*/
    
    private int x;
    
    //private A(){} //private constructor
    public void msg(){
        System.out.print("\nHello!");
    }
    
    protected void display(){ 
        System.out.print("\nHello! from display");
    }
    
    public int getX(){
        return x;
    }
    
    public void setX(int x){
        this.x = x;
    }
}