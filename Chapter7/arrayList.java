/*
Basic operations with arrays
 */
package Chapter7;

/**
 *
 * @author dani
 */
public class arrayList {
    public static void main(String[] args){
        int[] list = new int[5];
        for(int i = 0; i<list.length; i++){
            list[i] = 2*i+1;                    //fill up list with odd numbers
        }
        System.out.println("first: " + list[0] );
        System.out.println("middle: " + list[(list.length - 1) / 2]);
        System.out.println("last: " + list[list.length - 1]);
    }
}
