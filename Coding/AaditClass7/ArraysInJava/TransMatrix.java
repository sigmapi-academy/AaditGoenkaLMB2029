package ArraysInJava;

import ClassAndObjectVersion2.*;
/**
 * Write a description of class TransMatrix here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TransMatrix
{
    public void transposeMatrix(Trans t){
        t.fillarray();
        System.out.print("\nOriginal Matrix:");
        t.display();
        t.transpose();
        System.out.print("\nTransposed Matrix:");
        t.display();
    }
    
    public static void main(String args[]){
        final int size = 3;
        Trans t = new Trans(size);
        new TransMatrix().transposeMatrix(t);
        
        Trans t1 = new Trans(size+1);
        new TransMatrix().transposeMatrix(t1);
        
        Trans t2 = new Trans(size);
        new TransMatrix().transposeMatrix(t2);
    }
}