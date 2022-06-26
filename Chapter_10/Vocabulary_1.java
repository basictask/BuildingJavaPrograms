/*
this program reads two files and reports the unique words in each
 */
package Chapter_10;

/**
 *
 * @author dani
 */
import java.util.*;
import java.io.*;
public class Vocabulary_1 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner input1 = new Scanner(new File("text1.txt"));
        Scanner input2 = new Scanner(new File("text2.txt"));
        
        ArrayList<String> list1 = getWords(input1);
        ArrayList<String> list2 = getWords(input2);
        
        System.out.println("text1: "+list1);
        System.out.println("text2: "+list2);
    }
    
    public static ArrayList<String> getWords(Scanner input){
        ArrayList<String> words = new ArrayList<String>();
        while(input.hasNext()){
            String next = input.next().toLowerCase();
            words.add(next);
        }
        Collections.sort(words);
        ArrayList<String> result = new ArrayList<String>();
        if(words.size()>0){
            result.add(words.get(0));
            for(int i=1; i<words.size(); i++){
                if(!words.get(i).equals(words.get(i-1))){
                    result.add(words.get(i));
                }
            }
        }
        return result;
    }
}
