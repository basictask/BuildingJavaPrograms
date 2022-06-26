/*

 */
package test_2;

/**
 *
 * @author dani
 */
public class Eladas{
    private String name;
    private String code;
    private int e2013;
    private int e2014;
    private int e2015;
    
    public Eladas(String name, String code, int e2013, int e2014, int e2015){
        this.setName(name);
        this.setCode(code);
        this.sete2013(e2013);
        this.sete2014(e2014);
        this.sete2015(e2015);
    } 
    
    public String getName(){
        return this.name;
    }
    public String getCode(){
        return this.code;
    }
    public int gete2013(){
        return this.e2013;
    }
    public int gete2014(){
        return this.e2014;
    }
    public int gete2015(){
        return this.e2015;
    }
    
    public void setName(String name){
        this.name = name;
    }
    public void setCode(String code){
        this.code = code;
    }
    public void sete2013(int n){
        this.e2013 = n;
    }
    public void sete2014(int n){
        this.e2014 = n;
    }
    public void sete2015(int n){
        this.e2015 = n;
    }
    
    public String toString(){
        return this.name + ", " + this.code + ", " + this.e2013 + ", " + this.e2014 + ", " + this.e2015;
    }
}
