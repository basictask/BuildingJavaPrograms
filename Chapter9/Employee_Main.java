/*
This is the main method of the Employee class.
 */
package Chapter9;

/**
 *
 * @author dani
 */
public class Employee_Main {
    public static void main(String[] args){
        System.out.print("Employee: ");
        Employee edna = new Employee(5);
        System.out.print(edna.getHours()+", ");
        System.out.print(edna.getSalary()+", ");
        System.out.print(edna.getVacationDays()+", ");
        System.out.println(edna.getVacationForm()+", ");
        
        System.out.print("Secretary: ");
        Secretary stan = new Secretary(6);
        System.out.print(stan.getHours()+", ");
        System.out.print(stan.getSalary()+", ");
        System.out.print(stan.getVacationDays()+", ");
        System.out.println(stan.getVacationForm()+", ");
    }
}
