/*

 */
package test;

/**
 *
 * @author dani
 */
public class Student_main {
    public static void main(String[] args){
        Student dani = new Student("dani", "programozas", 3);
        System.out.println("grade: "+dani.getGrade());
        
        dani.setGrade(5);
        
        System.out.println("grade after set: "+dani.getName());
        
        System.out.println("subject: "+dani.getSubject());
    }
}
