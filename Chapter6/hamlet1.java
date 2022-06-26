/*
Testing to see how throw FileNotFoundException and other file objects work.
 */
package Chapter6;

/**
 *
 * @author dani
 */
import java.util.*;
import java.io.*;
public class hamlet1 {
    public static void main(String[] args) throws FileNotFoundException{
        File f = new File("/home/dani/NetBeansProjects/test/files/hamlet.txt");
        Scanner input = new Scanner(f);
        
        System.out.println("exists returns " + f.exists());
        System.out.println("canRead returns " + f.canRead());
        System.out.println("length returns " + f.length());
        System.out.println("getAbsolutePath returns " + f.getAbsolutePath());
        
        int counter = 0;
        while(input.hasNext()){
            String word = input.next();
            counter ++;
        }
        System.out.println("total words: "+counter);
    }
}
