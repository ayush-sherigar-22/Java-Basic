import java.util.Scanner;

public class recursionreversestring {

    public static String reverseString(String ans) {
        if (ans.length() == 1) {
            return ans;
            
        }
       char currchar=ans.charAt(0);
       String nextstring= reverseString(ans.substring(1));
       return nextstring+currchar; 

        
    }
    public static void main(String[] args) {
        Scanner bc=new Scanner(System.in);
        System.out.print("ENTER A STRING:");
        String str=bc.nextLine();
       System.out.println(reverseString(str));

    }
    
}
