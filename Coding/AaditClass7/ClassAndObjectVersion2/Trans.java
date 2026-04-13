package ClassAndObjectVersion2;
import java.util.*;

/**
 * Write a description of class Trans here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Trans
{
    private int arr[][], m;
    /**
     * Parameterized constructor
     * @param mm Dimension of Square Matrix
     */
    public Trans(int mm){
        m = mm;
        arr = new int[m][m];
    }
    
    /**
     * This method will take data input in the matrix of this object.
     */
    public void fillarray(){
        Scanner sc = new Scanner(System.in);
        int i, j;
        for(i = 0; i < m; i++){
            for(j = 0; j < m; j++){
                System.out.print("Enter integer value in arr["+i+"]["+j+"]: ");
                arr[i][j] = sc.nextInt();
            }
        }
    }
    
    /**
     * Call to this method will transpose the matrix in this object.
     */
    public void transpose(){
        int i, j, t;
        for(i = 0; i < m; i++){
            for(j = i + 1; j < m; j++){
                t = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = t;
            }
        }
    }
    /**
     * It displays the matrix of this object.
     */
    public void display(){
        int i, j;
        System.out.print("\n");
        for(i = 0; i < m; i++){
            for(j = 0; j < m; j++){
                System.out.print("\t"+arr[i][j]);
            }
            System.out.print("\n");
        }
    }
}