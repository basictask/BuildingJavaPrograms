package vizsga;
import java.util.*;
class Ingatlan {
    String azonosito;
    int alapterulet;
    int tipus;

    @Override
    public String toString() {
        return azonosito + ":  alapterulet: " + alapterulet + ", tipus: " + tipus;
    }
}
public class Ingatlanok {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<Ingatlan> ingatlanok = new ArrayList<Ingatlan>();
        feltolt(ingatlanok);
        kiir(ingatlanok);
        System.out.println();
        megszamol(ingatlanok);
        System.out.println();
        teruletatlag(ingatlanok);
        System.out.println();
        System.out.print("Melyik típus? ");
        int a = scn.nextInt();
        
        
        System.out.println("A maximum az adott típusból= "+maxterulet(ingatlanok, a));
        System.out.println();
        utolso(ingatlanok);
    }

    private static void feltolt(ArrayList<Ingatlan> ingatlanok) {
        Random rnd = new Random();
        for (int i = 0; i < 13; i++) {
            Ingatlan s = new Ingatlan();
            s.azonosito = "ingatlan"+(i+1);
            s.alapterulet = rnd.nextInt(91)+30;
            s.tipus = rnd.nextInt(2)+1;
            ingatlanok.add(s);
            
        }
    }

    private static void kiir(ArrayList<Ingatlan> ingatlanok) {
        for (Ingatlan s : ingatlanok) {
            System.out.println(s);
        }
    }

    private static void megszamol(ArrayList<Ingatlan> ingatlanok) {
        int lakas = 0;
        int haz = 0;
        for (Ingatlan s : ingatlanok) {
            if (s.tipus==1) {
                lakas++;
            }else {
                haz++;
            }
        }
        System.out.println("Lakások száma= "+lakas);
        System.out.println("Házak száma= "+haz);
    }

    private static void teruletatlag(ArrayList<Ingatlan> ingatlanok) {
        int sum = 0;
        int all = ingatlanok.size();
        for (Ingatlan s : ingatlanok) {
            sum += s.alapterulet;
        }
        System.out.println("Az alapterületek átlaga= "+(sum/all));
    }

    private static int maxterulet(ArrayList<Ingatlan> ingatlanok, int a) {
        int max = 0;
        for (Ingatlan s : ingatlanok) {
            if (a==s.tipus) {
                if (s.alapterulet>max) {
                    max = s.alapterulet;
                }
            }
        }
        return max;
    }

    private static void utolso(ArrayList<Ingatlan> ingatlanok) {
        double lak = 0;
        double hazz = 0;
        lak = maxterulet(ingatlanok, 1);
        hazz = maxterulet(ingatlanok, 2);
        if (lak>hazz) {
            System.out.println("Lakás területe nagyobb.");
        }else if (hazz > lak) {
            System.out.println("Ház területe nagyobb.");
        }else {
            System.out.println("Egyenlő!");
        }
        System.out.println("A különbségük= "+(Math.abs(lak-hazz)));
    }
    
}