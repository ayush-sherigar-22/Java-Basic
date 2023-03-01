import java.util.*;


public class fibonacciseries {

    public static int  fibSeries(int n) {
        int ans1=0,ans2=1,ans3;
        System.out.print("0 1 ");
        for(int i=2; i<=n; i++)
        {
            ans3=ans1+ans2;
            System.out.print(ans3+" ");
            ans1=ans2;
            ans2=ans3;
        
        }
        return 0 ;
    }

    public static void main(String[] args) {
        System.out.print("ENTER A NUMBER: ");
        Scanner bv=new Scanner(System.in);
        int a=bv.nextInt();
        System.out.println("THE FIBONACCI SERIES TILL "+a+" IS: ");
        fibSeries(a);
    }
}
