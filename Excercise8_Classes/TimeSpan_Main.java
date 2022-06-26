/*
This is the main method that belongs to TimeSpan class
 */
package Excercise8_Classes;

/**
 *
 * @author dani
 */
public class TimeSpan_Main {
    public static void main(String[] args){
        TimeSpan time1 = new TimeSpan(1, 45);
        TimeSpan time2 = new TimeSpan(7, 40);
        TimeSpan time3 = new TimeSpan(16, 5);
        TimeSpan time4 = new TimeSpan(13, 45);
        TimeSpan time5 = new TimeSpan(1, 45);
        
        System.out.println("time1: "+time1.toString());
        System.out.println("time2: "+time2.toString());
        
        System.out.println();
        
        time1.add(time2);
        System.out.println("time1 + time2 = "+time1);
        
        System.out.println();
        
        time3.substract(time4);
        System.out.println("substract: "+time3);
        
        System.out.println();
        
        time5.scale(2);
        System.out.println("time1 scaled by 2: "+time5);
    }
}
