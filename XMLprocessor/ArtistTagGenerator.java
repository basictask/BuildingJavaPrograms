/*

 */
package test_2;
import java.io.*;
import java.util.*;
/**
 *
 * @author Daniel Kuknyo
 */
public class ArtistTagGenerator {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner input = new Scanner(new File("artistTagsRaw.txt"));
        PrintStream output = new PrintStream(new File("artistTags.txt"));
        
        while(input.hasNextLine()){
            String[] adatok = input.nextLine().split("\"");
            System.out.println(Arrays.toString(adatok));
            int n = 0;
            String s = "";
            for (int i = 0; i < adatok.length; i++) {
                if(adatok.length<3){
                    break;
                }else if(adatok[1].equals("error")){
                    break;
                }
                if(n<4 && adatok[i].equals("name") && adatok[i+1].equals(":")){
                    s += ";"+adatok[i+2];
                    n++;
                }
                if(adatok[i].equals("artist") && adatok[i+1].equals(":") && n<3){
                    output.println(adatok[i+2]+s+getUnknowns(n));
                    System.out.println(adatok[i+2]+s+getUnknowns(n));
                }else if(adatok[i].equals("artist") && adatok[i+1].equals(":")){
                    output.println(adatok[i+2]+s);
                    System.out.println(adatok[i+2]+s);
                }
            }
        }
    }
    public static String getUnknowns(int n){
        if(n==0){
            return ";unknown;unknown;unknown";
        }else if(n==1){
            return ";unknown;unknown";
        }else{
            return ";unknown";
        }
    }
}
