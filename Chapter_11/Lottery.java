/*
Plays a lottery game with the user, reading the user's number, and printing how many matched
 */
package Chapter_11;

/**
 *
 * @author dani
 */
import java.util.*;
public class Lottery {
    public static final int NUMBERS = 6;
    public static final int MAX_NUMBER = 40;
    public static final int PRIZE = 100;
    
    public static void main(String[] args){
        Set<Integer> winning = createWinning();
        Set<Integer> ticket = getTicket();
        System.out.println();
        
        Set<Integer> matches = new TreeSet<Integer>(ticket);
        matches.retainAll(winning);
        
        System.out.println("your ticket: "+ticket);
        System.out.println("winning: "+winning);
        
        if(matches.size()>0){
            double prize = 100*Math.pow(2, matches.size());
            System.out.println("Matched numbers: "+matches);
            System.out.printf("Your prize is $%.2f\n", prize);
        }
    }   
    
    public static Set<Integer> createWinning(){
        Set<Integer> winning = new TreeSet<Integer>();
        Random r = new Random();
        while(winning.size() < NUMBERS){
            int number = r.nextInt(MAX_NUMBER)+1;
            winning.add(number);
        }
        return winning;
    }
    
    public static Set<Integer> getTicket(){
        Set<Integer> ticket = new TreeSet<Integer>();
        Scanner console = new Scanner(System.in);
        System.out.println("Type "+NUMBERS+" lotto numbers between 1 and 40: ");
        while(ticket.size()<NUMBERS){
            int number = console.nextInt();
            ticket.add(number);
        }
        return ticket;
    }
}
