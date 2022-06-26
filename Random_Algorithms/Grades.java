package test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dani
 */
// This program comutes your grades
/*A for scores ≥ 90
B for scores ≥ 80
C for scores ≥ 70
D for scores ≥ 60
F for scores < 60*/

import java.util.*;

public class Grades {
    
    public static void main(String[] args){
        
        int A = 90;
        int B = 80;
        int C = 70;
        int D = 60;
        
        String Grade = "no grade";
        
        Scanner console = new Scanner(System.in);       //Scanner objektum hívás
        System.out.print("Please input your score: ");
        int score = console.nextInt();
        
        if (score >= A){
            Grade = "A"; 
            
        }else if (score >= B){
            Grade = "B";
            
        }else if (score >= C){
            Grade = "C";
            
        }else if (score >= D){
            Grade = "D"; 
            
        }else{
            Grade = "F";
        }
        System.out.println("Your grade is: " + Grade);
    }
    
    
}
