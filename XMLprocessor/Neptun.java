/*

 */
package test_2;
import java.util.*;
/**
 *
 * @author dani
 */
public class Neptun {
    public static void main(String[] args){
        for(int i=0; i<5; i++){
            System.out.println(neptun());
        }
    }
    
    public static String neptun(){
        Random r = new Random();
        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        String result = "";
        for(int i=0; i<6; i++){
            char ch = s.charAt(r.nextInt(36));
            result += ch;
        }
        return result;
    }
}
