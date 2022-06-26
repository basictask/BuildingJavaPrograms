/*
This is a class to record bought shares from the stock market
 */
package Chapter9;

/**
 *
 * @author dani
 */
public class Stock{
    private String symbol;
    private int totalShares;
    private double totalCost;
    
    public Stock(String symbol){
        this.symbol = symbol;
        totalShares = 0;
        totalCost = 0.0;
    }
    
    public double getProfit(double currentPrice){
        double marketValue = totalShares * currentPrice;
        return marketValue - totalCost;
    }
    
    public void purchase(int shares, double pricePerShare){
        totalShares += shares;
        totalCost += shares*pricePerShare;
    }
    
    public int getTotalShares(){
        return totalShares;
    }
}
