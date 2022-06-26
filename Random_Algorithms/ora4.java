/*
1. Gyakorlás: számok bekérése billentyûrõl és véletlen szám generálása
2. Gyakorlás: képlet szerkesztése (hatvány, PI, stb.)
3. Gyakorlás: tömbbe íratni képletet
4. Gyakorlás: Felvenni tömbbe egész számokat. Kiíratni a 3-al oszthatóakat!
5. For-al kiíratni a tömb elemeit fordított sorrendben.
6. új anyag: do while ciklus
	6.1. addig kérünk be egy egész számot, amíg 0-t nem adunk meg!
		megoldás (for-break-el is)
	6.2. érdemjegy bekérése (kiíratni kisebb vagy nagyobb szám kell!)
	6.3. irányítószám bekérése
	6.4. gép által generált szám kitalálása
 */
package test;

/**
 *
 * @author dani
 */
import java.util.*;
public class ora4 {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        Random r = new Random();
        System.out.print("input number: ");
        int egy = console.nextInt();
        
        System.out.print("generated random: ");
        int ketto = r.nextInt();
        System.out.println(ketto);
        
        int[] list = new int[31];
        for(int i = 0; i<31; i++){
            list[i] = i;
        }
        System.out.println(Arrays.toString(list));
        
        System.out.println("divisable by 3: ");
        for(int i = 1; i<list.length; i++){
            if(list[i]%3==0){
                System.out.print(list[i]+", ");
            }
        }
        System.out.println();
        
        System.out.println("reverse order: ");
        for(int i = list.length; i>0; i--){
            System.out.print(list[i-1]+", ");
        }
        
        System.out.println();
        System.out.println();
        int n = 1;
        while(n != 0){
            System.out.print("input number: ");
            n = console.nextInt();
        }
        
        System.out.println();
        int sum;
        do{
            int roll1 = r.nextInt(6)+1;
            int roll2 = r.nextInt(6)+1;
            sum = roll1+roll2;
            System.out.printf("%d + %d = %d \n", roll1, roll2, sum);
        }while(sum != 7);
    }
}
