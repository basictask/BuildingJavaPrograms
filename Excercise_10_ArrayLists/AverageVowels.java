/*
Write a method called averageVowels that takes an ArrayList of Strings as a parameter, 
and returns the average number of vowel characters (a, e, i, o, u) in all String s in the list. 
If your method is passed an empty ArrayList , it should return 0.0 .
 */
package Excercise_10_ArrayLists;

/**
 *
 * @author dani
 */
import java.util.*;
import java.io.*;
public class AverageVowels {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner input = new Scanner(new File("text1.txt"));
        ArrayList<String> list = add(input);
        System.out.println("average vowels in input file: "+averageVowels(list));
    }
    
    public static ArrayList<String> add(Scanner input){
        ArrayList<String> result = new ArrayList<String>();
        while(input.hasNext()){
            String next = input.next();
            result.add(next);
        }
        return result;
    }
    
    public static double averageVowels(ArrayList<String> list){
        double sum = 0;
        double num = 0;
        
        if(list.isEmpty()){
            return 0.0;
        }
        
        for(int i=0; i<list.size(); i++){
            String next = list.get(i);
            num++;
            for(int j = 0; j<next.length(); j++){
                if((next.charAt(j) == 'a') || (next.charAt(j) == 'e') || (next.charAt(j) == 'i') || (next.charAt(j) == 'o') || (next.charAt(j) == 'u')){
                    sum++;
                }
            }
        }
        return sum / num;
    }
}
