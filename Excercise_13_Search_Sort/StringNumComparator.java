/*
Write a Comparator that compares String objects by the number of words they contain. Consider any nonwhitespace
string of characters to be a word. 
For example, “hello” comes before “I see”, which comes before “You can do it”.
 */
package Excercise_13_Search_Sort;

/**
 *
 * @author dani
 */
import java.util.*;
public class StringNumComparator implements Comparator<String>{
    public int compare(String s1, String s2){
        Scanner input1 = new Scanner(s1);
        Scanner input2 = new Scanner(s2);
        int count1=0;
        int count2=0;
        
        while(input1.hasNext()){
            String next=input1.next();
            count1++;
        }
        while(input2.hasNext()){
            String next=input2.next();
            count2++;
        }
        
        if(count1<count2){
            return -1;
        }else if(count1>count2){
            return 1;
        }else{
            return 0;
        }
    }
}
