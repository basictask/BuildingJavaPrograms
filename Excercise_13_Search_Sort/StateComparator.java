/*
Write a Comparator that compares String objects of a particular format. 
Each string is of a form such as "123456 Seattle, WA" , beginning with a numeric token that is followed by 
additional text tokens. 
Your job is to treat the first tokens as integers and compare them in numerical order. 
You cannot simply compare them by using the strings’compareTo method, 
since it would treat the numbers as text and not as integers. 
For example, "276453 Helena, MT" is greater than "9847 New York, NY" . 
*/
package Excercise_13_Search_Sort;

/**
 *
 * @author dani
 */
import java.util.*;
public class StateComparator implements Comparator<String>{
    public int compare(String s1, String s2){
        Scanner input1=new Scanner(s1);
        Scanner input2=new Scanner(s2);
        
        int a = Integer.parseInt(input1.next());
        int b = Integer.parseInt(input2.next());
        
        String c=input1.next();
        String d=input2.next();
        
        String e=input1.next();
        String f=input2.next();
        
        if(a>b){
            return 1;
        }else if(a<b){
            return -1;
        }else{
            if(c.compareTo(d)>0){
                return 1;
            }else if(c.compareTo(d)<0){
                return -1;
            }else{
                if(e.compareTo(f)>0){
                    return 1;
                }else if(e.compareTo(f)<0){
                    return -1;
                }else{
                    return 0;
                }
            }
        }
    }
}
