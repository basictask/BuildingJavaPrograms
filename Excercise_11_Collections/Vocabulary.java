/*

 */
package Excercise_11_Collections;

/**
 *
 * @author dani
 */
import java.util.*;
import java.io.*;
public class Vocabulary {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner text1 = new Scanner(new File("text1.txt"));
        Scanner text2 = new Scanner(new File("text2.txt"));
        
        TreeSet<String> set1 = getSet(text1);
        TreeSet<String> set2 = getSet(text2);
        
        System.out.println("text 1: "+set1);
        System.out.println("text 2: "+set2);
        
        System.out.println();
        
        TreeSet<String> common = common(set1, set2);
        System.out.println("common: "+common);
        
        System.out.println();
        
        report(set1, set2, common);
    }
    
    public static TreeSet<String> getSet(Scanner input){
        TreeSet<String> result = new TreeSet<String>();
        input.useDelimiter("[^a-zA-Z']+");
        while(input.hasNext()){
            String s = input.next().toLowerCase();
            result.add(s);
        }
        return result;
    }
    
    public static TreeSet<String> common(TreeSet<String> set1, TreeSet<String> set2){
        TreeSet<String> result = new TreeSet<String>(set1);
        
        result.retainAll(set2);
                
        return result;
    }
    
    public static void report(TreeSet<String> set1, TreeSet<String> set2, TreeSet<String> common){
        System.out.println("file#1 words: "+set1.size());
        System.out.println("file#2 words: "+set2.size());
        System.out.println("common words: "+common.size());
        double pct1 = 100 * common.size() / set1.size();
        double pct2 = 100 * common.size() / set2.size();
        System.out.println("% of file 1 in overlap: "+pct1);
        System.out.println("% of file 2 in overlap: "+pct2);
    }
}
