package test;

/*Hailstone probléma. Ha egy számból kiindulunk: 
páros: x/2
páratlan: 3x+1
Ezt a sorozatot követve mindig eljutunk a 4 2 1 számhármashoz.
Ebben a példában length tagra számoljuk a sorozatot
*/
import java.util.*;
public class hailstone {
    public static void maxmin(int value, int length){       //value a kezdeti szám
        int max = value;
        int min = value;
        
        for (int i=0; i<=length-1; i++){
            
            double next = 0;
            
            if (value % 2 == 0){           //Ha páros, elvégzi a műveletet
                value = value / 2;            
            }else{                         //Ha páratlan, elvégzi a műveletet
                value = value * 3 + 1;
            }
            
            System.out.print(value+ "; "); //Kiírja a számok sorozatát
            
            
            if (value > max){              //Eldönti, hogy a szám a legnagyobb-e
                max = value;
            }else if (value < max ){       //Eldönti, hogy a szám a legkisebb-e
                min = value;
            }
        }
        System.out.println();
        System.out.println("Maximum: "+max);
        System.out.println("Minimum: "+min);
    }
       
    public static void main(String[] args){
        Scanner console = new Scanner(System.in); //felhasználótól bekért inputok
        System.out.print("input value: ");
        int v = console.nextInt();
        System.out.print("input length: ");
        int p = console.nextInt();
        
        maxmin(v, p);  //method call maxmin-re
    }
}
