import java.util.*;

import javax.naming.spi.DirStateFactory.Result;
import javax.print.DocFlavor.STRING;
public class stringemail {
    public static void main(String[] args) {
        
        Scanner bc=new Scanner(System.in);

        System.out.println("ENTER THE EMAIL ID :");
        String str=bc.next();
        String result="";
        for (int i = 0; i < str.length(); i++) {
            
            if (str.charAt(i)=='@') {
                result= str.substring(0,i);
                break;  
                
            }
        }
        System.out.println("THE RESULT IS :"+ result);
    }
}
