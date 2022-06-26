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
public class Odds {
    public static void main(String[] args){
        printOdds(3);
        printOdds(17/2);
   
    }
    
    public static void printOdds(int n) {
        for(int i=0; i<=n; i++){
            int odd = 2*i -1;
            System.out.print(odd + " ");
            
        }
        System.out.println();
    }
}
