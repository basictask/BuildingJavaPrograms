/*

 */
package test;

/**
 *
 * @author dani
 */
import java.util.*;
public class rendszam {
    public static void main(String[] args){
        String rendszam = rendszam();
        System.out.println(rendszam);
        
    }
    
    public static String rendszam(){
        String letter = getLetter();
        String num = getNum();
        return letter+"-"+num;
    }
    
    public static String getLetter(){
        Random r = new Random();
        String result = "";
        String[] letters ={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","V","W","X","Y","Z",};
        for(int i=0; i<3; i++){
            int n = r.nextInt(25);
            String l = letters[n];
            result+=l;
        }
        return result;
    }
    
    public static String getNum(){
        Random r = new Random();
        String[] numbers ={"1","2","3","4","5","6","7","8","9"};
        String result="";
        for(int i=0; i<3; i++){
            int n = r.nextInt(9);
            String l = numbers[n];
            result+=l;
        }
        return result;
    }
}
