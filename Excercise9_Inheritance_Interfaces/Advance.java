/*
Implement a class called AdvanceTicket to represent tickets purchased in advance. 
An advance ticket is constructed with a ticket number and with the number of days in advance that the ticket was purchased. 
Advance tickets purchased 10 or more days before the event cost $30, 
and advance tickets purchased fewer than 10 days before the event cost $40.
 */
package Excercise9_Inheritance_Interfaces;

/**
 *
 * @author dani
 */
public class Advance extends Ticket{
    private int days;
    
    public Advance(int number, int days){
        super(number);
        this.days = days;
    }
    
    public int getPrice(){
        if(this.days>10){
            return 30;
        }
        return 40;
    }
    
    public String toString(){
        return "Number: "+super.getNumber()+", Price: "+this.getPrice();
    }
    
    public int getDays(){
        return this.days;
    }
}
