/*
Készítsen Erettségi osztályt a következő adattagokkal: 
Név, matematika, fizika, magyar, történelem, év. 
 */
package vizsga;

/**
 *
 * @author dani
 */
public class Graduation {
    private String name;
    private int maths;
    private int physics;
    private int hun;
    private int history;
    private int year;
    
    public Graduation(String name, int maths, int physics, int hun, int history, int year){
        this.name = name;
        this.maths = maths;
        this.physics = physics;
        this.hun = hun;
        this.history = history;
        this.year = year;
    }
    
    public String getName(){
        return this.name;
    }
    public int getMaths(){
        return this.maths;
    }
    public int getPhysics(){
        return this.physics;
    }
    public int getHun(){
        return this.hun;
    }
    public int getHistory(){
        return this.history;
    }
    public int getYear(){
        return this.year;
    }
    
    public String toString(){
        return this.getName()+", M:"+this.getMaths()+", P:"+this.getPhysics()+", Hu:"+this.getHun()+", H:"+this.getHistory()+", Y:"+this.getYear();
    }
    
    public double getAverage(){
        int sum = this.getMaths()+this.getPhysics()+this.getHun()+this.getHistory();
        return sum/4;
    }
    
    public String getNote(){
        if(this.getAverage()<2.0){
            return "sikertlen";
        }else if(this.getAverage()<2.5){
            return "megfelelt";
        }else if(this.getAverage()<3.5){
            return "kozepes";
        }else if(this.getAverage()<4.5){
            return "jo";
        }else{
            return "jeles";
        }
    }
}
