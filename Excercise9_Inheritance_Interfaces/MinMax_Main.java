/*
this is the main class to the MinMaxAccount class, demonstrates the behaviour
 */
package Excercise9_Inheritance_Interfaces;

/**
 *
 * @author dani
 */
public class MinMax_Main {
    public static void main(String[] args){
        Startup s = new Startup(100, 50);
        MinMaxAccount acc = new MinMaxAccount(s);
        
        System.out.println("Balance: "+acc.getBalance());
        
        acc.credit(30);
        acc.debit(400);
        acc.credit(60);
        acc.credit(300);
        acc.debit(150);
        acc.credit(40);
        acc.credit(80);
        
        System.out.println("Balance: "+acc.getBalance()+", min: "+acc.getMin()+" ,max"+acc.getMax());
    }
}
