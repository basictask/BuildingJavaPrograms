/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;//
import java.util.*;// util csomag import    

/**
 *
 * @author SzucsA2
 */
class Szemely {//Szemely osztaly letrehozasa
    String nev;//String tipusu adattag letrehozasa
    int ev;//ev adattag letrehozasa
    String varos;//varos adattag letrehozasa

    @Override
    public String toString() {//toString metodus, kiiratashoz
        return "Szemely{" + "nev=" + nev + ", ev=" + ev + ", varos=" + varos + '}';//visszateresi erteke
    }
    
    
}
public class Ora0602 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//main metodus fejlec
      ArrayList<Szemely> lista=new ArrayList<Szemely>();//ures dinamikus tomb letrehozasa Szemely objektumokkal
      feltolt (lista);//feltolt metodus meghivasa, lista parameterrel
      kiir (lista);//kiir metodus meghivasa, lista parameterrel
    }

    private static void feltolt(ArrayList<Szemely> lista) {//feltolt metodus fejlece, lista parameterrel
        System.out.println("Adj meg egy szamot, hany szemelyt csinaljak!");//konzolra iratas
        Scanner s=new Scanner(System.in);//Scanner objektum letrehozasa
        int r=s.nextInt();// r nevu valtozoba menteni egy bekert erteket
        Random rnd=new Random();//Random objektum inicializalasa
        String[] varos={"Budapest","Debrecen","Szeged"};//String tipusu tomb, 3 String elemmel, index 0,1,2 
        
        for (int i = 0; i < r; i++) {//for cikllus, 0-tol r-ig
            Szemely sz=new Szemely();// uj Szemely objektum letrehozasa
            sz.nev="Szemely_"+(i+1);//a letrehozott objektum nev adattagjanak modositasa
            sz.ev=rnd.nextInt(22)+1995;// ev adattagnak uj int erteket adni 1995-2016 
            sz.varos=varos[rnd.nextInt(3)];//varos adattagnak uj erteket adni, amit a varos nevu tombbol sorsolunk veletlen index alapjan
            lista.add(sz);//a letrehozott listahoz hozzaadni a most letrehozott objektumot
            
        }
    }

    private static void kiir(ArrayList<Szemely> lista) {//kiir metodus metodusfejlece
        for (Szemely sz : lista) {//ciklus az adatsor elejetol vegeig
            System.out.println(sz.toString());//eppen vizsgalt objektum kiiratasa a kepeernyore
        }
    }
    
}
