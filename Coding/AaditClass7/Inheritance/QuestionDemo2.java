package Inheritance;
import java.util.*;


/**
 * Write a description of class QuestionDemo2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class QuestionDemo2
{
    public static void main(String args[]){
        ChoiceQuestion first = new ChoiceQuestion();
        first.setText("What was the original name of the Java language?");
        first.addChoice("7*", false);
        first.addChoice("Duke", false);
        first.addChoice("Oak", true);
        first.addChoice("Gosling", false);
        
        ChoiceQuestion second = new ChoiceQuestion();
        second.setText("In which country was the inventor of Java born?");
        second.addChoice("Australia", false);
        second.addChoice("Canada", true);
        second.addChoice("Denmark", false);
        second.addChoice("United States", false);
        
        presentQuestion(first);
        presentQuestion(second);
    }
    
    /**
     * Presents a question to the user and checks the response
     * @param q the question
     */
    
    public static void presentQuestion(ChoiceQuestion q){
        q.display();
        System.out.print("\nYour answer: ");
        String response = new Scanner(System.in).nextLine();
        System.out.print("\n" + q.checkAnswer(response));
    }
}