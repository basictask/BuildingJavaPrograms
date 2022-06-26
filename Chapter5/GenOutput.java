/*

 */
package Chapter5;

/**
 *
 * @author Daniel Kuknyo
 */
public class GenOutput {
    public static void main(String[] args){
        forciklussal();
        whileciklussal();
    }
    
    public static void forciklussal(){
        int kezdo = 1;                      //A legelso ertek 1
        int noveles = 3;                    //Az elso novekedes erteke 3
        System.out.print(kezdo);            //Kiiratom a kezdo erteket
        
        for(int i=0; i < 9; i++){           //9 tagot akarok a sorozatba => for ciklus 9-szer
            kezdo += noveles;               //megnovelem a szamlalot a noveles ertekevel
            System.out.print(", "+kezdo);   //kiiratom a szamlalot a kepernyore
            noveles+=2;                     //a noveles erteket 2-vel novelem
        }
        System.out.println("");             //soremeles
    }
    
    public static void whileciklussal(){
        int szamlalo = 1;                   //szamlalonak kezdeti erteket adok
        int noveles = 3;                    //a novekedesnek kezdeti erteket adok
        
        while(szamlalo<=100){               //AMEDDIG a szamlalo kisebbegyenlo mint 100
            System.out.print(szamlalo + ", ");  //Kiirjuk a szamlalot a kepernyore
            szamlalo += noveles;                //noveljuk a szamlalot a novekedes ertekevel
            noveles += 2;                       //noveljuk a novekedes erteket 2-vel
        }
    }
}
