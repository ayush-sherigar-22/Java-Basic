import java.util.*;

public class removeDuplicate {
    
    public static String duplicateRemoving(String str, int ind, boolean present[]) {
        if (ind==str.length()) {
            return "";
            
        }
        char curr = str.charAt(ind);
        if (present[curr - 'a']) {
            return duplicateRemoving(str, ind+1, present);
            
        }
        else{
            present[curr - 'a'] =true;
            return curr + duplicateRemoving(str, ind+1, present);
        }
        
    }

    public static void main(String[] args) {
        Scanner bc=new Scanner(System.in);
        // System.out.print("ENTER A STRING : ");
        String str = "abcadbcefghabi";
        boolean present[]= new boolean[str.length()];
        System.out.println(duplicateRemoving(str, 0, present));
    }
}
