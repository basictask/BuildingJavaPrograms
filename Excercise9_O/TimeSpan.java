/*
This is the excecrcie class that belongs to chapter 8
 */

/*
5
Add the following method to the TimeSpan class:
public void add(TimeSpan span)
Adds the given amount of time to this time span.
*/

/*
6
Add the following method to the TimeSpan class:
public void subtract(TimeSpan span)
Subtracts the given amount of time from this time span.
*/

/*
7
Add the following method to the TimeSpan class:
public void scale(int factor)
Scales this time span by the given factor. 
For example, 1 hour and 45 minutes scaled by 2 equals 3 hours and 30
minutes.
*/

/*
11
Add an equals method to the TimeSpan class introduced in Chapter 8. Two time spans are considered equal if they
represent the same number of hours and minutes.
*/
package Excercise9_O;

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
    
    public int getHours(){
        return this.hours;
    }
    
    public int getMinutes(){
        return this.minutes;
    }
    
    public void add(TimeSpan span){
        this.hours += span.hours;
        this.minutes += span.minutes;
        this.hours += this.minutes / 60;
        this.minutes = this.minutes % 60;
    }
    
    public void substract(TimeSpan span){
        if (this.hours<span.hours){
            throw new IllegalArgumentException();
        }else if((this.hours == span.hours) && (this.minutes < span.minutes)){
            throw new IllegalArgumentException();
        }else{
            
            this.hours -= span.hours;
            this.minutes -= span.minutes;            
            if(this.minutes%60<0){
                this.hours -=1;
                this.minutes = 60 + (this.minutes % 60);
            }else{
                this.minutes = this.minutes % 60;
            }
        }
    }
    
    public void scale(int factor){
        this.hours *= factor;
        this.minutes *= factor;
        this.hours+=this.minutes/60;
        this.minutes=this.minutes%60;
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
    
    public boolean equals(TimeSpan s){
        return (this.getHours() == s.getHours()) && (this.getMinutes() == s.getMinutes());
    }
}
