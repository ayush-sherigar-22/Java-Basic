import java.util.Scanner;

public class recursionprintNto1 {
    

    public static void printNUM(int n) {
        if (n==0) {
            return;
            
        }


        System.out.println(n);
        printNUM(n-1);
        
    }
    public static void main(String[] args) {
        Scanner bc=new Scanner(System.in);
        System.out.print("ENTER A N:");
        int n=bc.nextInt();
        printNUM(n);
    }
}
