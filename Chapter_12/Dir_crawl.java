/*
This program prompts the user for a file or directory name
and shows a listing of all files and directories that can be
reached from it (including subdirectories).
 */
package Chapter_12;

/**
 *
 * @author dani
 */
import java.util.*;
import java.io.*;
public class Dir_crawl {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("input directory or file name: ");
        String name = console.nextLine();
        File f = new File(name);
        
        if(!f.exists()){
            System.out.println("404");
        }else{
            print(f, 0);
        }
    }
    
    public static void print(File f, int level){
        for(int i=0; i<level; i++){
            System.out.print("    ");
        }
        
        System.out.println(f.getName());
        if(f.isDirectory()){
            for(File sub : f.listFiles()){
                print(sub, level+1);
            }
        }
    }
}
