/*

 */
package test;
import java.util.*;
class Orszag{
    String nev;
    int lakossag;

    @Override
    public String toString() {
        return "nev=" + nev + ", lakossag=" + lakossag;
    }
    
    
}
/**
 *
 * @author dani
 */

public class osz {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        ArrayList<Orszag> orszagok = getList(4);
        System.out.println();
        kiir(orszagok);
        System.out.println();
        System.out.print("orszagnev? ");
        String nev = console.next();
        System.out.println("lakosok szama: "+hanylakos(nev, orszagok));
    }
    
    public static ArrayList<Orszag> getList(int n){
        ArrayList<Orszag> result = new ArrayList<>();
        Scanner console = new Scanner(System.in);
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            Orszag o = new Orszag();
            System.out.print("adja meg az orszag nevet: ");
            o.nev = console.next();
            o.lakossag = r.nextInt(101)+1;
            result.add(o);
        }
        return result;
    }
    
    public static void kiir(ArrayList<Orszag> lista){
        for (Orszag o : lista) {
            System.out.println(o.toString());
        }
    }
    
    public static int hanylakos(String nev, ArrayList<Orszag> lista){
        for (Orszag o : lista) {
            if(o.nev.equals(nev)){
                return o.lakossag;
            }
        }
        return -1;
    }
}
