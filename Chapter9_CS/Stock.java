/*
This is a class to record bought shares from the stock market
 */
package Chapter9_CS;

/**
 *
 * @author dani
 */
public class Stock extends ShareAsset{
    private int totalShares;
    
    public Stock(String symbol, double currentPrice){
        super(symbol, currentPrice);
        totalShares = 0;
    }
    
    public double getMarketValue(){
        return totalShares * getCurrentPrice();
    }
    
    public int getTotalShares(){
        return totalShares;
    }
    
    public void purchase(int shares, double pricePerShare){
        totalShares += shares;
        addCost(shares*pricePerShare);
    }
}
