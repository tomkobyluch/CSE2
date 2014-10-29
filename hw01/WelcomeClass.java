import java.util.List;
import java.util.ArrayList;

public class WelcomeClass{
    
//  add main method
    public static void main(String arg[]){
        
       List <Integer> adig = new ArrayList <Integer>();
        
        int a = 784;
        
        while (a > 0) {
            adig.add(a%10);
            a = a / 10;
        }
        
        System.out.println(adig.get(0));
    }
}