import java.util.*;

public class floydstriangle {
     public static void main(String[] args) {
    System.out.println("ENTER THE NUMBER OF ROWS :");
    Scanner bc=new Scanner(System.in);
    int n=bc.nextInt();
    int sum=1;
    for(int i=1; i<=n; i++){
        for(int j=1; j<=i; j++){
          System.out.print(sum+" ");
          sum+=1;
        }
        System.out.print("\n");
    }
    }   
}
