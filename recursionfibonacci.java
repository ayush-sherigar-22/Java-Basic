import java.util.Scanner;

public class recursionfibonacci {
    
    public static void fibonacciSeries(int n, int a, int b) {
        if (n==0) {
            return;
            
        }
        System.out.print(" "+a);
        fibonacciSeries(n-1, b, a+b);
        
    }
    public static void main(String[] args) {
        
        Scanner bc= new Scanner(System.in);
        System.out.print("ENTER THE LIMIT: ");
        int n=bc.nextInt();
        int a=0;
        int b=1;
       System.out.println("THE FIBONACCI SERIES TILL "+n +" IS:");
       fibonacciSeries(n, a, b);
    }
}
