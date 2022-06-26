/*
Write a class Janitor to accompany the other law firm classes described in this chapter. 
Janitors work twice as many hours per week as other employees (80 hours/week), 
they make $30,000 ($10,000 less than general employees), 
they get half as much vacation as other employees (only 5 days), 
and they have an additional method clean that prints "Workin' for the man." 
Make sure to interact with the superclass as appropriate.
 */
package Excercise9_Inheritance_Interfaces;

/**
 *
 * @author dani
 */
public class Janitor extends Employee{
    
    public Janitor(int initialYears){
        super(initialYears);
    }
    
    public int getHours(){
        return super.getHours()*2;
    }
    
    public double getSalary(){
        return super.getSalary()-10000;
    }
    
    public int getVacationDays(){
        return super.basicVacation()/2+2*super.getYears();
    }
    
    public void clean(){
        System.out.println("Workin' for the man");
    }
}
