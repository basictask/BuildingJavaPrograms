/*
Készítsen KezeltSzemely osztályt a következő adattagokkal: 
Név, életkor, testmagasság, súly. 

Készítsen metódust, ami feltölt egy tömblistát személyekkel, a megadott számban. 
A feltöltés során az értékeket a következőképpen automatikusan adja. 

Név: Szemely_1… Szemely_N-ig, ahány személyt adtunk meg.
Testmagasság centiméterben: 150 – 200-cm-ig véletlen egészszám.
Súly: 40 – 150 kg-ig véletlen egészszám.

[sajat komment] eletkort nem mondott sehol, ugyhogy a tovabbi feldatok miatt
                40- es 50 kozotti veletlen egesszam.

Készítsen metódust, ami táblázatos formában listázza a személyeket.

Készítsen függvényt ami kiszámolja a kezelt személyek testtömegindexét. 
TTI = testtömeg[kg] / testmagasság2[m2].

Készítsen logikai függvényt, ami megadja, hogy a kezelt személy a normális testsúlyosztályozásba tartozó-e.  
18,5 – 24,99- ig normális az érték. Használja fel az előző pontban elkészített függvényt.

Adja meg a testsúlyosztályozást az alábbi táblázatnak megfelelően függvénnyel.

< 16          súlyos soványság
16 – 16,99    mérsékelt soványság
17 – 18,49    enyhe soványság
18,5 – 24,99  normális testsúly
25 – 29,99    túlsúlyos
30 – 34,99    I. fokú elhízás
35 – 39,99    II. fokú elhízás
≥ 40          III. fokú (súlyos) elhízás

Készítsen percentilis függvényt, ami meghatározza, hogy az azonos nemű és életkorú kezelt személynek hány százalékának 
kisebb a testtömegindexe, mint a vizsgált egyénnek. Majd írja ki az eredményt az alábbi táblázatnak megfelelően:
 
[sajat komment] a kezeltek nemet nem tudom honnan kellett volna kitalalni, de oke, legyen.
                ezert veletlen boolean aszerint, hogy ferfi-e. 0-no, 1-ffi
                
Testsúlyosztályozás
50     átlagos
> 90   kóros elhízás
< 3    jelentős súlyhiány

[sajat komment] mivel nem adtak meg semmilyen informaciot arra az esetre, ha az ertek 3-90 koze esik es nem 50, 
                az atlagos tartoman 3 es 90 kozott ertendo
 */
package vizsga;

/**
 *
 * @author dani
 */
import java.util.*;
public class Patient_main {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("enter number of people: ");
        int n = console.nextInt();
        
        ArrayList<Patient> list= getList(n);
        
        System.out.println();
        listAll(list);
        
        System.out.println();
        System.out.print("enter patient: ");
        String s = console.next();
        System.out.println(pct(list, s)+"%");
    }
    
    public static ArrayList<Patient> getList(int n){
        ArrayList<Patient> result = new ArrayList<Patient>();
        Random r = new Random();
        
        for(int i=1; i<=n; i++){
            String s = "Patient_"+i;
            int age = r.nextInt(10)+40;
            int height = r.nextInt(51)+150;
            int weight = r.nextInt(111)+40;
            boolean b = r.nextBoolean();
            Patient p = new Patient(s, b, age, height, weight);
            result.add(p);
        }
        return result;
    }
    
    public static void listAll(ArrayList<Patient> list){
        for(Patient p : list){
            System.out.println(p.toString());
        }
    }
        
    public static boolean isNormal(Patient p){
        return 18.5<p.bmi() && 24.99>p.bmi();
    }
    
    public static double pct(ArrayList<Patient> list, String s){
        int age = 0;
        String gender = "";
        double bmi = 0;
        
        for(Patient pt : list){
            if(pt.getName().equals(s)){
                age = pt.getAge();
                gender = pt.getGender();
                bmi =pt.bmi();
            }
        }
        
        int count = 0;
        for(Patient pt : list){
            if(pt.getGender().equals(gender) && pt.getAge()==age && pt.bmi() < bmi){
                count++;
            }
        }
        double pct = count*100 / list.size();
        
        if(pct>90){
            System.out.println("overweight");
        }if(pct<3){
            System.out.println("underweight");
        }else{
            System.out.println("normal");
        }
        
        return pct;
    }
}
