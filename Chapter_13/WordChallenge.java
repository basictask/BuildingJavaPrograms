/*

 */
package Chapter_13;

/**
 *
 * @author dani
 */
import java.util.*;
import java.io.*;
public class WordChallenge {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner input = new Scanner(new File("words.txt"));
        List<String> words = new ArrayList<String>();
        
        while(input.hasNext()){
            String word = input.next();
            words.add(word);
        }
        
        Scanner console = new Scanner(System.in);
        while(true){
            System.out.print("[enter to quit] input word to search: ");
            String target = console.nextLine();
            if(target.trim().length()==0){
                break;
            }
            
            int index = Collections.binarySearch(words, target);
            if(index>=0){
                System.out.println();
                System.out.println("\""+target+"\" exists. length: "+target.length());
                System.out.println();
            }else{
                System.out.println();  
                System.out.println("\""+target+"\" is not found");
                System.out.println();
            }
        }
    }
}
