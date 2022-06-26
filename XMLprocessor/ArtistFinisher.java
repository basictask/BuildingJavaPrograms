/*

 */
package test_2;
import java.io.*;
import java.util.*;
/**
 *
 * @author Daniel Kuknyo
 */
public class ArtistFinisher {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner input = new Scanner(new File("ArtistTags.txt"));
        PrintStream output = new PrintStream(new File("ArtistTags.csv"));
        
        while(input.hasNextLine()){
            String[] adatok = input.nextLine().split(";");
            output.println(adatok[0]+";"+adatok[1]+";"+adatok[2]+";"+adatok[3]);
            System.out.println(adatok[0]+";"+adatok[1]+";"+adatok[2]+";"+adatok[3]);
        }
    }
}
