/*
MinMaxAccount . A company has written a large class BankAccount with many methods including:

public BankAccount(Startup s) 
Constructs a BankAccount object using information in s

public void debit(Debit d) 
Records the given debit

public void credit(Credit c) 
Records the given credit

public int getBalance() 
Returns the current balance in pennies

Design a new class MinMaxAccount whose instances can be used in place of a bank account but include new behavior
of remembering the minimum and maximum balances ever recorded for the account. 
The class should have a constructor that accepts a Startup parameter. 
The bank account’s constructor sets the initial balance on the basis of the startup information. 
Assume that only debits and credits change an account’s balance. 
Include these new methods in your class:

public int getMin()
public int getMax()

Returns the minimum balance in pennies
Returns the maximum balance in pennies
 */
package Excercise9_Inheritance_Interfaces;

/**
 *
 * @author dani
 */
public class MinMaxAccount {
    private int credit;
    private int debit;
    private int min;
    private int max;
    
    public MinMaxAccount(Startup s){
        this.credit = s.getCredit();
        this.debit = s.getDebit();
        this.max = this.getBalance();
        this.min = this.getBalance();
    }
    
    public int getBalance(){
        return this.credit - this.debit;
    }
    
    public void credit(int c){
        this.credit += c;
        
        if(this.getBalance()>this.max){
            this.max = this.getBalance();
        }else if(this.getBalance()<this.min){
            this.min = this.getBalance();
        }
    }
    
    public void debit(int d){
        this.debit += d;
        
        if(this.getBalance()>this.max){
            this.max = this.getBalance();
        }else if(this.getBalance()<this.min){
            this.min = this.getBalance();
        }
    }
    
    public int getMin(){
        return this.min;
    }
    
    public int getMax(){
        return this.max;
    }
}
