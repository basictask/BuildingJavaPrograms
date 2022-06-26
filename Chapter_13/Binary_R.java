/*

 */
package Chapter_13;

/**
 *
 * @author dani
 */
import java.util.*;
public class Binary_R {
    public static void main(String[] args){
        int[] numbers = {-50, -14, -8, 0, 1, 4, 7, 12, 35, 40, 48, 55, 57, 58, 60, 63, 66, 67, 74, 89, 99};
        System.out.println(Arrays.toString(numbers));
        System.out.println("index of 57: "+binarySearchR(numbers, 57));
    }
    
    public static int binarySearchR(int[] numbers, int target){
        return binarySearchR(numbers, target, 0, numbers.length-1);
    }
    
    private static int binarySearchR(int[] numbers, int target, int min, int max){
        if(min>max){
            return -1;
        }else{
            int mid = (min+max)/2;
            if(numbers[mid]==target){
                return mid;
            }else if(numbers[mid]<target){
                return binarySearchR(numbers, target, mid+1, max);
            }else{
                return binarySearchR(numbers, target, min, mid+1);
            }
        }
    }
}
