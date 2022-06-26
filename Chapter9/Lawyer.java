/*
This is the class for the Lawyer employee type
 */
package Chapter9;

/**
 *
 * @author dani
 */
public class Lawyer extends Employee{
    
    public Lawyer(int initialYears){
        super(initialYears);
    }
    
    public int getVacationDays(){
        return 10*getYears();
    }
    public String getVacationForm(){
        return "pink";
    }
    public void sue(){
        System.out.println("See you in court!");
    }
    public double getSalary(){
        return super.getSalary() +5000;
    }
}
