/*
this program increments all the elements in an array
 */
package Chapter7;

/**
 *
 * @author dani
 */
public class incrementAll {
    public static void main(String[] args){
        int[] list = new int[5];
        for(int i = 0; i<list.length; i++){
            list[i] = 2*i+1;
            System.out.println(list[i]);
        }
        System.out.println();
        incrementAll(list);
    }
    
    public static void incrementAll(int[] data){
        for(int i =0; i<data.length; i++){
            data[i]++;
            System.out.println(data[i]);
        }
    }
}
