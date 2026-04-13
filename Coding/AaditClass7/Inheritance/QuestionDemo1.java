package Inheritance;
import java.util.*;


/**
 * Write a description of class QuestionDemo1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class QuestionDemo1
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Question q = new Question();
        q.setText("Who was the inventor of Java?");
        q.setAnswer("James Gosling");
        
        q.display();
        System.out.print("\nYour answer: ");
        String ans = sc.nextLine();
        System.out.print("\n" + q.checkAnswer(ans));
    }
}