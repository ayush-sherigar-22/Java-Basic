import java.util.Scanner;

public class recursionprint1toN {
    
    public static void print1toN(int n, int i) {
        if (i==n+1) {
            return;
            
        }
        System.out.println(i);
        print1toN(n,i+1);
        
    }

    public static void main(String[] args) {

        Scanner bc=new Scanner(System.in);
        System.out.print("ENTERT N:");
        int n=bc.nextInt();
        int i=1;
        print1toN(n, i);
    }
}
