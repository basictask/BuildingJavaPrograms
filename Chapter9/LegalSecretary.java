/*
This is the extension class of Secretary, with extended methods and behaviour
*/
package Chapter9;

/**
 *
 * @author dani
 */
public class LegalSecretary extends Secretary{
    
    public LegalSecretary(int initialYears){
        super(initialYears);
    }
    
    public double getSalary(){
        return 45000.0;
    }
    public void fileLegalBriefs(){
        System.out.println("I could file all day!");
    }
}
