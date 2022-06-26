/*

 */
package test_2;
import java.util.*;
import java.io.*;
/**
 *
 * @author Daniel Kuknyo
 */
public class OutputTester {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner input = new Scanner(new File("lastFMData.csv"));
        PrintStream output = new PrintStream(new File("LastFmDataa.csv"));
        int count = 0;
        while(input.hasNextLine()){
            String sor = input.nextLine();
            String[] adatok = sor.split(";");
            if(Integer.parseInt(adatok[6])>24){
                break;
            }else{
                output.println(sor);
                System.out.println(sor);
            }
        }
    }
}
