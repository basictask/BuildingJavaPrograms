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
public class Song {
    
    public static void main(String[] args){
        verse("wheels", "go", "round and round");
        verse("children", "sing", "hay hay hay"); 
        verse("driver", "says", "quiet please");
    }
    
    public static void verse(String item, String verb, String sound){
        System.out.println("The " + item + " on the bus " + verb + " " + sound);
        System.out.println(sound + ",");
        System.out.println(sound + ".");
        System.out.println();
    }
}
