/*
This class demonstrates inheritance and interfaces. First example of Chapter 9.
 */
package Chapter9;

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
        return 10+2*this.years;
    }
    
    public String getVacationForm(){
        return "yellow";
    }
}
