/*

 */
package Chapter_10;

/**
 *
 * @author dani
 */
public class CalendarDate implements Comparable<CalendarDate>{
    private int month;
    private int day;
    
    public CalendarDate(int month, int day){
        this.month = month;
        this.day = day;
    }
    
    public int compareTo(CalendarDate other){
        if(this.month != other.month){
            return this.month - other.month;
        }else{
            return this.day - other.day;
        }
    }
    
    public int getMonth(){
        return this.month;
    }
    
    public int getDay(){
        return this.day;
    }
    
    public String toString(){
        return this.month+"/"+this.day; 
    }
}
