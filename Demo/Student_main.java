/*

 */
package vizsga;

/**
 *
 * @author dani
 */
import vizsga.Student;
import java.util.*;
public class Student_main {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("number of students: ");
        int n = console.nextInt();
        System.out.println();
        
        ArrayList<Student> students = getList(n);
        
        printList(students);
        
        System.out.println();
        String g=getGender(console);
        listStat(students, g);
    }
    
    public static ArrayList<Student> getList(int n){
        ArrayList<Student> result = new ArrayList<Student>();
        Random r = new Random();
        for(int i=1; i<=n; i++){
            String neptun = getSaltString();
            String name = "Student_"+i;
            boolean b = r.nextBoolean();
            Student s = new Student(neptun, name, b);
            result.add(s);
        }
        return result;
    }
    
    public static String getSaltString() {
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
    
    public static void printList(ArrayList<Student> list){
        for(Student s : list){
            System.out.println(s.toString());
        }
    }
    
    public static String getGender(Scanner console){
        int input = getInt(console);
        
        while(input>1 || input<0){
            System.out.println("out of range");
            input = getInt(console);
            
        }
        if(input==1){
            return "male";
        }else if(input==0){
            return "female";
        }
        return "asd";
    }
    
    public static int getInt(Scanner console){
        System.out.print("[0:female/1:male]: ");
        
        while(!console.hasNextInt()){
            console.next();
            System.out.println("not an integer. try again.");
            System.out.print("[0:female/1:male]: ");
        }
        return console.nextInt();
    }
    
    public static void listStat(ArrayList<Student> list, String gender){
        int male = 0;
        int female = 0;
        for(Student s : list){
            if(s.getGender().equals(gender)){
                male++;
            }else{
                female++;
            }
        }
        int len = list.size();
        if(gender.equals("male")){
            System.out.println("number of males: "+male);
            System.out.println("percent of males: "+male*100/len+"%");
        }else{
            System.out.println("number of females: "+female);
            System.out.println("percent of females: "+female*100/len+"%");
        }
    }
}
