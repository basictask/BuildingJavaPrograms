/*
This is the second implementation of the TimeSpan class,
this time using a single private field for the total number of minutes
 */
package Chapter8;

/**
 *
 * @author dani
 */
public class TimeSpan_2 {
    
    private int totalMinutes;
    
    public TimeSpan_2(int hours, int minutes){
        this.totalMinutes = 0; 
        add(hours, minutes);
    }
    
    public void add(int hours, int minutes){
        if(hours < 0 || minutes < 0){
            throw new IllegalArgumentException();
        }
        totalMinutes += 60*hours+minutes;
    }
    
    public String toString(){
        return (totalMinutes / 60) + "h " + (totalMinutes % 60) + "m"; 
    }
}
