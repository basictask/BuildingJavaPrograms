/*
Tervezzünk egy Diák osztályt.
Tervezzük meg, hogy milyen mezők írják le a tanulmányi eredményeit.

Ez alapján hozzunk létre 5 tetszőleges diák objektumot, melyek a Diák osztály mezői alapján vesznek fel értékeket.
Adjunk a diákok mezőinek értékeket (pl. dani.matek = 3;, fruzsina.programozas = 5; ) stb.
Írjuk meg a mezők hozzáférő (getter) és módosító (setter) metódusait.

 */
package test;

/**
 *
 * @author dani
 */
public class Student {
    private String name;
    private String subject;
    private int grade;
    
    public Student(String name, String subject, int grade){
        this.name = name;
        this.subject = subject;
        this.grade = grade;
    }
    
    public void setGrade(int n){
        this.grade = n;
    }
    
    public void setSubject(String s){
        this.subject = s;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getSubject(){
        return this.subject;
    }
    
    public int getGrade(){
        return this.grade;
    }
}
