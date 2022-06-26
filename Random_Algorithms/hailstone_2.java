/*

 */
package test;
import java.util.*;
/**
 *
 * @author dani
 */
public class hailstone_2 {
    public static void main(String[] args){             //main metodus
        Scanner console = new Scanner(System.in);       //Scanner objektum letrehozasa
        System.out.print("enter first number: ");       //kiiratas
        int n = console.nextInt();                      //felvesszuk n valtozoba a beirt szamot
        hailstone(n);                                   //hailstone metodus meghivasa
    }
    
    public static void hailstone(int n){                //hailstone metodus
        int count=0;                                    //a lepesek szamlaloja 0
        System.out.print(n+", ");                       //az elso (bekert) szam kiiratasa
        while(n!=1){                                    //ameddig 1 nem lesz, vegezze a muveletet
            n = nextn(n);                               //n-nek ertekadas a nextn metoduson at
            count++;                                    //minden futas alkalmaval szamlalo novelese
            System.out.print(n+", ");                   //kepernyore kiirjuk n-t
        }
        System.out.println();
        System.out.println("Number of steps: "+count);  //a lepesek szama
    }
    
    public static int nextn(int n){                     //nextn metodus, kiszamolja menniy a kovetkezo n
        if(n%2==0){                                     //ha paros, 
            return n/2;                                 //visszater n/2 -vel
        }else{                                          //ha paratlan
            return n*3+1;                               //visszater n*3+1 -el
        }
    } 
}
