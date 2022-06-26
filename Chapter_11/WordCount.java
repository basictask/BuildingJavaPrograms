/*
uses maps to implement a word count, so that the user can see which words occur the most in a book.
 */
package Chapter_11;

/**
 *
 * @author dani
 */
import java.io.*;
import java.util.*;
public class WordCount {
    public static final int OCCURENCES = 2000;
    public static void main(String[] args) throws FileNotFoundException{
        Scanner in = new Scanner(new File("moby-dick.txt"));
        Map<String, Integer> wordCountMap = getCountMap(in);
        
        for(String word : wordCountMap.keySet()){
            int count = wordCountMap.get(word);
            if(count > OCCURENCES){
                System.out.println(word + " occurs " + count + " times");
            }
        }
    }

    public static Map<String, Integer> getCountMap(Scanner in){
        Map<String, Integer> wordCountMap = new TreeMap<String, Integer>();
        
        while(in.hasNext()){
            String word = in.next().toLowerCase();
            if(!wordCountMap.containsKey(word)){
                wordCountMap.put(word, 1);
            }else{
                int count = wordCountMap.get(word);
                wordCountMap.put(word, count+1);
            }
        }
        return wordCountMap;
    }
}
