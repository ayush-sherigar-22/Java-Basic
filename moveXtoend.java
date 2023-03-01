import java.util.*;

public class moveXtoend {

    public static String addX(int count) {
        String newstr="x";
        for (int i = 1; i < count; i++) {

            newstr+='x';
            
        }
        return newstr;
        
    }
    

    public static String movex(String str, int ind, int count) {
        if(ind==str.length())
        {
            return addX(count);
        }

        if (str.charAt(ind)=='x') {
            return movex(str, ind+1, count+1);

        }
        else{
            String nextstr= movex(str, ind+ 1, count);
            return str.charAt(ind)+nextstr;
        }
        
    }
    public static void main(String[] args) {
        Scanner bc=new Scanner(System.in);
        System.out.print("ENTER A STRING WITH X : ");
        String str=bc.nextLine();
        int count=0;

        String newstr= movex(str, 0, count);
        System.out.println(newstr);
    }
}
