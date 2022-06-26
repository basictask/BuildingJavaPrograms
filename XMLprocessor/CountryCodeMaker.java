/*

 */
package test_2;
import java.util.*;
import java.io.*;
/**
 *
 * @author Daniel Kuknyo
 */
public class CountryCodeMaker {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner input = new Scanner(new File("CountryCodesRaw.txt"));
        PrintStream output = new PrintStream(new File("CountryCodes.csv"));
        
        while(input.hasNextLine()){
            String[] adatok = input.nextLine().split("\t");
            output.println(adatok[2].substring(0,2)+";"+adatok[1].substring(0, adatok[1].length()-1));
            System.out.println(adatok[2].substring(0, 2)+";"+adatok[1].substring(0, adatok[1].length()-1));
        }
    }
}
