import java.util.Scanner;

public class raisedtopower {
    public static int multiplyAns(int n, int x) {
        int ans=1;
        for(int i=1; i<=n; i++)
        {
            ans*=x;
        }
        return ans;
    }
    
    public static void main(String[] args) {
        Scanner bc=new Scanner(System.in);
        System.out.println("ENTER THE POWER: ");
        int n=bc.nextInt();
        System.out.println("ENTER THE NUMBER: ");
        int x= bc.nextInt();
        System.out.println("THE ANSWER OF "+x+"^"+n+" IS: "+multiplyAns(n, x));
    }
}
