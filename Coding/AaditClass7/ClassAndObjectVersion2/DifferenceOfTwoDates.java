package ClassAndObjectVersion2;
import java.util.*;


/**
 * Write a description of class DifferenceOfTwoDates here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DifferenceOfTwoDates
{
    public int numOfDays(String dt1, String dt2){
        int nod = 0;
        int year, month, dayOfMonth;
        int indx = dt1.indexOf("-");
        dayOfMonth = Integer.parseInt(dt1.substring(0, indx));
        int lstIndx = dt1.lastIndexOf("-");
        month = Integer.parseInt(dt1.substring(indx+1, lstIndx));
        year = Integer.parseInt(dt1.substring(lstIndx+1));
        
        
        int year1, month1, dayOfMonth1;
        indx = dt2.indexOf("-");
        dayOfMonth1 = Integer.parseInt(dt2.substring(0, indx));
        lstIndx = dt2.lastIndexOf("-");
        month1 = Integer.parseInt(dt2.substring(indx+1, lstIndx));
        year1 = Integer.parseInt(dt2.substring(lstIndx+1));
        
        int m[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if(year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)){
            m[2] = 29;
        }
        
        for(; !(dayOfMonth == dayOfMonth1 && month == month1 && year == year1);nod++){
            dayOfMonth++;
            if(dayOfMonth > m[month]){
                dayOfMonth = 1;
                month++;
                if(month > 12){
                    month = 1;
                    year++;
                }
            }
        }
        return nod;
    }
}