/*

 */
package test_2;
import java.util.*;
import java.io.*;
/**
 *
 * @author Daniel Kuknyo
 */

public class ArtistCountryMaker {
    public static void main(String[] args) throws FileNotFoundException{
        HashMap<String, String> countries = getMap1();
        HashMap<String, String> continents = getMap2();
        getCountries("cai.csv", countries, continents);
        getCountries("haah.csv", countries, continents);
        getCountries("pr.csv", countries, continents);
        getCountries("sf.csv", countries, continents);
        getCountries("td.csv", countries, continents);
        getCountries("tie.csv", countries, continents);
    }
    public static void getCountries(String f, HashMap<String, String> countries, HashMap<String, String> continents) throws FileNotFoundException{
        Scanner input = new Scanner(new File(f));
        PrintStream outputData = new PrintStream(new File("done"+f));
        PrintStream outputCountry = new PrintStream(new File("country"+f));
        input.nextLine();
        while(input.hasNextLine()){
            //SAS altal kezelhetove teves algoritmusa
            String[] adatok = input.nextLine().split("\",\"");
            outputData.print(adatok[1]+";"+adatok[2]+";"+adatok[3]+";");
            System.out.print(adatok[1]+";"+adatok[2]+";"+adatok[3]+";");
            if(adatok[4].length()==5){
                outputData.print(adatok[4].substring(0, 2)+";"+adatok[4].substring(3, 5)+";");
                System.out.print(adatok[4].substring(0, 2)+";"+adatok[4].substring(3, 5)+";");
            }else{
                outputData.print(adatok[4].substring(0,1)+";"+adatok[4].substring(2, 4)+";");
                System.out.print(adatok[4].substring(0,1)+";"+adatok[4].substring(2, 4)+";");
            }
            outputData.print(adatok[5]);
            System.out.print(adatok[5]);
            outputData.print(";"+getContinent(adatok[5].substring(0, 2), continents));
            System.out.print(";"+getContinent(adatok[5].substring(0, 2), continents));
            outputData.println(";"+getCountry(adatok[5].substring(0, 2), countries));
            System.out.println(";"+getCountry(adatok[5].substring(0, 2), countries));
            //Eloadok orszagkod alapjan valo beazonositasa, ennek outputja
            outputCountry.print(adatok[2]+";"+getCountry(adatok[5].substring(0, 2), countries));
            System.out.print(adatok[2]+";"+getCountry(adatok[5].substring(0, 2), countries));
            //Eloadok megkeresese kontinenskod alapjan 
            outputCountry.println(";"+getContinent(adatok[5].substring(0, 2), continents));
            System.out.println(";"+getContinent(adatok[5].substring(0, 2), continents));
        }
    }
    public static String getCountry(String s, HashMap<String, String> countries) throws FileNotFoundException{
        for (String country : countries.keySet()) {
            if(s.equals(country)){
                return countries.get(s);
            }
        }
        return "missing";
    }
    
    public static String getContinent(String s, HashMap<String, String> continents) throws FileNotFoundException{
        Scanner input = new Scanner(new File("continents.txt"));
        while(input.hasNextLine()){
            String[] adatok = input.nextLine().split(",");
            
            if(adatok[0].equals(s)){
                for (String continent : continents.keySet()) {
                    if(continent.equals(adatok[1])){
                        return continents.get(continent);
                    }
                }
            }
        }
        return "missing";
    }
    
    public static HashMap<String, String> getMap1() throws FileNotFoundException{
        Scanner input = new Scanner(new File("CountryCodes.csv"));
        HashMap<String, String> result = new HashMap<String, String>();
        while(input.hasNextLine()){
            String[] adatok = input.nextLine().split(";");
            result.put(adatok[0], adatok[1]);
        }
        return result;
    }
    
    public static HashMap<String, String> getMap2(){
        HashMap<String, String> result = new HashMap<String, String>();
        result.put("AS", "Asia");
        result.put("EU", "Europe");
        result.put("NA", "North America");
        result.put("SA", "South America");
        result.put("AF", "Africa");
        result.put("OC", "Oceania");
        return result;
    }
}
