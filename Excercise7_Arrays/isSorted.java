/*
Write a method called isSorted that accepts an array of real numbers as a parameter and returns true if the list is in
sorted (nondecreasing) order and false otherwise. For example, if arrays named list1 and list2 store {16.1, 12.3,
22.2, 14.4} and {1.5, 4.3, 7.0, 19.5, 25.1, 46.2} respectively, the calls isSorted(list1) and isSorted(list2)
should return false and true respectively. Assume the array has at least one element. A one-element array is consid-
ered to be sorted.
 */
package Excercise7_Arrays;

/**
 *
 * @author dani
 */
public class isSorted {
    public static void main(String[] args){
        double[] list1 = {16.1, 12.3, 22.2, 14.4};
        double[] list2 = {1.5, 4.3, 7.0, 19.5, 25.1, 46.2, 54.3, 55.2, 65.2, 69.4};
        double[] list3 = {4.5};
        System.out.println(isSorted(list3));
    }
    
    public static boolean isSorted(double[] list){
        int count = 0;
        for(int i = 1; i<list.length; i++){
            if(list[i]>list[i-1]){
                count++;
            }
        }
        if(count == list.length-1){
            return true;
        }else{
            return false;
        }
    }
}
