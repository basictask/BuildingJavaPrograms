/*

 */
package vizsga;

/**
 *
 * @author dani
 */
import java.util.*;
public class Graduate {
    private String neptun;
    private HashMap<String, Integer> grades;
    private int age;
    
    public Graduate(String neptun, HashMap<String, Integer> grades, int age){
        this.neptun = neptun;
        this.grades = grades;
        this.age = age;
    }
    
    public String getNeptun(){
        return this.neptun;
    }
    public String getGrades(){
        return this.grades.toString();
    }
    public int getAge(){
        return this.age;
    }
    
    public String toString(){
        return this.getNeptun()+",  "+this.getGrades()+",  "+this.getAge();
    }
    
    public void setNeptun(String s){
        this.neptun = s;
    }
    
    public HashMap<String, Integer> getMap(){
        return this.grades;
    }
    
    public double getAverage(){
        int sum = 0;
        for(String s : this.getMap().keySet()){
            int a = this.getMap().get(s);
            sum += a;
        }
        return sum/3;
    }
}
