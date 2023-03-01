import java.util.*;
public class hollowrectangle {
    public static void main(String[] args) {
        System.out.println("ENTER THE NUMBER OF ROWS & COLUMNS :");
        Scanner bc=new Scanner(System.in);
        int n=bc.nextInt();
        int m=bc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(i==1 || i==n || j==1 || j==m){
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
