package ClassAndObjects;

/**
 * Write a description of class Account here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Account
{
    //Fields or instance variables
    private int acc_num;
    private String name;
    private float amount;

    //Constructor
    Account(int anum, String nm, float amt){
        acc_num = anum;
        name = nm;
        amount = amt;
    }

    //Getter and Setter methods
    /**
     * @return the acc_num
     */
    public int getAcc_num() {
        return acc_num;
    }

    /**
     * @param acc_num the acc_num to set
     */
    public void setAcc_num(int acc_num) {
        this.acc_num = acc_num;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the amount
     */
    public float getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(float amount) {
        this.amount = amount;
    }

    /**
     * @param amount updates the amount field.
     */
    public void deposit(float amount){
        this.amount += amount;
    }
    
    /**
     * @param amount reduces the amount field.
     */
    public void withdraw(float amount){
        if (amount > this.amount){
            System.out.print("\nInsufficient Balance.");
            return;
        }
        this.amount -= amount; //withdraw amount
    }
}