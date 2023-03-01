import java.util.Scanner;

public class avgfucntion {
    public static int  avgFunc(int n1, int n2, int n3) {
        int ans= (n1+n2+n3)/3;
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("ENTER THREE NUMBERS: ");
        Scanner bc= new Scanner(System.in);
        int a=bc.nextInt();
        int b=bc.nextInt();
        int c=bc.nextInt();
        System.out.println("AVERAGE IS :"+avgFunc(a,b,c));
     
    }
}
