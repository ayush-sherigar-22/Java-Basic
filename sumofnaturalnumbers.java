import java.util.Scanner;

public class sumofnaturalnumbers {
    public static void main(String[] args) {
        System.out.print("ENTER THE LIMIT :");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=0;
        for(int i=1;i<=n;i++){
            ans+=i;
        }
        System.out.println("\n THE SUM OF NATURAL NUMBERS TILL " +n+ " IS : "+ ans);
    }
    
}
