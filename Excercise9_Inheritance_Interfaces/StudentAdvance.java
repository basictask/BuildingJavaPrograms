/*
Implement a class called StudentAdvanceTicket to represent tickets purchased in advance by students. 
A student advance ticket is constructed with a ticket number,
    and with the number of days in advance that the ticket was purchased. 

Student advance tickets purchased 10 or more days before the event cost $15, 
and student advance tickets purchased fewer than 10 days before the event cost $20 (half of a normal advance ticket). 

When a student advance ticket is printed, the String should mention that the student must show his or her student ID 
(for example, "Number: 17, Price: 15.0 (ID required)" ).
 */
package Excercise9_Inheritance_Interfaces;

/**
 *
 * @author dani
 */
public class StudentAdvance extends Advance{
    
    StudentAdvance(int number, int days){
        super(number, days);
    }
    
    public int getPrice(){
        if(super.getDays()>10){
            return super.getPrice()/2;
        }
        return super.getPrice()/2;
    }
    
    public String toString(){
        return super.toString()+" (ID required)";   
    }
}
