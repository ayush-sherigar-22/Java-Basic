import java.util.Scanner;

public class recursionsumofNnum {
    
    public static void sumofNaturalnum(int n, int i, int ans) {
        if (i==n) {

            ans+=i;
            System.out.println("SUM IS:"+ans);
            return;
            
        }

        ans+=i;
        sumofNaturalnum(n, i+1, ans);
        
    }

    public static void main(String[] args) {
        Scanner bc=new Scanner(System.in);
        System.out.print("ENTER N:");
        int n=bc.nextInt();
        int i=0;
        int ans=0;
        sumofNaturalnum(n, i, ans);
    }
}
