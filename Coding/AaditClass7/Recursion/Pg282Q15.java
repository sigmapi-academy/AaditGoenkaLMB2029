package Recursion;

/**
 * Write a description of class Pg282Q15 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pg282Q15
{
    public static void main(String[] args){
        String[] cities = {
                "Atlanta",   // starts and ends with vowel
                "Osaka",     // starts and ends with vowel
                "Berlin",    
                "Accra",     // starts and ends with vowel
                "Denver",
                "Udaipur",   
                "Chicago",
                "Eindhoven", 
                "Dallas",
                "Amroha"   // starts and ends with vowel
            };
        printCitiesStaringAndEndingWithVowel(cities, 0);
    }
    public static void printCitiesStaringAndEndingWithVowel(String[] cities, 
    int start){
        if(start < cities.length){
            char s = cities[start].charAt(0);
            char e = cities[start].charAt(cities[start].length()-1);
            String vow = "aeiouAEIOU";
            if(vow.indexOf(s) > -1 && vow.indexOf(e) > -1){
                System.out.print("\n" + cities[start]);
            }
            printCitiesStaringAndEndingWithVowel(cities, start+1);
        }
    }
}