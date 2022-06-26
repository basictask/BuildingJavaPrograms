/*
The method equality tests two arrays if they are equal, returns the correct boolean value
Two lists are equal if their lengths are nondifferent and they store the same sequence of values in the same places.
*/
package Chapter7;

/**
 *
 * @author dani
 */
public class equality {
    public static void main(String[] args){
        int[] list1 = {1, 4, 7, 8, 10, 14};
        int[] list2 = {1, 4, 7, 8, 10, 14};
        System.out.println("lists being equal: "+equality(list1, list2));
    }
    
    public static boolean equality(int[] list1, int[] list2){
        if(list1.length != list2.length){                             //testing length
            return false;
        }
        for (int i = 0; i < list1.length; i++){
            if(list1[i] != list2[i]){                                //testing values 
                return false;
            }
        }
        return true;
    }
}
