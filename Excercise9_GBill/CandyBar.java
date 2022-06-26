/*

 */
package Excercise9_GBill;

/**
 *
 * @author dani
 */
public class CandyBar implements Item{
    
    public int getPrice(){
        return 100;
    }
    
    public int getDiscount(){
        return 50;
    }
    
    public String getName(){
        return "CandyBar";
    }
}
