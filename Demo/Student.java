/*

 */
package vizsga;

/**
 *
 * @author dani
 */
public class Student {
    private String neptun;
    private String name;
    private boolean gender;
    
    public Student(String neptun, String name, boolean gender){
        this.neptun = neptun;
        this.name = name;
        this.gender = gender;
    }
    
    public String getName(){
        return this.name;
    }
    public String getNeptun(){
        return this.neptun;
    }
    public String getGender(){
        if(this.gender){
            return "male";
        }
        return "female";
    }
    
    public String toString(){
        return "neptun: "+this.getNeptun()+",  name: "+this.getName()+",  gender: "+this.getGender();
    }
    
    public void setName(String s){
        this.name = s;
    }
    
    public void setNeptun(String s){
        this.neptun = s;
    }
    
    public void setGender(boolean b){
        this.gender = b;
    }
}
