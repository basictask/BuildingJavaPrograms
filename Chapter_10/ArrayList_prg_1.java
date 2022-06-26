/*
This program generates a list of stop words, which will be excluded from a text file,
the same way search engines exclude such stop words from search queries
 */
package Chapter_10;

/**
 *
 * @author dani
 */
import java.util.*;
import java.io.*;
public class ArrayList_prg_1 {
    public static void main(String[] args) throws FileNotFoundException{
        ArrayList<String> stopwords = new ArrayList<String>();
        stopwords.add("a");
        stopwords.add("be");
        stopwords.add("by");
        stopwords.add("how");
        stopwords.add("in");
        stopwords.add("is");
        stopwords.add("it");
        stopwords.add("of");
        stopwords.add("on");
        stopwords.add("or");
        stopwords.add("that");
        stopwords.add("the");
        stopwords.add("this");
        stopwords.add("to");
        stopwords.add("why");
        
        Scanner input = new Scanner(new File("hamlet.txt"));
        while(input.hasNext()){
            String next = input.next();
            if(!stopwords.contains(next.toLowerCase())){
                System.out.print(next);
            }
        }
    }
}