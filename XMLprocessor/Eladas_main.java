/*

 */
package test_2;
import java.util.*;
import java.io.*;
/**
 *
 * @author dani
 */
public class Eladas_main {
    public static void main(String[] args){
        ArrayList<Eladas> e1 = readFile("uzlet1.csv");
        ArrayList<Eladas> e2 = readFile("uzlet2.csv");
        
        System.out.println("----------A csoport----------");
        System.out.println();
        System.out.println("Az osszes termek:");
        cikkszam(e1, e2);
        System.out.println();
        
        System.out.println("Amiknek nulla volt az eladasa valamelyik evben:");        
        nulla(e1);
        nulla(e2);
        System.out.println();
        
        System.out.println("Ami uzlet1-ben van, de uzlet2-ben nincs: ");
        kulonbseg(e1, e2);
        System.out.println();
        
        System.out.println("Uzletek eves eladasa es atlaga: ");
        atlag(e1);
        System.out.println();
        atlag(e2);
        System.out.println();
        System.out.println("----------B csoport----------");
        System.out.println();
        System.out.println("Legalabb az egyik uzletben forgalmaztak:");
        legalabb(e1, e2);
        
        System.out.println();
        e2014(e1, e2);
        
        System.out.println();
        legnagyobb(e1, e2);
        
        System.out.println();  
    }
    
    public static void cikkszam(ArrayList<Eladas> e1, ArrayList<Eladas> e2){
        TreeSet<String> set = new TreeSet<String>();
        for (Eladas e : e1) {
            set.add(e.getName());
        }
        for (Eladas e : e2) {
            set.add(e.getName());
        }
        Iterator<String> itr = set.iterator();
        while(itr.hasNext()){
            String s = itr.next();
            System.out.println(s);
        }
    }
    
    public static void nulla(ArrayList<Eladas> e1){
        HashSet<Eladas> set = new HashSet<Eladas>();
        for (Eladas e : e1) {
            if(e.gete2013()==0 || e.gete2014()==0 || e.gete2015()==0){
                set.add(e);
            }
        }
        Iterator<Eladas> itr = set.iterator();
        while(itr.hasNext()){
            Eladas e = itr.next();
            System.out.println(e.toString());
        }
        System.out.println();
    }
    
    public static void kulonbseg(ArrayList<Eladas> e1, ArrayList<Eladas> e2){
        TreeSet<String> uzlet1 = new TreeSet<String>();
        TreeSet<String> uzlet2 = new TreeSet<String>();
        
        for (Eladas e : e1) {
            String s = e.getName();
            uzlet1.add(s);
        }
        for (Eladas e : e2) {
            String s = e.getName();
            uzlet2.add(s);
        }
        uzlet1.removeAll(uzlet2);
        Iterator<String> itr = uzlet2.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
    
    public static void atlag(ArrayList<Eladas> e1){
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int i=2013; i<2016; i++){
            map.put(i, 0);
            
            for (Eladas e : e1) {
                int current = map.get(i);
                if(i==2013){
                    map.put(i, current + e.gete2013());
                }else if(i==2014){
                    map.put(i, current + e.gete2014());
                }else{
                    map.put(i, current + e.gete2015());
                }
            }
            System.out.println("eladasok osszege " + i + ": " + map.get(i) + ", atlaga: " + (double)map.get(i)/e1.size());
        }
    }
    
    public static void legalabb(ArrayList<Eladas> e1, ArrayList<Eladas> e2){
        TreeSet<String> result = new TreeSet<String>();
        for (Eladas e : e1) {
            result.add(e.getName());
        }
        for (Eladas e : e2) {
            result.add(e.getName());
        }
        
        Iterator<String> itr = result.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
    
    public static void e2014(ArrayList<Eladas> e1, ArrayList<Eladas> e2){
        int sum = 0;
        for (Eladas e : e1) {
            sum+=e.gete2014();
        }
        for (Eladas e : e2) {
            sum+=e.gete2014();
        }
        System.out.printf("Az osszes eladas 2014-ben: %d, Atlaga: %.2f\n",sum, (double)sum/(e1.size()+e2.size()));
    }
    
    public static void legnagyobb(ArrayList<Eladas> e1, ArrayList<Eladas> e2){
        HashMap<Integer, Integer> uzlet1 = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> uzlet2 = new HashMap<Integer, Integer>();
        
        for(int i=2013; i<2016; i++){
            uzlet1.put(i, 0);
            uzlet2.put(i, 0);
            for (Eladas e : e1) {
                int current1 = uzlet1.get(i);
                if(i==2013){
                    uzlet1.put(i, current1 + e.gete2013());
                }else if(i==2014){
                    uzlet1.put(i, current1 + e.gete2014());
                }else{
                    uzlet1.put(i, current1 + e.gete2015());
                }
            }
            for (Eladas el : e2) {
                int current2 = uzlet2.get(i);
                if(i==2013){
                    uzlet2.put(i, current2 + el.gete2013());
                }else if(i==2014){
                    uzlet2.put(i, current2 + el.gete2014());
                }else{
                    uzlet2.put(i, current2 + el.gete2015());
                }
            }
        }
        
        int uzlet1max = 0;
        int uzlet1maxev = 0;
        int uzlet2max = 0;
        int uzlet2maxev = 0;
           
        for (Integer ev : uzlet1.keySet()) {
            if(uzlet1.get(ev)>uzlet1max){
                uzlet1max = uzlet1.get(ev);
                uzlet1maxev = ev;
            }
        }
        for (Integer ev : uzlet2.keySet()) {
            if(uzlet2.get(ev)>uzlet2max){
                uzlet2max = uzlet2.get(ev);
                uzlet2maxev = ev;
            }
        }
        
        if(uzlet1max > uzlet2max){
            System.out.println("A legtobb eladas uzlet1-ben volt, " + uzlet1maxev + "-ben, erteke: " + uzlet1max);
        }else if(uzlet1max < uzlet2max){
            System.out.println("A legtobb eladas uzlet2-ben volt, " + uzlet2maxev + "-ben, erteke: " + uzlet2max);
        }else{
            System.out.println("A ket uzlet eladasa ugyanannyi volt.");
        }
    }
    
    public static ArrayList<Eladas> readFile(String s){
        ArrayList<Eladas> result = new ArrayList<Eladas>();
        try{
            Scanner input = new Scanner(new File(s));
            while(input.hasNextLine()){
                String line = input.nextLine();
                String[] data = line.split(";");
                Eladas e = new Eladas(data[0], data[1], Integer.parseInt(data[2]), Integer.parseInt(data[3]), Integer.parseInt(data[4]));
                result.add(e);
            }    
        }catch (FileNotFoundException e){
            System.out.println("File Not Found");    
        }
        return result;
    }
}
