/*
Write a method called randomWalk that performs steps of a random one-dimensional walk. The random walk
should begin at position 0. On each step, you should either increase or decrease the position by 1 (each with equal
probability). Your code should continue making steps until a position of 3 or -3 is reached, and then report the max-
imum position that was reached during the walk. The output should look like the following:
position = 1
position = 0
position = –1
position = –2
position = –1
position = –2
position = –3
max position = 1
 */
package Excercise5_Logic_Indefloops;

/**
 *
 * @author dani
 */
import java.util.*;
public class randomWalk {
    public static void main(String[] args){
        randomWalk();
    }
    public static void randomWalk(){
        Random r = new Random();
        int position = 0;
        int max = 0;
        
        while (position < 3 && position > -3){
            int rand = r.nextInt(2);
            if(rand == 0){
                position--;
            }else{
                position++;
            }
            
            if (position > max){
                max = position;
            }
            System.out.printf("position = %2d \n",position);
        }
        System.out.println("max. position: " + max);
    }
}
