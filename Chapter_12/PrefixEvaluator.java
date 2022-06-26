/*
This program evaluates prefix expressions that include the +, -, *, /, % operators
 */
package Chapter_12;

/**
 *
 * @author dani
 */
import java.util.*;
public class PrefixEvaluator {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.println("enter expression: ");
        double value = evaluate(console);
        System.out.println("value: "+value);
    }
    
    public static double evaluate(Scanner input){
        if(input.hasNextDouble()){
            return input.nextDouble();
        }else{
            String operator = input.next();
            double operand1 = evaluate(input);
            double operand2 = evaluate(input);
            return apply(operator, operand1, operand2);
        }
    }
    
    public static double apply(String operator, double operand1, double operand2){
        if(operator.equals("+")){
            return operand1 + operand2;
        }else if(operator.equals("-")){
            return operand1 - operand2;
        }else if(operator.equals("*")){
            return operand1 * operand2;
        }else if(operator.equals("/")){
            return operand1 / operand2;
        }else if(operator.equals("%")){
            return operand1 + operand2;
        }else{
            throw new IllegalArgumentException("incorrect operator: "+operator);
        }
    }
}
