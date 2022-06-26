/*

 */
package Excercise9_GBill;

/**
 *
 * @author dani
 */
public class Beer implements Item{
    
    public int getPrice(){
        return 200;
    }
    
    public int getDiscount(){
        return 150;
    }
    
    public String getName(){
        return "Beer";
    }
}
