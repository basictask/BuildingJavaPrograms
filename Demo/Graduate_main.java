/*

 */
package vizsga;

/**
 *
 * @author dani
 */
import vizsga.Graduate;
import java.util.*;
import java.io.*;
public class Graduate_main {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner console = new Scanner(System.in);
        System.out.print("enter number of graduates: ");
        int n = console.nextInt();
        ArrayList<Graduate> grads = getList(n);
        
        System.out.println();
        printList(grads);
        
        System.out.println();
        printAverages(grads);
        
        printBest(grads);
    }
    
    public static ArrayList<Graduate> getList(int n){
        ArrayList<Graduate> result = new ArrayList<Graduate>();
        Random r = new Random();
        for(int i=0; i<n; i++){
            String neptun = getNeptun();
            HashMap<String, Integer> grades = getMap();
            int age = r.nextInt(10)+20;
            Graduate g = new Graduate(neptun, grades, age);
            result.add(g);
        }
        return result;
    }
    
    public static String getNeptun() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 6) {
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;
    }
        
    public static HashMap<String, Integer> getMap(){
        Random r = new Random();
        HashMap<String, Integer> result = new HashMap<String, Integer>();
        int a = r.nextInt(5)+1;
        int b = r.nextInt(5)+1;
        int c = r.nextInt(5)+1;
        result.put("Maths", a);
        result.put("Physics", b);
        result.put("Art", c);
        return result;
    }
    
    public static void printList(ArrayList<Graduate> list){
        for(Graduate g : list){
            System.out.println(g.toString());
        }
    }
    
    public static void printAverages(ArrayList<Graduate> list){
        for(Graduate g : list){
            double sum = 0;
            HashMap<String, Integer> map = g.getMap();
            for(String s : map.keySet()){
                int n = map.get(s);
                sum+=n;
            }
            System.out.printf("%s: average: %.2f\n",g.getNeptun(), sum/3);
        }
    }
    
    public static void printBest(ArrayList<Graduate> list) throws FileNotFoundException{
        PrintStream output = new PrintStream(new File("best.txt"));
        ArrayList<Graduate> grads = list;
        
        for(int i=0; i<3; i++){
            int max = 0;
            for(int j=0; j<grads.size(); j++){
                Graduate g = grads.get(j);
                if(g.getAverage()>max){
                    max = j;
                }
            }
            Graduate gmax = grads.get(max);
            output.print(gmax.toString()+", avg:"+gmax.getAverage());
            output.println();
            grads.remove(max);
        }
    }
}
