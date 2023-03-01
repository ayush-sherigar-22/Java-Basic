import java.util.*;
public class hollowrhombus {
    public static void main(String[] args) {
        System.out.print("ENTER NUMBER OF ROWS: ");
        Scanner bc= new Scanner(System.in);
        int n= bc.nextInt();
       
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n-i; j++)
            {
                System.out.print(" ");
            }
            for(int k=1; k<=n; k++)
            {
                if(k==1||k==n || i==1 || i==n)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }    
}
