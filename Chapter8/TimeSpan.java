/*
This is a class to measure elapsed hours and minutes
 */
package Chapter8;

/**
 *
 * @author dani
 */
public class TimeSpan {
    private int hours; 
    private int minutes;
    
    public TimeSpan(int hours, int minutes){
        this.hours = 0;
        this.minutes = 0;
        add(hours, minutes);
    }
    
    public void add(int hours, int minutes){
        if(hours<0 || minutes<0){
            throw new IllegalArgumentException();
        }
        
        this.hours += hours;
        this.minutes += minutes;
        
        this.hours += this.minutes / 60;
        this.minutes = this.minutes % 60;
    }
    
    public String toString(){
        return hours + "h " + minutes +"m"; 
    }
}
