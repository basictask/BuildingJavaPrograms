/*

 */
package Excercise9_GBill;

/**
 *
 * @author dani
 */

import java.util.*;
public class GroceryBill_Main{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        
        Beer b = new Beer();
        CandyBar c = new CandyBar();
        Salad s = new Salad();
        Ham h = new Ham();
        Milk m = new Milk();
        
        Employee steve = new Employee(5);
        GroceryBill bill = new GroceryBill(steve);
        
        System.out.println("Available: 1:Beer/2:CandyBar/3:Ham/4:Milk/5:Salad");
        System.out.println();
        System.out.print("Enter first item: ");
        int i = console.nextInt();
        while(i != 0){
            if(i == 1){
                bill.add(b);
            }else if(i == 2){
                bill.add(c);
            }else if(i == 3){
                bill.add(h);
            }else if(i == 4){
                bill.add(m);
            }else if(i == 5){
                bill.add(s);
            }else{
                System.out.println("not available. try again");
            }
            System.out.print("next item: ");
            i = console.nextInt();
        }
        
        System.out.println();
        
        bill.printreceipt();
    }
}
