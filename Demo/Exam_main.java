/*
Készítsen Nyelvvizsga osztályt a következő adattagokkal: 
Név, írásbeliPont, szóbeliPont, vizsgahely. 

Készítsen metódust, ami feltölt egy tömblistát vizsgázókkal, a megadott számban. 
A feltöltés során az értékeket a következőképpen automatikusan adja. 
Név: Vizsgázó_1… Vizsgázó_N-ig, ahány személyt adtunk meg. 
írásbeliPont, szóbeliPont 0-120 pontig –ig véletlen egéssszám.
Vizsgahely (Budapest, Debrecen, Szeged) véletlenszerű érték alapján.

Készítsen metódust, ami táblázatos formában listázza a vizsgázókat.

Készítsen logikai függvényt, ami megadja, hogy az átadott versenyző sikeres vizsgát tett-e. 
Sikeres a vizsga akkor, ha a szóbeli és az írásbeli vizsgán is legalább a 60%-ot elérte a vizsgázó.

Készítsen metódust, ami kiírja a vizsgaeredményeket a következőképpen:
Név: írásbeli %os eredmény, szóbeli %-os eredmény: [sikeres / sikertelen]
pl. Gipsz Jakab: írásbeli 30%, szóbeli 70%, sikertelen
Használja fel az előző pontban elkészített függvényt

Adja meg az osztályozást az alábbi táblázatnak megfelelően metódussal.
 
Százalékos eredmény
Értékelés
61 – 70 % megfelelt
71 – 80 % közepesen megfelelt
81- 90 % jól megfelelt
91%-tól kiválóan megfelelt
	
Készítsen percentilis függvényt, ami meghatározza, 
hogy a megadott városban vizsgázók hány százalékának rosszabb az eredménye, mint a megadott vizsgázónak.

 */
package vizsga;

/**
 *
 * @author dani
 */
import java.util.*;
public class Exam_main {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("number of exam records: ");
        int n = console.nextInt();
        ArrayList<Exam> exams = fillList(n);
        
        System.out.println();
        listAll(exams);
        
        System.out.println();
        listpct(exams);
        
        System.out.println();
        getGrade(exams);
        
        System.out.println();
        System.out.print("enter examinee: ");
        String name = console.next();
        pct(exams, name);
    }
    
    public static ArrayList<Exam> fillList(int n){
        ArrayList<Exam> result = new ArrayList<Exam>();
        String[] cities = {"Budapest", "Debrecen", "Szeged"};
        Random r = new Random();
        
        for(int i=1; i<=n; i++){
            String name = "Exam_"+i;
            int wp = r.nextInt(121);
            int op = r.nextInt(121);
            int c = r.nextInt(3);
            String city = cities[c];
            Exam ex = new Exam(name, wp, op, city);
            result.add(ex);
        }
        return result;
    }
    
    public static void listAll(ArrayList<Exam> exams){
        for(Exam ex : exams){
            System.out.println(ex.toString());
        }
    }
    
    public static boolean success(Exam ex){
        return ex.getWPoint()>60 && ex.getOPoint()>60;
    }
    
    public static void listpct(ArrayList<Exam> exams){
        for(Exam ex : exams){
            boolean b = success(ex);
            if(b){
                System.out.println(ex.pctToString()+"passed");
            }else{
                System.out.println(ex.pctToString()+"failed");
            }
        }
    }
    
    public static void getGrade(ArrayList<Exam> exams){
        for(Exam ex : exams){
            System.out.println(ex.getName() + " - " + ex.getGrade());
        }
    }
    
    public static void pct(ArrayList<Exam> exams, String name){
        int score = 0;
        String place = "";
        for(Exam ex : exams){
            if(name.equals(ex.getName())){
                score = ex.getScore();
                place = ex.getPlace();
            }
        }
        
        int count = 0;
        
        for(Exam ex : exams){
            if(ex.getScore() < score && ex.getPlace().equals(place)){
                count++;
            }
        }
        
        double pct = count*100 / exams.size();
        
        System.out.printf("in %s %.2fpct of people wrote a worse exam.\n", place, pct);
    }
}
