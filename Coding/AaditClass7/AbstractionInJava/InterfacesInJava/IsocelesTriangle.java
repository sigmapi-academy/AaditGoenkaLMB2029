package AbstractionInJava.InterfacesInJava;

/**
 * Write a description of class IsocelesTriangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class IsocelesTriangle extends Triangle
{
    @Override
    public void draw(){
        System.out.print("\nCalling super class method from IsocelesTriangle"+
            "class draw()...");
        super.draw();
        System.out.print("\nDrawing Isoceles Triangle...");
    }
}