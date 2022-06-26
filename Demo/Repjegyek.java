/*

 */
package vizsga;
import java.util.*;
/**
 *
 * @author dani
 */
class Repulojegy{
    String nev;
    String cel;
    boolean szolg;
    
    public String toString(){
        return this.nev+"\t"+this.cel+"\tszolg: "+this.szolg;
    }
}

public class Repjegyek {
    public static void main(String[] args){
        ArrayList<Repulojegy> lista = getList(12);
        kiir(lista);
        System.out.println();
        nemVasarolt(lista);
        System.out.println();
        szolg(lista);
    }
    
    public static ArrayList<Repulojegy> getList(int n){
        ArrayList<Repulojegy> result = new ArrayList<Repulojegy>();
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            Repulojegy jegy = new Repulojegy();         //uj repulojegy
            jegy.nev = "nev_"+i;                        //nev i-ig
            jegy.cel = "cel_"+(r.nextInt(10)+1);        //cel+egy veletlen szam 1-10 kozott: generalunk egyet 0-9-ig +1!
            jegy.szolg = r.nextBoolean();               //egy veletlen boolean erteket hozzarendelunk egy valtozohoz
            result.add(jegy);                           //hozzaadjuk a listahoz a Repulojegyet   (jegy)  
        }
        return result;                                  //en igertem neki egy lista tipusu visszateresi erteket, ezert van return
    }
    
    public static void kiir(ArrayList<Repulojegy> lista){
        for (Repulojegy jegy : lista) {
            System.out.println(jegy.toString());
        }
    }
    
    public static void nemVasarolt(ArrayList<Repulojegy> lista){
        System.out.println("nem vasarolt celok: ");
        for (int i = 1; i < 11; i++) {                          //for ciklus 1-11-ig, mivel a celok 1-10 lehetnek es minden celt vizsgalbnunk kell
            String cel = "cel_"+i;                              //letrehozok egy celt a sema alapjan cel_1 stb...
            boolean talalt = false;                             //a talalatat hamisra allitom
            for (Repulojegy jegy : lista) {                     //most a repulojegyeket nezem vegig
                if(jegy.cel.equals(cel)){                       //ha valamely repulojegyben a cel megegyezik a letrehozottal
                    talalt = true;                              //a talalatat igazra allitom
                }
            }
            if(!talalt){                                        //ha nem talalt
                System.out.println(cel);                        //irassa ki az uticelt
            }
        }
    }
    
    public static void szolg(ArrayList<Repulojegy> lista){
        int count = 0;
        for (Repulojegy jegy : lista) {
            if(jegy.szolg){
                count++;
            }
        }
        System.out.println("szolgaltatasok szama: "+count);
    }
}
