/*

 */
package Chapter9;

/**
 *
 * @author dani
 */
public class DividendStock extends Stock{
    private double dividends;
    
    public DividendStock(String symbol){
        super(symbol);
        dividends = 0.0;
    }
    
    public void payDividend(double amountPerShare){
        dividends += amountPerShare*getTotalShares();
    }
}
