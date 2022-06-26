/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;// util csomag mindig jol jon

/**
 *
 * @author SzucsA2
 */
public class class2 {
    
    public static void main(String[] args){
        int[] tomb=new int[10];//10 elemu tomb letrehozasa, nullekvivalens minden ertek
        Random r=new Random();//Random generator letrehozasa
        for (int i = 0; i < tomb.length; i++) {//for ciklus 1-tol a tomb hosszaig
            tomb[i]=r.nextInt(31)+20;//a tomb i-edik elemehez hozzarendel -30 es 20 kozotti szamot
        }
        System.out.println(Arrays.toString(tomb));//tomb kiiratasa. Arrays osztaly toString metodusa tomb parameterrel
        System.out.println();
        elso(tomb);//elso meghivasa, tomb parameterrel
        System.out.println();
        masodik(tomb);//masodik meghivasa, tomb parameterrel
        System.out.println();
        harmadik(tomb);//harmadik meghivasa, tomb parameterrel
        System.out.println();
        negyedik();//negyedik meghivasa
        System.out.println();
        otodikvizsga1();//otodik
        System.out.println();
        hatodivizsgaf2();//hatodik
    }

    private static void elso(int[] tomb) {//maximum kereses
        int max=0;//maximum kezdeti erteke
        for (int i : tomb) {//tomb bejarasa
            if (i>max){//HA az adott elem erteke nagyobb mint max
                max=i;//a max valtozo ertekenek ujrairasa az eppen vizsgallt ertekke
            }
        }
        System.out.println("A legnagyobb a tombben a "+max);//kiiratas
    }

    private static void masodik(int[] tomb) {//minimum kereses
        int min=tomb[0];//minimum valtozo letrehozasa, kezdeti ertek a tomb elso eleme, a helyesseg biztositasa miatt
        for (int i : tomb) {//minden int tipusu i valtozo nevu elemre a tomb adatcsoporton belul
            if (i<min) {//HA a vizsgalt ertek kisebb mint a min
                min=i;//a min ertekenek modositasa az eppen vizsgalt ertekre
            }
        }
        System.out.println("Tehat a legkisebb szam a tombben a "+min);//kiiratas
    }   

    private static void harmadik(int[] tomb) {//annak vizsgalata, hogy van-e dupla a tombon belul, TOMB PARAMETERT ADTUNK 
        boolean b=false;// logikai valtozo inicializalasa false-ra
        for (int i : tomb) {//a kulso for ciklus felel az eppen vizsgalt elemert
            int darab=0;//a vizsgalt elem elofordulasainak darabszama darabvaltozoban
            for (int j : tomb) {//a belso for ciklus szamolja meg az eppen vizsgalt elem elofordulasainak szamat
                if (j==i){//HA a tombon belul egyezik az egyik elem az eppen vizsgalttal 
                    darab++;//AKKOR noveljuk a darabvaltozot
                }
            }
            if (darab>1) {//HA tobb van mint 1
                b=true;//AKKOR a logikai valtozo felveheti az igaz erteket
            }
        }
        if (b){//hogyha tobb van mint 2, azaz b erteke TRUE
            System.out.println("Tehat van egyezoseg");//kiir
        }else{//minden mas esetben (b FALSE)
            System.out.println("Tehat nincs egyezoseg");//kiir
        }
    }

    private static void negyedik() {//addig dobunk ameddig nem lesz az 2 dobas ossszege 12
        Random r=new Random();//Random generator
        int elsodobas=r.nextInt(6)+1;//elso dobas random 1-6
        int masodik=r.nextInt(6)+1;//masodik dobas random 1-6
        int sum=elsodobas+masodik;//osszeguknek az eltarolasa
        System.out.printf("elso: %d, masoodik: %d, ossz: %d\n", elsodobas, masodik, sum);//kiiratas, printf az egyszeruseg miatt
        
        int darab=1;//mivel az elozo sorokban mar dobtunk egyszer a megszamlalast 1-rol kezdjuk
        while (sum!=12){//AMEDDIG az osszeg NEM EGYENLO 12-vel
            
            elsodobas=r.nextInt(6)+1;//elsodobas ertekenek megvaltoztatasa
            masodik=r.nextInt(6)+1;//masodikdobas ertekenek megvaltoztatasa
            sum=elsodobas+masodik;//szumma ertekenek atirasa
            darab++;//darabvaltozo novelese
            System.out.printf("elso: %d, masoodik: %d, ossz: %d\n", elsodobas, masodik, sum);//kiiratas
            
        }System.out.println("Tehat a dobasok szama: "+darab);//darabszam kiiratasa
    }

    private static void otodikvizsga1() {//tombon belul paros szamok lefelezese
        int[] tomb2=new int[10];//tomb letrehozasa, 10 hosszu, NULLEKVIVALENS
        Random r=new Random();//Random objektum letrehozasa
        for (int i = 0; i < tomb2.length; i++) {//for ciklus 0-tol a tomb vegeig
            tomb2[i]=r.nextInt(51)-30;//a tomb i-edik elemenek ertekenek modositasa veletlen szamra
        }
        System.out.println(Arrays.toString(tomb2));//tomb2 kiiratasa, Arrays osztaly toString metodusa
        for (int i = 0; i < tomb2.length; i++) {//ciklus az adatsorra >> FOR es nem FOR-EACH mert modositjuk az elemeket
            if (tomb2[i]%2==0){//VIZSGALAT: HA tomb i-edik erteke paros, azaz maradektalanul oszthato 2-vel
                tomb2[i]=tomb2[i]/2;//AKKOR modositsa a tomb i-edik elemenek erteket
            }
        }
        System.out.println(Arrays.toString(tomb2));//kiiratass
    }

    private static void hatodivizsgaf2() {//szamok beolvasasa billzetrol, majd ezekkel matek
        //mivel szobajohet tizedestort ertek, DOUBLE ADATTIPUSSAL kell szamolni
        Scanner s=new Scanner(System.in);//Scanner objektum
        System.out.print("Kerem az elsot!");//elso
        double a=s.nextDouble();//elso szam elmentese a valtozoba
        System.out.print("Kerem a masodikat!");
        double b=s.nextDouble();//masodik szam elmentese b valtozoba
        System.out.print("Kerem a harmadikat!");
        double c=s.nextDouble();//harmadik szam elmentese c valtozoba
        
        double valtozo=b/(2*c)-(a%c);//matek
        System.out.println(valtozo);   //kiiratas
    }
}   
