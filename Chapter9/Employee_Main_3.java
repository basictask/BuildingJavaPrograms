/*
This is a class that demonstrates polymorphism by constructing different kinds of employees and printing out their info.
 */
package Chapter9;

/**
 *
 * @author dani
 */
public class Employee_Main_3 {
    public static void main(String[] args){
        Employee edna = new Employee(5);
        Lawyer lucy = new Lawyer(4);
        Secretary stan = new Secretary(7);
        LegalSecretary leo = new LegalSecretary(2);
        
        printInfo(edna);
        printInfo(lucy);
        printInfo(stan);
        printInfo(leo);
    }
    
    public static void printInfo(Employee e){
        System.out.print(e.getHours()+", ");
        System.out.print(e.getSalary()+", ");
        System.out.print(e.getVacationDays()+", ");
        System.out.print(e.getVacationForm()+", ");
        System.out.println(e);
    }
}
