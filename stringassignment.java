import java.util.*;

public class stringassignment {
    
    public static void main(String[] args) {
        
            Scanner bc = new Scanner(System.in);
            System.out.println("ENTER A STRING :");
            String str=bc.next();
            String result="";

            for (int i = 0; i < str.length(); i++) {

                if (str.charAt(i) =='e') {
                    result+= "i";
                    
                }

                else{
                    result+=str.charAt(i);
                }
                
             } System.out.println("RESULT IS :"+ result);
            
    }
}
