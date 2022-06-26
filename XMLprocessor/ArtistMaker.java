/*

 */
package test_2;
import java.io.*;
import java.util.*;
/**
 *
 * @author Daniel Kuknyo
 */
public class ArtistMaker {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner input = new Scanner(new File("lastFMData.csv"));
        PrintStream output = new PrintStream(new File("artists.txt"));
        Random r = new Random();
        
        HashSet<String> artists = new HashSet<String>();
        while(input.hasNextLine()){
            String[] adatok = input.nextLine().split(";");
            System.out.println(adatok[0].toString());
            artists.add(adatok[0]);
        }
        
        System.out.println("artists size: " + artists.size());
        System.out.println();
        
        for (String artist : artists) {
            System.out.println(artist);
            int n = r.nextInt(10);
            output.println(artist);
        }
    }
}
