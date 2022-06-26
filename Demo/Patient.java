/*
Készítsen KezeltSzemely osztályt a következő adattagokkal: 
Név, életkor, testmagasság, súly. 
 */
package vizsga;

/**
 *
 * @author dani
 */
public class Patient {
    private String name;
    private int age;
    private boolean gender;
    private int height;
    private int weight;
    
    public Patient(String name, boolean gender, int age, int height, int weight){
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
    
    public String toString(){
        return this.name+",   "+this.getGender()+"    a:"+this.age+",   h:"+this.height+",   w:"+this.weight+",   bmi:"+this.bmi()+",   "+this.category();   
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getGender(){
        if(this.gender){
            return "ffi";
        }else{
            return "no ";
        }
    }
    
    public int getAge(){
        return this.age;
    }
    
    public int getHeight(){
        return this.height;
    }
    
    public int getWeight(){
        return this.weight;
    }
    
    public double bmi(){
        return (10000*this.getWeight()) / (this.getHeight()*this.getHeight());
    }
    
    public String category(){
        if(this.bmi() < 16){
            return "dangerously underweight";
        }else if(this.bmi() < 17){
            return "underweight";
        }else if(this.bmi() < 18.50){
            return "mildly underwight";
        }else if(this.bmi() < 25){
            return "normal";
        }else if(this.bmi() < 30){
            return "overweight";
        }else if(this.bmi() < 35){
            return "I. overweight";
        }else if(this.bmi() < 40){
            return "II. overweight";
        }
        return "III. overweight";
    }
}
