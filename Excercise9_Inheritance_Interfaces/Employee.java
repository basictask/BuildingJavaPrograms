/*
This class demonstrates inheritance and interfaces. First example of Chapter 9.
 */
package Excercise9_Inheritance_Interfaces;

/**
 *
 * @author dani
 */
public class Employee {
    private int years;
    
    public Employee(int initialYears){
        years = initialYears;
    }
    
    public int getYears(){
        return years;
    }
    
    public int getHours(){
        return 40;
    }
    
    public double getSalary(){
        return 40000.0;
    }
    
    public int getVacationDays(){
        return this.basicVacation()+2*this.years;
    }
    
    public int basicVacation(){
        return 10;
    }
    
    public String getVacationForm(){
        return "yellow";
    }
}
