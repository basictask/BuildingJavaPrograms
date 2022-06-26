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
public class Triangles {
    
    public static void main(String[] args){
        double a = 3;
        double b = 5;
        double c = 6;
        double d = 7;
        System.out.println("elso haromszog atfogoja: " + atfogo(a, b));
        System.out.println("masodik haromszog atfogoja: " + atfogo(c, d));
        System.out.println("elso haromszog kerulete: " + (a+b+atfogo(a, b)));
        System.out.println("masodik haromszog kerulete: " + (c+d+atfogo(c, d)));
    }
    
    public static double atfogo(double a, double b){
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b,2));
    }
}
