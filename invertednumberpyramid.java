import java.util.*;

public class invertednumberpyramid {
   
    public static void main(String[] args) {
    System.out.println("ENTER THE NUMBER OF ROWS :");
    Scanner bc=new Scanner(System.in);
    int n=bc.nextInt();
    for(int i=n; i>=1; i--){
        for(int j=1; j<=i; j++){
         System.out.print(j);
        }
        System.out.print("\n");
    
    }
    
    }
}