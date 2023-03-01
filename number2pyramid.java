import java.util.*;
public class number2pyramid {
    public static void main(String[] args) {
        System.out.println("ENTER THE ROWS:");
        Scanner bc= new Scanner(System.in);
        int n=bc.nextInt();
        int count=1;
        for(int i=1; i<=n; i++)
        {
            
            for(int j=1; j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1; k<=count; k++)
            {
                System.out.print(count);
                System.out.print(" ");
            }
            for(int j=1; j<=n-i;j++)
            {
                System.out.print(" ");
            }
            System.out.println("\n");
            count++;
        }
    }
}
//....1....
//...22...
