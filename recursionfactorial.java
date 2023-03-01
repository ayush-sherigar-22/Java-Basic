import java.util.Scanner;

public class recursionfactorial {
    


    public static void factorialofnum(int n, int i, int ans) {
        if (n==0 || n==1) {
            System.out.println("FACTORIAL IS: 1");
            return;
            
        }
        if (i==n) {

            ans*=i;
            System.out.println("FACTORIAL IS: "+ans);
            return;
        }
       
        ans*=i;
        factorialofnum(n, i+1, ans);
       
    }
    public static void main(String[] args) {
        
        Scanner bc=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER FOR FACTORIAL:");
        int n=bc.nextInt();
        int ans=1;
        int i=1;
        factorialofnum(n, i, ans);
    }
}
