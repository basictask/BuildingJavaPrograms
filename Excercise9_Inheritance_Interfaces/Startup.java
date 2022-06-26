/*

 */
package Excercise9_Inheritance_Interfaces;

/**
 *
 * @author dani
 */
public class Startup {
    private int credit;
    private int debit;
    
    public Startup(int c, int d){
        this.credit = c;
        this.debit = d;
    }
    
    public int getCredit(){
        return this.credit;
    }
    
    public int getDebit(){
        return this.debit;
    }
}
