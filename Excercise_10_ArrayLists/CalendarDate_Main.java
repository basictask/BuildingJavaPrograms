/*

 */
package Excercise_10_ArrayLists;

/**
 *
 * @author dani
 */

import java.util.*;
public class CalendarDate_Main {
    public static void main(String[] args){
        ArrayList<CalendarDate> dates = new ArrayList<CalendarDate>();
        dates.add(new CalendarDate(1998, 8, 4));
        dates.add(new CalendarDate(1997, 8, 6));
        dates.add(new CalendarDate(2000, 4, 2));
        dates.add(new CalendarDate(1997, 8, 4));
        dates.add(new CalendarDate(2000, 7, 2));
        
        System.out.println("dates: "+dates);
        Collections.sort(dates);
        System.out.println("after sort: "+dates);
    }
}
