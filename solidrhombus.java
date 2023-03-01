import java.util.*;
public class solidrhombus {

    public static void main(String[] args) {
        System.out.println("ENTER NUMBER OF ROWS :");
        Scanner bc=new Scanner(System.in);
        int n=bc.nextInt();
        for(int i=0; i<=n; i++)
        {
            for(int j=0; j<=n-i; j++)
            {
                System.out.print(" ");

            }
            for(int k=0; k<=n; k++)
            {
            System.out.print("*");
            }
            System.out.print("\n");

        }
    }

    
}
// ....****
//...****
//..****
//.****