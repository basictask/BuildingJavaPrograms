/*
Write a Comparator that compares String objects of a particular format. 
Each string is of a form such as "123456 Seattle, WA" , beginning with a numeric token that is followed by 
additional text tokens. Your job is to treat the first tokens as integers and compare them in numerical order. 
You cannot simply compare them by using the strings’ compareTo method, 
since it would treat the numbers as text and not as integers. 
For example, "276453 Helena, MT" is greater than "9847 New York, NY" . 
 */
package Excercise_13_Search_Sort;

import java.util.Arrays;

/**
 *
 * @author dani
 */
public class StateComparator_main {
    public static void main(String[] args){
        String[] states = {"123456 Seattle WA", "123456 Seattle MT", "9847 New York NY", "123456 Oregon Denver"};
        System.out.println(Arrays.toString(states));
        
        System.out.println();
        Arrays.sort(states, new StateComparator());
        System.out.println(Arrays.toString(states));
    }
}
