/*
This program demonstrates the behaviour of maps
 */
package Chapter_11;

/**
 *
 * @author dani
 */
import java.util.*;
public class Map_1 {
    public static void main(String[] args){
        Map<String, Double> salaryMap = new HashMap<String, Double>();
        salaryMap.put("Stuart Reges", 10000.00);
        salaryMap.put("Reges Stepp", 95500.00);
        salaryMap.put("Jenny", 86543.00);
        
        double jenSalary = salaryMap.get("Jenny");
        System.out.println("Jenny's salary is: "+jenSalary);
        
        Scanner console = new Scanner(System.in);
        System.out.print("Type a person's name: ");
        String name = console.next();
        
        if(salaryMap.containsKey(name)){
            double salary = salaryMap.get(name);
            System.out.printf("%s's salary is %f", name, salary);
        }else{
            System.out.println("I don't have a record for that name.");
        }
    }
}
