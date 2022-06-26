//BMI test

package test;

import java.util.*;

public class bmi {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        double bmi1 = getBMI(console);
        double bmi2 = getBMI(console);
        System.out.println(bmi1);
        System.out.println(bmi2);
        
    }
    
    public static double getBMI(Scanner console){
        System.out.println("enter next persons info: ");
        System.out.print("height? ");
        double height = console.nextDouble();
        System.out.print("weight? ");
        double weight = console.nextDouble();
        double bmi = BMIfor(height, weight);
        System.out.println();
        return bmi;
    }
    
    public static double BMIfor(double height, double weight){
        return weight / (height*height)*703;
    }
}
