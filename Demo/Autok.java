/*

 */
package vizsga;
import java.util.*;
class Auto{
    String rendszam;
    int uzemanyag;
    int fogyasztas;
    
    public String toStirng(){
        return this.rendszam + ", fogyasztas: " + this.fogyasztas + "l, uzemanyag: " + this.uzemanyag;
    }
}
/**
 *
 * @author dani
 */
public class Autok {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        
        ArrayList<Auto> lista = new ArrayList<Auto>();
        feltolt(lista);
        kiir(lista);
        System.out.println();
        System.out.print("adjon meg egy parametert: ");
        int n = console.nextInt();
        System.out.println("a megadott parameteru atlagfogyasztas: "+atlag(lista, n));
        System.out.println();
        kulonbseg(lista);
        System.out.println();
        System.out.print("adjon meg egy rendszamot: ");
        String rendszam = console.next();
        System.out.println(keres3(lista, 0, rendszam));
    }
    
    public static void feltolt(ArrayList<Auto> lista){
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            Auto a = new Auto();
            
            if(i+5<10){
                a.rendszam = "XYZ00"+ (i+5);
            }else{
                a.rendszam = "XYZ0" + (i+5);
            }
            
            int u = r.nextInt(2)+1;
            a.uzemanyag = u;
            
            if(u==1){
                a.fogyasztas = r.nextInt(5)+6;
            }else{
                a.fogyasztas = r.nextInt(4)+5;
            }
            lista.add(a);
        }
    }
    
    public static void kiir(ArrayList<Auto> lista){
        for (Auto a : lista) {
            System.out.println(a.toStirng());
        }
    }

    public static double atlag(ArrayList<Auto> lista, int n) {
        int osszeg = 0;
        int db = 0;
        for (Auto a : lista) {
            if(a.uzemanyag == n){
                osszeg += a.fogyasztas;
                db++;
            }
        }
        double atlag = osszeg / db;
        return  atlag;
    }
    
    public static void kulonbseg(ArrayList<Auto> lista){
        double benzinatlag = atlag(lista, 1);
        double dizelatlag = atlag(lista, 2);
        
        System.out.println("a ket fogyasztas kozotti kulonbseg: " + Math.abs(dizelatlag-benzinatlag));
    }
    
    public static void keres(ArrayList<Auto> lista){
        Scanner console = new Scanner(System.in);
        System.out.print("adjon meg egy rendszamot: ");
        String rendszam = console.next();
        
        Iterator<Auto> itr = lista.iterator();
        while(itr.hasNext()){
            Auto a = itr.next();
            if(a.rendszam.equals(rendszam)){
                System.out.println(a.toStirng());
            }else if(!itr.hasNext()){
                System.out.println("nincs ilyen auto");
            }
        }
    }
    
    public static void keres2(ArrayList<Auto> lista){
        Scanner console = new Scanner(System.in);
        System.out.print("Adjon meg egy rendszamot: ");
        String rendszam = console.next();
        
        for (int i = 0; i < lista.size(); i++) {
            Auto a = lista.get(i);
            if(a.rendszam.equals(rendszam)){
                System.out.println(a);
            }
            if(!a.rendszam.equals(rendszam) && i==lista.size()-1){
                System.out.println("nincs ilyen auto");
            }
        }
    }
    
    public static String keres3(ArrayList<Auto> lista, int n, String rendszam){
        Auto a = lista.get(n);
        if(a.rendszam.equals(rendszam)){
            return a.toStirng();
        }else if(n<lista.size()-1){
            return keres3(lista, n+1, rendszam);
        }else{
            return "nincs ilyen auto.";
        }
    }
}
