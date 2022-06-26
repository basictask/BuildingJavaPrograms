/*
This is an extension of the Employee class.
 */
package Chapter9;

/**
 *
 * @author dani
 */
public class Secretary extends Employee{
    
    public Secretary(int initialYears){
        super(initialYears);
    }
    
    public void takeDictation(String text){
        System.out.println("Dictating text: "+text);
    }
}
