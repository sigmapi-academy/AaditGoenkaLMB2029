package Inheritance;


/**
 * Write a description of class Question here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
/**
 * A question with a text and an answer
 */
public class Question
{
    private String text;
    private String answer;
    
    /**
     * Constructs a question with empty question and answer
     */
    public Question(){
        text = answer = "";
    }
    
    /**
     * Sets the question text
     * @param questionText the of this question
     */
    public void setText(String questionText){
        text = questionText;
    }
    
    /**
     * Sets the answer for this question
     * @param correctResponse the answer
     */
    public void setAnswer(String correctResponse){
        answer = correctResponse;
    }
    
    /**
     * Checks a given response for correctness
     * @param response the response to check
     * @return true if the response was correct, false otherwise
     */
    public boolean checkAnswer(String response){
        return response.equalsIgnoreCase(answer);
    }
    
    /**
     * Display this question
     */
    public void display(){
        System.out.print("\n" + text);
    }
}