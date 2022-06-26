/*

 */
package Chapter_13;

import java.util.Arrays;

/**
 *
 * @author dani
 */
public class Binary {
    public static void main(String[] args){
        int[] numbers = {-50, -14, -8, 0, 1, 4, 7, 12, 35, 48, 55, 57, 63, 66, 67, 74, 89, 99};
        System.out.println(Arrays.toString(numbers));
        System.out.println("index of 57: "+binarySearch(numbers, 57));
    }
    
    public static int binarySearch(int[] numbers, int target){
        int min=0;
        int max = numbers.length-1;
        while(min<max){
            int mid = (max+min)/2;
            if(numbers[mid]==target){
                return mid;
            }else if(numbers[mid]<target){
                min = mid+1;
            }else{
                max = mid-1;
            }
        }
        return -1;
    }
}
