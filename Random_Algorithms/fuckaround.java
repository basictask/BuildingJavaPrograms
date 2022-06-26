/*

 */
package test;
import java.util.*;
/**
 *
 * @author dani
 */
public class fuckaround {
    public static void main(String[] args){
        metodus();
    }
    
    public static void metodus(){
        Random r = new Random();                 //random 
        int[] tomb = new int[10];                //10 elemu tomb
        
        for (int i = 0; i < tomb.length; i++) {  //ciklus az adatsorra
            tomb[i] = r.nextInt(41)-10;          // erteket adok az i-edik elemnek
             
            if(i%2 == 0){                        // HA paros    (0 parosnak szamit)
                tomb[i] = tomb[i]*2;             // akkor szorozza 2-vel
            }
        }
    }
}
