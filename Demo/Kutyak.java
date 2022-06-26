/*

 */
package vizsga;
import java.util.*;
/**
 *
 * @author dani
 */
class Kutya {
    String nev;
    int kor;
    String fajta;
    
    public String toString(){
        return "nev: " + this.nev + ", kor: " + this.kor + ", fajta: " + this.fajta;
    }
}


public class Kutyak{
    public static void main(String[] args){
        ArrayList<Kutya> kutyak = new ArrayList<Kutya>();
        feltolt(kutyak);
        kiir(kutyak);
        System.out.println();
        puliszam(kutyak);
        System.out.println();
        goldenszam(kutyak);
        System.out.println();
        atlag(kutyak);
    }
    
    public static void feltolt(ArrayList<Kutya> kutyak){
        Random r = new Random();
        //                      0       1        2
        String[] fajtak = {"tacsko", "golden", "puli"};//innen valasztom a fajtakat
        
        for (int i = 0; i < 10; i++) {//amennyi kutyat szeretnek
            Kutya k = new Kutya();//letrehoz egy uj kutyat k valtozonevvel
            k.nev = "kutya_"+i;//nevet ad
            k.kor = r.nextInt(10)+5;//kort ad veletlen szam 5-10
            
            int fajtaszam = r.nextInt(3);//veletlen szam 0-2
            k.fajta = fajtak[fajtaszam];//a fajtak tombbol valassza ki azon indexu elemet amelyikre a fajtaszam valtozo utal
            
            kutyak.add(k);//a kutyak nevu tombhoz hozzaadni a k kutyat
        }
    }

    private static void kiir(ArrayList<Kutya> kutyak) {
        for (Kutya k : kutyak) {//bejarni a tombot
            System.out.println(k);//kiirni a kutyat
        }
    }

    private static void puliszam(ArrayList<Kutya> kutyak) {
        int puliszam = 0;//szamlalo=0
        for (Kutya k : kutyak) {//bejarni a tombot
            if(k.fajta.equals("puli")){//HOGYHA a fajta puli
                puliszam++;//novelje a szamlalot
            }
        }
        System.out.println("pulik szama: "+puliszam);//kiirni a pulik szamat
    }

    private static void goldenszam(ArrayList<Kutya> kutyak) {
        int goldenszam = 0;//szamlalo = 0;
        for (Kutya k : kutyak) {//bejarni a tombot
            if(k.kor>5 && k.fajta.equals("golden")){//HOGYHA a kor tobb mint 5 ES a fajta golden
                goldenszam++;//szamlalot novelni
            }
        }
        System.out.println("5 evnel idosebb goldenek szama: "+goldenszam);//kiirni 
    }

    private static void atlag(ArrayList<Kutya> kutyak) {
        int darab = 0;//darabszam lenullazasa
        int osszeg = 0;//osszeg lenullazasa
        for (Kutya k : kutyak) {//bejarni a tombot
            osszeg += k.kor;//osszeghez hozzaadni a kutya korat
            darab++;//darabszamot eggyel novelni
        }
        double atlag = osszeg / darab;//atlagot elmenteni egy valtozoba, DOUBLE, mert lehet tizedes tort is
        System.out.println("atlegeletkoruk: "+atlag);//kiiratni az atlagot
    }    
}
