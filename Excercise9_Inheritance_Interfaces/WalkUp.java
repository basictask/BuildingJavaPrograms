/*
Walk-up tickets are purchased the day of the event and cost $50.

Define the following operations:
• The ability to construct a ticket by number.
• The ability to ask for a ticket’s price.
• The ability to println a ticket object as a String . An example String would be "Number: 17, Price: 50.0" .

Implement a class called WalkupTicket to represent a walk-up event ticket. Walk-up tickets are also constructed by
number, and they have a price of $50.
 */
package Excercise9_Inheritance_Interfaces;

/**
 *
 * @author dani
 */
public class WalkUp extends Ticket{
    
    public WalkUp(int number){
        super(number);
    }
    
    public int getPrice(){
        return 50;
    }
    
    public String toString(){
        return "number: "+super.getNumber()+", Price: "+this.getPrice();
    }
}
