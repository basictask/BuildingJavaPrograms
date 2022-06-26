/*

 */
package Excercise9_GBill;

/**
 *
 * @author dani
 */
public class Ham implements Item{
    
    public int getPrice(){
        return 500;
    }
    
    public int getDiscount(){
        return 400;
    }
    
    public String getName(){
        return "Ham";
    }
}
