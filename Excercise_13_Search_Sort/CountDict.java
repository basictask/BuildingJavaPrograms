package Excercise_13_Search_Sort;

/*
Write code to read a dictionary from a file, then prompt the user for two words and tell the user how many words in
the dictionary fall between those two words. Here is a sample run of the program:

Type two words: goodbye hello

There are 4418 words between goodbye and hello
Use the binary search algorithm in your solution.
 */

/**
 *
 * @author Y80L35
 */
import java.util.*;
import java.io.*;
public class CountDict {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner console = new Scanner(System.in);
        Scanner input = new Scanner(new File("words.txt"));
        ArrayList<String> words = new ArrayList<String>();
        
        while(input.hasNext()){
            String next = input.next();
            words.add(next);
        }
        
        System.out.print("input two words: ");
        String s1 = "hello";//console.next();
        String s2 = "wolf";//console.next();
        
        System.out.printf("%s and %s are %d places from eachother.\n",s1, s2, countDict(words, s1, s2));    
    }
    
    public static int countDict(ArrayList<String> list, String s1, String s2){
        int a = binarySearch(list, s1);
        int b = binarySearch(list,s2);
        
        if(a==-1 || b==-1){
            return -1;
        }else if(a>b){
            return a-b;
        }else if(b>a){
            return b-a;
        }else{
            return 0;
        }
    }
    
    public static int countDictSeq(ArrayList<String> list, String s1, String s2){
        int a = seqSearch(list, s1);
        int b = seqSearch(list,s2);
        
        if(a==-1 || b==-1){
            return -1;
        }else if(a>b){
            return a-b;
        }else if(b>a){
            return b-a;
        }else{
            return 0;
        }
    }
    
    public static int binarySearch(ArrayList<String> list, String target){
        int min = 0;
        int max = list.size()-1;
        while(min <= max){
            int mid = (min + max)/2;
            if(list.get(mid).equals(target)){
                return mid;
            }else if(list.get(mid).compareTo(target)<0){
                min = mid+1;
            }else{
                max=mid-1;
            }
        }
        return -1;
    }
    
    public static int seqSearch(ArrayList<String> list, String target){
        int i = 0;
        while(!(list.get(i).equals(target))){
            i++;
        }
        if(i==list.size() && !(list.get(i).equals(target))){
            return -1;
        }
        return i;
    }
}
