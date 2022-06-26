/*
This is the 2nd main class for the Employee class. contains the Lawyer and LegalSecretary.
 */
package Chapter9;

/**
 *
 * @author dani
 */
public class Employee_Main_2 {
    public static void main(String[] args){
        System.out.print("Lawyer: ");
        Lawyer leia = new Lawyer(4);
        System.out.print(leia.getHours()+", ");
        System.out.print(leia.getSalary()+", ");
        System.out.print(leia.getVacationDays()+", ");
        System.out.println(leia.getVacationForm());
        leia.sue();
        
        System.out.println();
        
        System.out.print("Legal Secretary: ");
        LegalSecretary lucy = new LegalSecretary(3);
        System.out.print(lucy.getHours()+", ");
        System.out.print(leia.getSalary()+", ");
        System.out.print(lucy.getVacationDays()+", ");
        System.out.println(lucy.getVacationForm());
        lucy.takeDictation("neato");
        lucy.fileLegalBriefs();
    }
}
