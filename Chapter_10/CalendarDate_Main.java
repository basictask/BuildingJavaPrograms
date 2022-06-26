/*

 */
package Chapter_10;

/**
 *
 * @author dani
 */
import java.util.*;
public class CalendarDate_Main {
    public static void main(String[] args){
        ArrayList<CalendarDate> dates = new ArrayList<CalendarDate>();
        dates.add(new CalendarDate(8, 4));
        dates.add(new CalendarDate(8, 6));
        dates.add(new CalendarDate(8, 2));
        dates.add(new CalendarDate(7, 3));
        dates.add(new CalendarDate(9, 5));
        
        System.out.println("dates: "+dates);
        Collections.sort(dates);
        System.out.println("after sort: "+dates);
    }
}
