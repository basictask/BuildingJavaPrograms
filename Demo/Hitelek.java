/*

 */
package vizsga;

/**
 *
 * @author dani
 */
import java.util.*;

class Hitel{
    String ados;
    int osszeg;
    boolean fedezet;
    
    public String toStirng(){
        return this.ados + ", " + this.osszeg + ", fedezet: " + this.fedezet;
    }
}

public class Hitelek {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);           //Scanner...
        tomb();                                             //masodik feladat..  
        System.out.println();               
        
        ArrayList<Hitel> lista = new ArrayList<Hitel>();    //ures lista letrehozasa
        feltolt(lista);                                     //atadjuk a metodusnak ami feltolti
        kiir(lista);                                        //kiiratas
        osszeg(lista);                                      //osszeg szamolas
        System.out.println();                                   
        
        System.out.println("[true/false] fedezetet: ");     //kis  egyszeru kiiratas
        boolean b = console.nextBoolean();                  //a beadott boolean eltarolasa valtozoban
        fedezet(lista, b);                                  //a letrehozott valtozot atadjuk a metodusnak parameterkent a listaval egyutt
        
        System.out.println();
        if(vane(lista)){                                    //ha az elozo metodus true-val ter vissza
            hanyvan(lista);                                 //hivodjon meg az utolso metodus
        }else{
            System.out.println("nincs ilyen");              //egyebkent meg irja ki hogy nincs ilyen
        }
    }
    
    public static void tomb(){
        Random r = new Random();
        int[] tomb = new int[10];                           //uj tomb 10 elemmel
        for (int i = 0; i<tomb.length; i++) {               //minden i-re a tombon belul
            tomb[i] = r.nextInt(26)-5;                      //i-nek erteket adni
        }
        System.out.print("eredeti: ");
        System.out.println(Arrays.toString(tomb));          //kiiratas
        for(int i=1; i<tomb.length; i+=2){                  //ciklus a paratlan indexu elemekre
            tomb[i] = tomb[i]*3;                            //a tomb i-edik elemet megszorozzuk 3-mal
        }
        System.out.print("modositott");
        System.out.println(Arrays.toString(tomb));          //kiiratas
    }
    
    private static void feltolt(ArrayList<Hitel> lista){    
        Random r = new Random();                            //Random 
        for (int i = 0; i < 12; i++) {                      //for ciklus 12-ig
            Hitel h = new Hitel();                          //uj Hitel tipusu objektum letrehozasa
            h.ados = "ados_"+(i+1);                         //ados adatmezo ertekenek modositasa
            h.osszeg = (r.nextInt(10)+1) * 1000000;         //uj ertek -5-20
            h.fedezet = r.nextBoolean();                    //veletlen boolean
            lista.add(h);                                   //a kesz objektum listahoz adasa
        }
    }
    
    private static void kiir(ArrayList<Hitel> lista){
        for (Hitel h : lista) {                             //cilus az adatsorra
            System.out.println(h.toStirng());               //objektum kiiratasa
        }
    }
    
    private static void osszeg(ArrayList<Hitel> lista){
        int sum = 0;                                        //szummavaltozo nulla
        for (Hitel h : lista) {                             //ciklus az adatsorra
            sum+=h.osszeg;                                  //a vizsgalt Hitel osszeg ertekevel novelni szummat
        }
        System.out.println();
        System.out.println("a hitelek osszeege" + sum);     //kiiratas
    }
    
    private static void fedezet(ArrayList<Hitel> lista, boolean b){ // boolean parameter!!!!!! 
        int sum = 0;                                        //szumma nulla 
        int count = 0;                                      //szamlalo nulla
        for (Hitel h : lista) {                             //minden Hitel objektumra a listaban
            if(h.fedezet==b){                               //hogyha a fedezet megegyezik a parameterul kapottal
                sum+=h.osszeg;                              //akkor az osszeget hozzaadja a  szummahoz
                count++;                                    //es a szamlalot noveli
            }
        }
        double atlag = sum/count;                           //atlagot kiszamoljuk
        System.out.println();
        System.out.println("a parameterul kapott tipusu hitelek atlaga: "+atlag);
    }
    
    private static boolean vane(ArrayList<Hitel> lista){
        for (Hitel h : lista) {                             //ciklus az adatsorra
            if(5000000<h.osszeg){                           //ha nagyobb mint 5M
                return true;                                //visszater igazzal, a metodus kile[p a futasbol
            }
        }
        return false;                                       //kilep hamissal  
    }
    
    private static void hanyvan(ArrayList<Hitel> lista){
        int count = 0;                                      //szamlalo nulla
        for (Hitel h : lista) {                             //minden Hitel objektumra a listaban
            if(!h.fedezet){                                 //hogyha nincs fedezet   ("!" operator) 
                count++;                                    //novelje a szamlalot
            }
        }
        System.out.println("nincs fedezete "+count+" ingatlannak");
    }
}
