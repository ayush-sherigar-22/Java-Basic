import java.util.*;

public class recursionpower {
    
    public static int powerofNum(int x, int p) {
        if(x==0){
            return 0;
        }
        if (p==0) {
            return 1;
            
        }
        int xn=powerofNum(x, p-1);
        int ans=x*xn;
        return ans;
        
    }
 
    public static void main(String[] args) {
        Scanner bc=new Scanner(System.in);
        System.out.print("ENTER A NUMBER: ");
        int n=bc.nextInt();
        System.out.print("ENTER THE POWER: ");
        int p=bc.nextInt();
        System.out.println("ANSWER IS:"+ powerofNum(n, p));
    }    
}
