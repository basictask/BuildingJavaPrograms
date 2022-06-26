/*
This is the main class to the first 3 excercises of Chapter 9.
 */
package Excercise9_Inheritance_Interfaces;

/**
 *
 * @author dani
 */
public class Employee_Main {
    public static void main(String[] args){
        Marketer martin = new Marketer(3);
        Janitor joe = new Janitor(4);
        Lawyer larry = new Lawyer(2);
        HarvardLawyer harry = new HarvardLawyer(2);
        
        printInfo(martin);
        printInfo(joe);
        printInfo(larry);
        printInfo(harry);
        
        System.out.println();
        
        martin.advertise();
        joe.clean();
        larry.sue();
        harry.sue();
    }
    
    public static void printInfo(Employee e){
        System.out.print(e.getHours()+", ");
        System.out.print(e.getSalary()+", ");
        System.out.print(e.getVacationDays()+", ");
        System.out.print(e.getVacationForm()+", ");
        System.out.println(e);
    }
}
