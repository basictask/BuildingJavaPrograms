/*
Classes used: Client.java, FAccount.java, Transaction.java
 */
package Excercise9_Inheritance_Interfaces;

/**
 *
 * @author dani
 */
import java.util.*;
public class FAccount_Main {
    public static void main(String[] args){
        Random r = new Random();
        Client c = new Client(1);
        FAccount acc = new FAccount(c);
       
        for(int i=0; i<10; i++){
            int n = -5 + r.nextInt(10);
            Transaction a = new Transaction(n);
            System.out.println(a.getValue());
            acc.process(a);
        }
        
        System.out.println();
        System.out.println("After 10 transactions, your balance is: "+acc.getBalance());;
        System.out.println("Filtered transactions: "+acc.percentFiltered()+"%");
    }
}
