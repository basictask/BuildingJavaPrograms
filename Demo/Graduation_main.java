/*
Készítsen metódust, ami feltölt egy tömblistát érettségizőkkel, a megadott számban. 
A feltöltés során az értékeket a következőképpen automatikusan adja. 
Név: Név_1… Név_N-ig, ahány személyt adtunk meg. 
matematika, fizika, magyar, történelem 1-5 –ig véletlen egészszám.
év 1995 – 2000-ig véletlen egészszám.

Készítsen metódust, ami táblázatos formában listázza a vizsgázókat.

Készítsen metódust, ami meghatározza, hogy az érettségi sikeres volt-e. 
Sikeres az érettségi akkor, ha a tanuló minden jegye legalább kettes.

Készítsen metódust, ami kiírja a legjobb eredménnyel érettségizőket. 
Az azonos eredmény is számít. A sikertelen eredményeket vegye figyelembe! 
Használja az előző pontban elkészített függvényt.
//hogy lehet a legjobb eredmenyek kozott figyelembe venni a sikertelen eredmenyeket?

Az érettségizők jegyeit tömbként tárolja, írja ki a tanulók átlagait. 
Adja meg az osztályozást az alábbi táblázatnak megfelelően metódussal.

< 2.0      sikertelen
2.1 – 2.5  megfelelt
2.6 – 3.5  közepes
3.5 – 4.5  jó
> 4.6      jeles

Határozza meg, hogy melyik évben volt a legjobb az érettségizők eredménye.

 */
package vizsga;

/**
 *
 * @author dani
 */
import java.util.*;
public class Graduation_main {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("enter number of records: ");
        int n = console.nextInt();
        ArrayList<Graduation> grads = getList(n);
        
        System.out.println();
        printList(grads);
        
        System.out.println();
        printPassed(grads);
        
        System.out.println();
        printAvg(grads);
        
        System.out.println();
        bestYear(grads);
    }
    
    public static ArrayList<Graduation> getList(int n){
        Random r = new Random();
        ArrayList<Graduation> result = new ArrayList<Graduation>();
        
        
        for(int i=1; i<=n; i++){
            String name = "";
            if(i<10){
                name = "  Graduation_"+i;
            }else if(i<100){
                name = " Graduation_"+i;
            }else{
                name = "Graduation_"+i;
            }
            int maths=r.nextInt(5)+1;
            int physics=r.nextInt(5)+1;
            int hun=r.nextInt(5)+1;
            int history=r.nextInt(5)+1;
            int year=r.nextInt(6)+1995;
            Graduation g = new Graduation(name, maths, physics, hun, history, year);
            result.add(g);
        }
        return result;
    }
    
    public static void printList(ArrayList<Graduation> list){
        System.out.println("every record: ");
        for(Graduation g : list){
            System.out.println(g.toString());
        }
    }
    
    public static boolean passed(Graduation g){
        return g.getMaths()>1 && g.getPhysics()>1 && g.getHun()>1 && g.getHistory()>1;
    }
    
    public static void printPassed(ArrayList<Graduation> list){
        System.out.println("passed: ");
        for(Graduation g : list){
            if(passed(g)){
                System.out.println(g.toString());
            }
        }
    }
    
    public static void printAvg(ArrayList<Graduation> list){
        System.out.println("averages and notes: ");
        for(Graduation g : list){
            System.out.println(g.toString()+", Avg:"+g.getAverage()+", "+g.getNote());
        }
    }
    
    public static void bestYear(ArrayList<Graduation> list){
        TreeMap<Integer, Integer> yrcount = new TreeMap<Integer, Integer>();
        for(Graduation g : list){
            int year = g.getYear();
            if(yrcount.containsKey(year)){
                int occ = yrcount.get(year);
                yrcount.put(year, occ+1);
            }else{
                yrcount.put(year, 1);
            }
        }
        
        TreeMap<Integer, Double> yrsum = new TreeMap<Integer, Double>();
        for(Graduation g : list){
            int year = g.getYear();
            double avg = g.getAverage();
            if(yrsum.containsKey(year)){
                int sum = yrcount.get(year);
                yrsum.put(year, sum+avg);
            }else{
                yrsum.put(year, avg);
            }
        }
        
        TreeMap<Integer, Double> result = new TreeMap<Integer, Double>();
        for(int n : yrcount.keySet()){
            int a = yrcount.get(n);
            double b = yrsum.get(n);
            double c = b/a;
            result.put(n, c);
        }
        
        int maxyear = 0;
        double maxavg = 0;
        for(int n : result.keySet()){
            double avg = result.get(n);
            if(avg>maxavg){
                maxavg = avg;
                maxyear = n;
            }
        }
        
        
        System.out.println("averages by year: ");
        System.out.println("  "+result);
        System.out.println();
        System.out.printf("highest average: %.2f in the year %d\n",maxavg, maxyear);
    }
}
