/*
An inversion is defined as a pair of numbers in which the first number in the list is greater than the second number.
This is a program to find all the possible inversions in an array of integers.
 */
package Chapter7;

/**
 *
 * @author dani
 */
public class inversions {
    public static void main(String[] args){
        int[] data = {7, 4, 8, 6, 5, 3};
        for(int i = 0; i<data.length-1; i++){
            for(int j = i+1; j<data.length; j++){
                if(data[i] > data[j]){
                    System.out.println(data[i]+", "+data[j]);
                }
            }
        }
    }
}
