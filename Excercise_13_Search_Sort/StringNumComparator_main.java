/*
Write a Comparator that compares String objects by the number of words they contain. Consider any nonwhitespace
string of characters to be a word. 
For example, “hello” comes before “I see”, which comes before “You can do it”.
 */
package Excercise_13_Search_Sort;

import java.util.Arrays;

/**
 *
 * @author dani
 */
public class StringNumComparator_main {
    public static void main(String[] args){
        String[] strings = {"You can do it", "hello", "I see", "to be or not to be", "well done"};
        System.out.println("before sort: "+Arrays.toString(strings));
        
        System.out.println();
        Arrays.sort(strings, new StringNumComparator());
        System.out.println(Arrays.toString(strings));
    }
}
