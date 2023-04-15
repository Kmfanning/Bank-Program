/**
 * Name: Kenzie Fanning
 * File: CheckingAccount
 * Description: This class holds the details of CheckingAccount
 */
import java.util.Date;
public class CheckingAccount {
    //instance variables
    private String Unique_ID;
    private double Acct_Balance;
    private Date Date_Created;
    private double Annual_InterestRate;
    //default constructor assigns the default values to data members
    public CheckingAccount() {
        Unique_ID ="12345";
        Acct_Balance =500;
        Date_Created =new Date();
        Annual_InterestRate =0.0;
    }
    //parameterized constructor
    public CheckingAccount(String uniqueID,double balance,double interestRate) {
        this.Unique_ID =uniqueID;
        this.Acct_Balance =balance;
        Date_Created =new Date();
        this.Annual_InterestRate =interestRate;
    }
    //getter and setter methods
    public String GetUnique_ID() {
        return Unique_ID;
    }
    public double GetAcct_Balance() {
        return Acct_Balance;
    }
    public Date GetDate_Created() {
        return Date_Created;
    }
    public void setUnique_ID(String unique_ID) {
        this.Unique_ID = unique_ID;
    }
    public void setAcct_Balance(double acct_Balance) {
        this.Acct_Balance = acct_Balance;
    }
    public double getAnnual_InterestRate() {
        return Annual_InterestRate;
    }
    public void setAnnual_InterestRate(double annual_InterestRate) {
        this.Annual_InterestRate = annual_InterestRate;
    }
    public void depositCash(double amount) {
        this.Acct_Balance +=amount;
    }
    public double getDailyIntRate() {
        return this.Acct_Balance *((Annual_InterestRate /100)/365.0);
    }

    public String toString() {
        return "Account Unique ID: "+ GetUnique_ID()+"\nAccount Creation Date/Time: "+ GetDate_Created()+"\n"+String.format("Balance: $ %.2f", GetAcct_Balance())+"\n"+String.format("Your Daily Interest Amount is : $ %.2f",getDailyIntRate());
    }


}
