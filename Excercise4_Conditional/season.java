/*
 Write a method called season that takes as parameters two integers representing a month and day and returns a
String indicating the season for that month and day. Assume that the month is specified as an integer between 1
and 12 (1 for January, 2 for February, and so on) and that the day of the month is a number between 1 and 31. 
If the date falls between 12/16 and 3/15, the method should return "winter" . 
If the date falls between 3/16 and 6/15, the method should return "spring" . 
If the date falls between 6/16 and 9/15, the method should return "summer" . 
If the date falls between 9/16 and 12/15, the method should return "fall" .
 */

package Excercise4_Conditional;
import java.util.*;
public class season {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        
        System.out.print("Input monhth: ");
        int m = console.nextInt();
        
        System.out.print("Input day: ");
        int d = console.nextInt();
        
        System.out.println(season(m, d));
    }
    
    public static String season(int month, int day){
        
        //Winter
        if (month >= 12 && day >= 16){
            return "Winter";
        }else if(month < 3){
            return "Winter";
        }else if(month == 3 && day <= 15){
            return "Winter";
            
        //Spring
        }else if(month == 3 && day >= 16){
            return "Spring";
        }else if (month == 4 || month == 5){
            return "Spring";
        }else if (month == 6 && day <= 15){
            return "Spring";
            
        //Summer    
        }else if (month == 6 && day >= 16){
            return "Summer";
        }else if (month == 7 || month == 8){
            return "Summer";
        }else if (month == 9 && day <= 15){
            return "Summer";
            
        //Fall
        }else if(month == 9 && day >= 16){
            return "Fall";
        }else if(month == 10 || month == 11){
            return "Fall";
        }else if(month == 12 && day <=15){
            return "Fall";
        }
    return "not a date";
    }
    
}
