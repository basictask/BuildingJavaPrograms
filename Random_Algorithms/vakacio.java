package test;


public class vakacio {
    public static void main(String[] args){
        
        String a = "Vakáció";
        
        for(int i = 0; i<= a.length(); i++){
            spaces(a.length()-i);
            System.out.println(a.substring(a.length()-i, a.length()));
        }
    }
    
    public static void spaces(int n){
        for (int j=0; j<=n; j++){
            System.out.print(" ");
        }
    }
    
}
