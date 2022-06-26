/*
Write a recursive method called indexOf that accepts two strings as parameters and that returns 
the starting index of the first occurrence of the second string inside the first string (or 1 if not found). 

For example, the call of indexOf("Barack Obama", "bam") would return 8. 
(Strings already have an indexOf method, but you may not call it in your solution.)
 */
package Excercise_12_Recursion;

/**
 *
 * @author dani
 */
public class IndexOf {
    public static void main(String[] args){
        String s1 = "Barack obama";
        String s2 = "bam";
        System.out.println("index: "+indexOf(s1, s2));
        
        
    }
    
    public static int indexOf(String s1, String s2){
        int len = 1;
        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i)==s2.charAt(0)){
                len = indexer(s1, s2, i, 0);
                if(len==s2.length()-1){
                    return i;
                }
            }
        }
        return len;
    }
    
    private static int indexer(String s1, String s2, int c1, int c2){
        char ch1 = s1.charAt(c1);
        char ch2 = s2.charAt(c2);
        
        if(similar(ch1, ch2) && c2==s2.length()-1){
            return s2.length()-1;
        }else if(similar(ch1, ch2)){
            return indexer(s1, s2, c1+1, c2+1);
        }else{
            return 1;
        }
    }
    
    public static boolean similar(char ch1, char ch2){
        if(ch1==ch2){
            return true;
        }else{
            return false;
        }
    }
}
