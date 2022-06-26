/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import java.util.*;

class Ingatlan{//osztaly definialasa
    String azonosito;//azonosito adattag hozzaadasa
    int alapterulet;//alapterulet adattag hozzaadasa
    int tip;//tipus adatta

    @Override
    public String toString() {//toString metodus, kiiratashoz
        return "Ingatlan{" + "azonosito=" + azonosito + ", alapterulet=" + alapterulet + ", tipus=" + tip + '}';//visszateresi erteke
    }
    
    
}

/**
 *
 * @author SzucsA2
 */
public class Ora0603 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//main
        ArrayList<Ingatlan> lista = new ArrayList<Ingatlan>();//ures lista letrehozasa
        feltolt (lista);//feltoltes meghivasa
        listazas (lista);//kiiratasa
        System.out.println("");//ures sor
        szamlistazas (lista);
        atlag (lista);
        System.out.println("Adjon meg egy parametert:");
        Scanner s=new Scanner(System.in);//Scanner objektum letrehozasa
        int a=s.nextInt();//felhasznalasa
        System.out.println("Tehat a parameterul adottnak a max alapterulete: "+parameter(lista,a));//visszateresi ertekes metodus kiiratasa
        utso (lista);//utolso metodus
        tejszinhab (lista);//tejszinhab :)
        
        /////////////////////tejszinhab2, mas modszerrel
        System.out.print("adj meg egy azonositot");
        String target = s.next();
        tejszinhab2(lista, 0, target);
    }
    

    private static void feltolt(ArrayList<Ingatlan> lista) {//feltolti a listat objektumokkal, 13
        Random r=new Random();//Random objektum letrehozasa
        for (int i = 0; i < 13; i++) {//for ciklus 13-ig
            Ingatlan ing=new Ingatlan();//uj Ingatlan tipusu objektum letrehozasa
            ing.azonosito="ingatlan"+(i+1);//azonosito adattagnak ertekadas
            ing.alapterulet=r.nextInt(91)+30;//alapterulet 30-120 kozott
            ing.tip=r.nextInt(2)+1;//tipus adattag: 1-lakas, 2-haz
            lista.add(ing);// a letrehozott objektum listahoz adasa
        }
    }

    private static void listazas(ArrayList<Ingatlan> lista) {//kiiratas metodus lista parameterrel
        for (Ingatlan ingatlan : lista) {//ciklus az adatsorra, elejetol a vegeig FOREACH!!
            System.out.println(ingatlan);//minden egyes vizsgalt objektumot kiiratunk a kepernyore
        }
    }

    private static void szamlistazas(ArrayList<Ingatlan> lista) {//adott tipusuakat megszamoljuk MEGSZAMLALAS ALGORITMUSA
        int count=0;//lakasokat szamlaljuk ebben
        int count2=0;//hazakat szamoljuk ebben
        for (Ingatlan ingatlan : lista) {//minden Ingatlan tipusu elemre amelyre ugy hivatkozunk hogy ingatlan a lista gyujtemenyen belul
            if(ingatlan.tip==1){//HOGYHA a tipus 1, 
                count++;//a lakasok szamlaloja nojon 1-el
            }
            else{//HOGYHA nem lakas akkor tuti hogy haz, >>>> ELSE
                count2++;// a hazak szamlaloja nojon 1-el
            }
        }
        System.out.println("Lakasok szama: "+count);//kiiratas
        System.out.println("Hazak szama: "+count2);
    }

    private static void atlag(ArrayList<Ingatlan> lista) {//a lakasok alapteruletenek atlagat akarjuk megkapni
        int summa=0;// osszegvaltozo, 0-rol indul
        for (Ingatlan ingatlan : lista) {//minden Ingatlan tipusu elemre amelyre ugy hivatkozunk hogy ingatlan a lista gyujtemenyen belul
            summa+=ingatlan.alapterulet;//az osszegvaltozot noveljuk az eppen vizsgalt Ingatlan alapteruletenek ertekevel
        }
        double atlag=summa/lista.size();//atlagot elmentjuk egy valtozoba, DOUBLE!!! lehet tizedes is
        System.out.println("Tehat az atlag "+atlag);//kiiratas
    }

    private static int parameter(ArrayList<Ingatlan> lista, int a) {//parameterkent fogadja a listat es egy tipust aszerint hogy milyen tipusuakat akarunk kigyujteni
        int maximum=0;//a maximum valtozo 0-rol indul
        for (Ingatlan ingatlan : lista) {//minden Ingatlan tipusu elemre amelyre ugy hivatkozunk hogy ingatlan a lista gyujtemenyen belul
            if (ingatlan.tip==a && ingatlan.alapterulet>maximum){// HA az ingatlantipus megegyezik a parameterul kapott tipussal ES az alapterulet NAGYOBB mint a max
                maximum=ingatlan.alapterulet;//AKKOR a max legyen az eppen vizsgalt alapterulete
            }
        }
        return maximum;//visszateresi ertek 
    }

    private static void utso(ArrayList<Ingatlan> lista) {//melyik alapterulet a nagyobb mennyivel?
        int lakasmax=parameter(lista,1);//a lakasok kozul a legnagyobb, az elozo metodus segitsegevel
        int hazmax=parameter(lista,2);// a hazak kozul a legnagyobb, az elozo metodus segitsegevel
        if (lakasmax>hazmax) {// HA a lakasok kozuli a nagyobb
            System.out.println("Tehat a lakas a nagyobb "+Math.abs(hazmax-lakasmax)+" -el"); //kepernyore iratas
        }
        else{//MINDEN MAS ESETBEN (tehat ha a haz a nagyobb)
            System.out.println("Tehat a haz a nagyobb "+Math.abs(hazmax-lakasmax)+" -el");//kepernyore iratas
        }
    }

    private static void tejszinhab(ArrayList<Ingatlan> lista) {//bekerunk egy ingatlant, es ha van ilyen, kiirjuk az adatait
        System.out.print("Adj meg egy szajbakurt erteket ");//kiiratas
        Scanner s=new Scanner(System.in);//Scanner objektum
        String d=s.nextLine();//bekeres, bekert szoveg elmentese valtozoba
        for (int i = 0; i < lista.size(); i++) {//ciklus az adatsorra elejetol a vegeig, 1-es leptekkel
            Ingatlan vizsgalt=lista.get(i);//az eppen vizsgalt elem a lista nevu tomb i-edik eleme
            if(vizsgalt.azonosito.equals(d)){//HA a vizsgalt neve megegyezik a bekert ertekkel
                System.out.println("Tehát a szajbakurt beadas adatai: "+vizsgalt);//irassuk ki
                break;//ciklus megszakitasa
            }
            if(!vizsgalt.azonosito.equals(d)&&i==12){//HA az adatsor vegen vagyunk es nem talalunk egyezoseget
                System.out.println("Nincs ilyen bmeg!!!!");//irassuk ki
            }   
        }
    }
    
    public static void tejszinhab2(ArrayList<Ingatlan> lista, int n, String target){
        Ingatlan vizsgalt = lista.get(n);                               //vizsgalt objektum felallitasa
        if(vizsgalt.azonosito.equals(target)){                          //feltetel, ha megegyezik 
            System.out.println(vizsgalt.toString());                    //kiiratas
        }else if(n<lista.size()){                                       //ha nincs egyezoseg, de meg a listan belul vagyunk
            tejszinhab2(lista, n+1, target);                            //metodus meghivja onmagat, n+1 parameterrel
        }else{                                                          //ha lecsusztunk a listarol
            System.out.println("nincs ilyen");                          //nincs ilyen
        }
    }
}
