/*

 */
package Chapter_13;

/**
 *
 * @author dani
 */
import java.util.*;
import java.io.*;
public class BinarySearchS {
    public static void main(String[] agrs) throws FileNotFoundException{
        Scanner input = new Scanner(new File("fruits.txt"));
        ArrayList<String> list = new ArrayList<String>();
        while(input.hasNext()){
            String next = input.next().toLowerCase();
            list.add(next);
        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println();
        System.out.println(list);
        int a = binarySearchS(list, "melon");
        System.out.println();
        System.out.printf("melon is in the %dth place\n",a+1);
    }
    
    public static int binarySearchS(ArrayList<String> list, String target){
        int min = 0;
        int max = list.size()-1;
        while(min<max){
            int mid = (max+min)/2;
            int compare = list.get(mid).compareTo(target);
            if(compare == 0){
                return mid;
            }else if(compare<0){
                min = mid+1;
            }else{
                max = mid-1;
            }
        }
        return -1;
    }
}
