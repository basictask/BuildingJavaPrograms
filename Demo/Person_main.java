/*
Készítsen metódust, ami feltölt egy tömblistát személyekkel, a megadott számban. 
A feltöltés során az értékeket a következőképpen automatikusan adja. 

Név: Szemely_1… Szemely_N-ig, ahány személyt adtunk meg. 
Születési év: 1995 – 2016-ig véletlen egészszám, 
Város véletlen érték alapján (Budapest, Debrecen, Szeged)

Készítsen metódust, ami táblázatos formában listázza a személyeket.

Készítsen metódust, ami az átadott város alapján kiírja, hogy az összes személy közül hány százalék lakik az adott városban. 	elégséges

Készítsen metódust, ami kiírja, hogy az összes személy közül hány százalék lakik az egyes városokban. 
Használja fel az előző pontban elkészített függvényt.	közepes

Készítsen logikai értékkel visszatérő függvényt, ami meghatározza egy adott évről, hogy szökőév-e. 
Egy év akkor szökőév, ha az év osztható néggyel, de nem osztható százzal, kivéve a százzal nem oszthatóak közül azokat, 
amelyek négyszázzal oszthatóak.	jó

Írja ki azokat a tanulókat, akik szökőévben születtek	jeles

 */
package vizsga;

/**
 *
 * @author dani
 */
import java.util.*;
public class Person_main {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("number of people: ");
        int n = console.nextInt();
        ArrayList<Person> people = fillList(n);
        
        System.out.println();
        listPeople(people);
        
        System.out.println();
        System.out.print("city to check: ");
        String city = console.next();
        
        System.out.println();
        listCity(people, city);
        
        System.out.println();
        allCities(people);
        
        System.out.println();
        listLeap(people);
    }
    
    public static ArrayList<Person> fillList(int n){
        Random r = new Random();
        ArrayList<Person> result = new ArrayList<Person>();
        String[] cities = {"Budapest", "Debrecen", "Szeged"};
        
        for(int i=1; i<=n; i++){
            String name = "Person_"+i;
            
            int year = r.nextInt(22)+1995;
            
            int num = r.nextInt(3);
            String city = cities[num];
            
            Person p = new Person(name, year, city);
            
            result.add(p);
        }
        return result;
    }
    
    public static void listPeople(ArrayList<Person> list){
        for(Person p : list){
            System.out.println(p.toString());
        }
    }
                
    public static void listCity(ArrayList<Person> people, String city){
        int len = people.size();
        int count = 0;
        
        for(Person p : people){
            if(p.getCity().equals(city)){
                count++;
            }
        }
        
        double pct = count*100 / len;
        System.out.println("Percent of people in "+city+": "+pct+"%");
    }
    
    public static void allCities(ArrayList<Person> people){
        listCity(people, "Budapest");
        listCity(people, "Debrecen");
        listCity(people, "Szeged");
    }
    
    public static boolean isLeapYear(int n){
        if(n%100 == 0){
            if(n%400 == 0){
                return true;
            }
            return false;
        }
        if(n%4==0){
            return true;
        }
        return false;
    }
    
    public static void listLeap(ArrayList<Person> people){
        for(Person p : people){
            int year = p.getYear();
            if(isLeapYear(year)){
                System.out.println(p.toString());
            }
        }
    }
}
