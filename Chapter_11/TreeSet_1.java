/*
This program demonstrates the behaviour of TreeSets
 */
package Chapter_11;

/**
 *
 * @author dani
 */
import java.io.*;
import java.util.*;
public class TreeSet_1 {
    public static void main(String[] args) throws FileNotFoundException{
        Set<String> words = new TreeSet<String>();
        Scanner in = new Scanner(new File("moby-dick.txt"));
        while(in.hasNext()){
            String word = in.next();
            word = word.toLowerCase();
            if(word.startsWith("a") && word.length() == 3){
                words.add(word);
            }
        }
        
        System.out.println(words);
    }
}
