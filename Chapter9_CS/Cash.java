/*
This class implements Asset
 */
package Chapter9_CS;

/**
 *
 * @author dani
 */
public class Cash implements Asset{
    private double amount;
    
    public Cash(double amount){
        this.amount = amount;
    }
    
    public double getAmount(){
        return this.amount;
    }
    
    public double getMarketValue(){
        return this.amount;
    }
    
    public double getProfit(){
        return 0.0;
    }
    
    public double setAmount(double amount){
        return amount;
    }
    
    public boolean equals(Cash c){
        return this.getAmount() == c.getAmount();
    }
}
