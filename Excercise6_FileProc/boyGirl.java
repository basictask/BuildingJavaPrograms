/*
Write a method called boyGirl that accepts a Scanner that is reading its input from a file containing a series of
names followed by integers. The names alternate between boys’ names and girls’ names. Your method should com-
pute the absolute difference between the sum of the boys’ integers and the sum of the girls’ integers. The input could
end with either a boy or girl; you may not assume that it contains an even number of names. 

For example, if the  input file contains the following text:
Erik 3 Rita 7 Tanner 14 Jillyn 13 Curtis 4 Stefanie 12 Ben 6
Then the method should produce the following console output, since the boys’ sum is 27 and the girls’ sum is 32:
4 boys, 3 girls
Difference between boys' and girls' sums: 5
 */
package Excercise6_FileProc;

/**
 *
 * @author dani
 */
import java.io.*;
import java.util.*;
public class boyGirl {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner input = new Scanner(new File("names.txt"));
        
        int bsum = 0;
        int gsum = 0;
        
        if (input.hasNext()){
            while(input.hasNext()){
                
                input.next();
                int bnum = input.nextInt();
                bsum += bnum;
                
                if (input.hasNext()){
                    input.next();
                    int gnum = input.nextInt();
                    gsum += gnum;
                }
            }
            
            int diff = 0;
            if(bsum>gsum){
                diff = bsum-gsum;
            }else if (gsum > bsum){
                diff = gsum-bsum;
            }
            System.out.println("The difference between girls' and boys' sums: " + diff);
        }
    }
}
