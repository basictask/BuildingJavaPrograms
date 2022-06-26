/*
The RandomIncrementer begins its value at a random integer and changes it to a new random integer each time it is incremented.
 */
package Excercise9_O;

/**
 *
 * @author dani
 */
import java.util.*;
public class RandomIncrementer {
    Random r = new Random();
    private int value;
    
    public RandomIncrementer(){
        this.value = 0;
    }
    
    public void Increment(){
        int n = r.nextInt((65536)-32768);
        this.value += n;
    }
    
    public int getValue(){
        return this.value;
    }
}
