/*

 */
package test;

/**
 *
 * @author dani
 */
import java.util.*;
public class zene {
    public static void main(String[] args){
        getmood();
    }
    
    public static void getmood(){
        Scanner console = new Scanner(System.in);
        System.out.println("Moods:");
        System.out.println("1:happy, 2:sad, 3:party");
        System.out.print("enter mood: ");
        int n = getNumber(console);
        getmusic(n);
    }
    
    public static void getmusic(int n){
        ArrayList<String> happy = new ArrayList<String>();
        happy.add("Mandragora - Caroussell");
        happy.add("Weeding dub - Believe in yrslf");
        
        ArrayList<String> sad = new ArrayList<String>();
        sad.add("youtube: sad songs that will make you cry");
        sad.add("Boris Brejcha - Dark Planet");
        
        ArrayList<String> party = new ArrayList<String>();
        party.add("Despacito");
        party.add("Shape of you");
        
        Random r = new Random();
        int song = r.nextInt(2);
        
        if(n == 1){
            System.out.println(happy.get(song));
        }else if(n == 2){
            System.out.println(sad.get(song));
        }else if(n == 3){
            System.out.println(party.get(song));
        }else{
            System.out.println("not available. try again");
            getmood();
        }
    }
    
    public static int getInt(Scanner console){
        System.out.print("input number: ");
        
        while(!console.hasNextInt()){
            console.next();
            System.out.println("not an integer. try again.");
            System.out.print("input guess: ");
        }
    return console.nextInt();
    }
    
    public static int getNumber(Scanner console){
        int guess = getInt(console);
        
        while (guess < 1 || guess > 3){
            System.out.println("out of range. try again. ");
            guess = getInt(console);
        }
    return guess;
    }
}
