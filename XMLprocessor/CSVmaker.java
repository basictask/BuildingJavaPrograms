/*

 */
package test_2;
import java.io.*;
import java.util.*;
/**
 *
 * @author Daniel Kuknyo
 */
public class CSVmaker {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner input = new Scanner(new File("kuknyo.csv"));
        PrintStream output = new PrintStream(new File("lastFMData.csv"));
        while(input.hasNextLine()){
            String[] adatok = input.nextLine().split(",");
            output.println(adatok[0] + ";" + adatok[1] + ";" + adatok[2] + ";" + adatok[3].substring(0, 2) + ";" + adatok[3].substring(3, 6) + ";" + adatok[3].substring(7, 11) + ";" + adatok[3].substring(12, 14) + ";" + adatok[3].substring(15, 17));
        }
    }
}
