/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author dani
 */
public class number {
    public static final int SOR=5;
    public static void main(String[] args){
    
        for (int i=1; i<=SOR; i++){
            
            for (int j=SOR; j>=i; j--){
                System.out.print(" ");
            }
            System.out.println(i);
            System.out.println();
        }
    }
    
}
