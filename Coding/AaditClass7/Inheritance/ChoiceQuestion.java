package Inheritance;
import java.util.*;


/**
 * Write a description of class ChoiceQuestion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ChoiceQuestion extends Question
{
    private ArrayList<String> choices;
    
    /**
     * Constructs a choice question with no choices
     */
    public ChoiceQuestion(){
        choices = new ArrayList<String>();
    }
    
    /**
     * Adds an answer choice to this question
     * @param choice the choice to add
     * @param correct true if this is the correct choice, false otherwise
     */
    public void addChoice(String choice, boolean correct){
        choices.add(choice);
        if(correct){
            setAnswer(choice);
        }
    }
    @Override
    public void display(){
        super.display();
        //Display the answer choices
        for(int i = 0; i < choices.size(); i++){
            System.out.print("\n" + (i+1) + ": " + choices.get(i));
        }
    }
}