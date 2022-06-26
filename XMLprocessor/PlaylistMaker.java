/*

 */
package test_2;
import java.util.*;
import java.io.*;
/**
 *
 * @author Daniel Kuknyo
 */
public class PlaylistMaker {
    public static void main(String[] args) throws FileNotFoundException{
        HashMap<String, String> countries = getMap();
        getPlayList("cai.csv", countries);
        getPlayList("haah.csv", countries);
        getPlayList("pr.csv", countries);
        getPlayList("sf.csv", countries);
        getPlayList("td.csv", countries);
        getPlayList("tie.csv", countries);
    }
    
    public static void getPlayList(String file, HashMap<String, String> countries) throws FileNotFoundException{
        Scanner input = new Scanner(new File(file));
        PrintStream output = new PrintStream(new File("play"+file));
        input.nextLine();
        
        while(input.hasNextLine()){
            String[] adatok = input.nextLine().split("\",\"");
            output.print(adatok[1]+";"+adatok[2]+";"+adatok[3]+";");
            System.out.print(adatok[1]+";"+adatok[2]+";"+adatok[3]+";");
            
            //zenehosszok helyes felvetele igazitva a karakterlanchoz
            if(adatok[4].length()==5){
                output.print(adatok[4].substring(0, 2)+";"+adatok[4].substring(3, 5)+";");
                System.out.print(adatok[4].substring(0, 2)+";"+adatok[4].substring(3, 5)+";");
            
            }else{
                output.print(adatok[4].substring(0,1)+";"+adatok[4].substring(2, 4)+";");
                System.out.print(adatok[4].substring(0,1)+";"+adatok[4].substring(2, 4)+";");
            }
            //ISRC kod kiirasa
            output.print(adatok[5]);
            System.out.print(adatok[5]);
            //eloadok lemezkiadojanak orszaganak visszakeresese orszagkod alapjan
            output.println(";"+getCountry(adatok[5].substring(0, 2), countries));
            System.out.println(";"+getCountry(adatok[5].substring(0, 2), countries));
        }
    }
    
    public static HashMap<String, String> getMap() throws FileNotFoundException{
        Scanner input = new Scanner(new File("CountryCodes.csv"));
        HashMap<String, String> result = new HashMap<String, String>();
        while(input.hasNextLine()){
            String[] adatok = input.nextLine().split(";");
            result.put(adatok[0], adatok[1]);
        }
        return result;
    }
    
    public static String getCountry(String s, HashMap<String, String> countries) throws FileNotFoundException{
        for (String country : countries.keySet()) {
            if(s.equals(country)){
                return countries.get(s);
            }
        }
        return "missing";
    }
}
