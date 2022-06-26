/*
Suppose a class GroceryBill keeps track of a list of items being purchased at a market:

public GroceryBill(Employee clerk) 
    Constructs a grocery bill object for the given clerk

public void add(Item i) 
    Adds the given item to this bill

public double getTotal()
    Returns the total cost of these items

public void printReceipt()
    Prints a list of items

Grocery bills interact with Item objects, each of which has the public methods that follow. 
A candy bar item might cost 1.35 with a discount of 0.25 for preferred customers, 
meaning that preferred customers get it for 1.10. (Some items will have no discount, 0.0.) 
Currently the preceding classes do not consider discounts. 
Every item in a bill is charged full price, and item discounts are ignored.

public double getPrice()
    Returns the price for this item

public double getDiscount()
    Returns the discount for this item
 */
package Excercise9_GBill;

/**
 *
 * @author dani
 */
public class GroceryBill {
    private String receipt;
    private int total;
    
    public GroceryBill(Employee clerk){
        this.total = 0;
        this.receipt = "";
    }
    
    public void add(Item i){
        this.total += i.getPrice();
        this.receipt += i.getName() + "..........."+ i.getPrice()+"\n";
    }
    
    public int getTotal(){
        return this.total;
    }
    
    public void printreceipt(){
        System.out.println(receipt);
        System.out.println("Total..........."+this.getTotal());
    }
}
