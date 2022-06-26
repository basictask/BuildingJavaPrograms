/*

 */
package Excercise9_GBill;

/**
 *
 * @author dani
 */
public class Milk implements Item{
    
    public int getPrice(){
        return 250;
    }
    
    public int getDiscount(){
        return 200;
    }
    
    public String getName(){
        return "Milk";
    }
}
