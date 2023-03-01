import java.util.*;
public class recusionpowerofN_2 {
     public static  int powerofNumbers(int x, int p) 
     {
        if (p==0) {
            return 1;
            
        }

        if (p % 2==0) {
            return powerofNumbers(x, p/2) * powerofNumbers(x, p/2);            
        }
        else
        {
            return x* powerofNumbers(x, p/2) * powerofNumbers(x, p/2) ;
        }
        
     }
    public static void main(String[] args) {

        Scanner bc=new Scanner(System.in);
        System.out.print("ENTER A NUMBER:  ");
        int n=bc.nextInt();
        System.out.print("ENTER THE POWER:  ");
        int p=bc.nextInt();
        System.out.println("ANSWER IS:"+ powerofNumbers(n, p));
    }
}
