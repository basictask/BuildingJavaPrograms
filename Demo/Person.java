/*
Készítsen Személy osztályt a következő adattagokkal: név, születési év, város. 
 */
package vizsga;

/**
 *
 * @author dani
 */
public class Person {
    private String name;
    private int year;
    private String city;
    
    public Person(String name, int year, String city){
        this.name = name;
        this.year = year;
        this.city = city;
    }
    
    public String toString(){
        return this.getName()+",  "+this.getYear()+",  "+this.getCity();
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getYear(){
        return this.year;
    }
    
    public String getCity(){
        return this.city;
    }
}
