/*
Készítsen Nyelvvizsga osztályt a következő adattagokkal: 
Név, írásbeliPont, szóbeliPont, vizsgahely. 
 */
package vizsga;

/**
 *
 * @author dani
 */
public class Exam {
    private String name;
    private int WPoint;
    private int OPoint;
    private String place;
    
    public Exam(String name, int wp, int op, String place){
        this.name = name;
        this.WPoint = wp;
        this.OPoint = op;
        this.place = place;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getWPoint(){
        return this.WPoint;
    }
    
    public int getOPoint(){
        return this.OPoint;
    }
    
    public int getScore(){
        return this.WPoint+this.OPoint;
    }
    
    public String getPlace(){
        return this.place;
    }
    
    public String toString(){
        return this.name + ",  " + this.WPoint + " + " + this.OPoint + ",  " + this.place; 
    }
    
    public double getWpct(){
        return this.WPoint*100/120;
    }
    
    public double getOpct(){
        return this.OPoint*100/120;
    }
    
    public String pctToString(){
        return this.name + ",  " + this.getWpct() + "%,  " + this.getOpct() + "%: ";
    }
    
    public boolean passed(){
        return this.WPoint>60 && this.WPoint>60;
    }
    
    public String getGrade(){
        int score = this.WPoint + this.OPoint;
        
        if(!this.passed()){
            return "buko";
        }else if(score > 218){
            return "kivalo";
        }else if(score > 194){
            return "jo";
        }else if(score > 170){
            return "kozepes";
        }else if(score > 146){
            return "megfelelt";
        }else{
            return "buko";
        }
    }
}
