/*
Define a class DiscountBill that extends GroceryBill to compute discounts for preferred customers. 
Its constructor accepts a parameter for whether the customer should get the discount. 
Your class should also adjust the total reported for preferred customers. 

For example, if the total would have been $80 but a preferred customer is getting $20 in discounts, 
then getTotal should report the total as $60 for that customer. 

Also keep track of the number of items on which a customer is getting a nonzero discount and the sum of these discounts, 
both as a total amount and as a percentage of the original bill. 

Include the extra methods that follow, which allow a client to ask about the discount. 
Return 0.0 if the customer is not a preferred customer or if no items were discounted. 

public DiscountBill(Employee clerk, boolean preferred)
    Constructs bill for given clerk

public int getDiscountCount()
    Returns the number of items that were discounted, if any

public double getDiscountAmount()
    Returns the total discount for this list of items, if any

public double getDiscountPercent()
    Returns the percent of the total discount as a percent of what the total would have been otherwise
 */
package Excercise9_GBill;

/**
 *
 * @author dani
 */
public class DiscountBill extends GroceryBill{
    private boolean preferred;
    private int total;
    private int noDiscount;
    private String receipt;
    private int discountCount;
    private int discountAmount;
    
    public DiscountBill(Employee clerk, boolean preferred){
        super(clerk);
        this.preferred = preferred;
        this.noDiscount = 0;
        this.receipt = "";
        this.discountCount = 0;
        this.discountAmount = 0;
    }
    
    public void add(Item i){
        this.noDiscount += i.getPrice();
        if(this.preferred == true){
            this.total += i.getDiscount();
            this.receipt += i.getName() + "..................."+ i.getDiscount()+"\n";
            this.discountCount++;
            this.discountAmount += (i.getPrice()-i.getDiscount());
        }else{
            this.total += i.getPrice();
            this.receipt += i.getName() + "..................."+ i.getPrice()+"\n";
        }
    }
    
    public int getDiscountCount(){
        return this.discountCount;
    }
    
    public int getDiscountAmount(){
        return this.discountAmount;
    }
    
    public double getDiscountPercent(){
        if(this.total == this.noDiscount){
            return 0.0;
        }else{
            return (this.total*100)/this.noDiscount;
        }
    }
    
    public void PrintReceipt(){
        System.out.println(this.receipt);
        System.out.println("Total..................."+this.total);
        System.out.println();
        System.out.println("Discount");
        System.out.println("Items..................."+this.getDiscountCount());
        System.out.println("Amount.................."+this.getDiscountAmount());
        System.out.println("Percent................."+this.getDiscountPercent()+"%");
        
    }
}
