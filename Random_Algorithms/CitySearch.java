/*

 */
package test;
import java.util.*;
/**
 *
 * @author Daniel Kuknyo
 */
public class CitySearch {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        ArrayList<Szemely> lista = new ArrayList<Szemely>();
        System.out.print("adja meg a varost :");
        String varos = console.nextLine();
        CitySearch(lista, varos);
    }
    
    public static void CitySearch(ArrayList<Szemely> lista, String varos){
        int count = 0;
        for (Szemely sz : lista) {
            if(sz.varos.equals(varos)){
                count++;
            }
        }
        System.out.println("Az osszes szemely " + count/lista.size()*100 + "%-a lakik " + varos + "ban");
    }
}
