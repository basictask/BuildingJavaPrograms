/*

 */
package Chapter9_CS;

/**
 *
 * @author dani
 */
public class MutualFund extends ShareAsset{
    private int totalShares;
    
    public MutualFund(String symbol, double currentPrice){
        super(symbol, currentPrice);
        totalShares = 0;
    }
    
    public double getMarketValue(){
        return totalShares * getCurrentPrice();
    }
    
    public int getTotalShares(){
        return totalShares;
    }
    
    public void purchase(double shares, double pricePerShare){
        totalShares += shares;
        addCost(shares*pricePerShare);
    }
}
