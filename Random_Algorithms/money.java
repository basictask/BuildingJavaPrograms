package test;

/*Ez a program eldönti egy felhasználótól bekért szám alapján, 
hogy annak a pénze sok vagy kevés
*/
import java.util.*;
public class money{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        
        int money = 500;
        
        System.out.println("You have "+money+" left");
        if (money < 500) {
            System.out.println("low");
        } else if (money < 1000) {
            System.out.println("okay");
        } else {
            System.out.println("much");
        }
        System.out.print("bet: ");
        console.nextInt();
    }
    
}
