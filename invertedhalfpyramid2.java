import java.util.*;
public class invertedhalfpyramid2 {
    
    public static void main(String[] args) {
        System.out.println("ENTER THE NUMBER OF ROWS :");
        Scanner bc=new Scanner(System.in);
        int n=bc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){ //for spaces
               System.out.print(" ");
            }
            for(int m =1; m<=i; m++)
            { //for stars   
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
// ...*
// ..**
// .***
// ****