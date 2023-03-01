import java.util.*;
public class pascaltraingle {
    public static void main(String[] args) {
        System.out.print(" ENTER NUMBER OF ROWS: ");
        Scanner BC= new Scanner(System.in);
        int n=BC.nextInt();
        int count=1;
        for(int i=0; i<=n; i++)
        {
            for (int j=1; j<=n-i; j++) {
                System.out.print(" ");
                
            }
            for (int j=1; j<=i; j++) {
                System.out.print(count);
                count++;
            }
            System.out.print("\n");
        }
        
    }
    
}
