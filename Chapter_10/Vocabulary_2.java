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
public class Vocabulary_2 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner input1 = new Scanner(new File("text1.txt"));
        Scanner input2 = new Scanner(new File("text2.txt"));
        
        ArrayList<String> list1 = getWords(input1);
        ArrayList<String> list2 = getWords(input2);
        
        System.out.println("text1: "+list1);
        System.out.println("text2: "+list2);
        
        System.out.println();
        
        ArrayList<String> common = getOverlap(list1, list2);
        
        System.out.println("common: "+common);
        
        System.out.println();
        
        report(list1, list2, common);
    }
    
    public static ArrayList<String> getWords(Scanner input){
        input.useDelimiter("[^a-zA-Z']+");
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
    
    public static ArrayList<String> getOverlap(ArrayList<String> list1, ArrayList<String> list2){
        ArrayList<String> result = new ArrayList<String>();
        int i1 = 0;
        int i2 = 0;
        
        while(i1 < list1.size() && i2 < list2.size()){
            int n = list1.get(i1).compareTo(list2.get(i2));
            if(n == 0){
                result.add(list1.get(i1));
                i1++;
                i2++;
            }else if(n < 0){
                i1++;
            }else{
                i2++;
            }
        }
        return result;
    }
    
    public static void report(ArrayList<String> list1, ArrayList<String> list2, ArrayList<String> common){
        System.out.println("file#1 words: "+list1.size());
        System.out.println("file#2 words: "+list2.size());
        System.out.println("common words: "+common.size());
        
        double pct1 = 100 * common.size() / list1.size();
        double pct2 = 100 * common.size() / list2.size();
        System.out.println("% of file 1 in overlap: "+pct1);
        System.out.println("% of file 2 in overlap: "+pct2);
    }
}
