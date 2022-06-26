/*
This program demonstrates the behaviour of sets
 */
package Chapter_11;

/**
 *
 * @author dani
 */
import java.util.*;
import java.io.*;
public class Set_1 {
    public static void main(String[] args) throws FileNotFoundException{
        Set<String> words = new HashSet<String>();
        Scanner input = new Scanner(new File("moby-dick.txt"));
        while(input.hasNext()){
            String word = input.next();
            word = word.toLowerCase();
            words.add(word);
        }
        System.out.println("number of unique words: "+words.size());
    }
}
