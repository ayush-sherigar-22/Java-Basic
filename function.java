import java.util.*;


public class function {
   public static void printmyName(String  name)
   {
        System.out.println(name);
   }
    public static void main(String[] args){
        System.out.println("ENTER NAME :");
        Scanner n= new Scanner(System.in);
        String name=n.next();
        printmyName(name);
    }
}
