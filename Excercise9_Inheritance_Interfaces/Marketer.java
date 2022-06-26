/*
Write the class Marketer to accompany the other law firm classes described in this chapter. 
Marketers make $50,000 ($10,000 more than general employees),
and have an additional method called advertise that prints "Act now, while supplies last!" 
Make sure to interact with the superclass as appropriate.
 */
package Excercise9_Inheritance_Interfaces;

/**
 *
 * @author dani
 */
public class Marketer extends Employee{
    
    public Marketer(int initialYears){
        super(initialYears);
    }
    
    public double getSalary(){
        return super.getSalary()+10000;
    }
    
    public void advertise(){
        System.out.println("Act now, while supplies last!");
    }
}
