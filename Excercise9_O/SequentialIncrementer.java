/*
The SequentialIncrementer begins its value at 0 and increases it by 1 each time it is incremented.
 */
package Excercise9_O;

/**
 *
 * @author dani
 */

public class SequentialIncrementer implements Incrementable{
    private int value;
    
    public SequentialIncrementer(){
        this.value = 0;
    }
    
    public void increment(){
        this.value ++;
    }
    
    public int getValue(){
        return this.value;
    }
}
