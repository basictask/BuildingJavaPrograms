/*

 */
package Chapter_10;

/**
 *
 * @author dani
 */
public class Angle implements Comparable<Angle>{
    private int degrees;
    private int minutes;
    
    public Angle(int degrees, int minutes){
        this.degrees = degrees;
        this.minutes = minutes;
    }
    
    public int compareTo(Angle other){
        if(this.degrees != other.degrees){
            return this.degrees - other.degrees;
        }else{
            return this.minutes - other.minutes;
        }
    }
    
    public int getDegrees(){
        return this.degrees;
    }
    
    public int getMinutes(){
        return this.minutes;
    }
    
    public String toString(){
        return this.degrees+"'"+this.minutes+"\"";
    }
}
