/*

 */
package Excercise_10_ArrayLists;

import Chapter_10.*;

/**
 *
 * @author dani
 */
public class CalendarDate implements Comparable<CalendarDate>{
    private int month;
    private int day;
    private int year;
    
    public CalendarDate(int year, int month, int day){
        this.month = month;
        this.day = day;
        this.year = year;
    }
    
    public int compareTo(CalendarDate other){
        if(this.year != other.year){
            return this.year - other.year;
        }else if(this.month != other.month){
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
        return this.year+"/"+this.month+"/"+this.day; 
    }
}
