import java.util.*;

public class searchingarray{
    public static void main(String[] args) {
        System.out.println("ENTER SIZE OF 2D ARRAY:");
        Scanner bc=new Scanner(System.in);
        int n=bc.nextInt();
        int m=bc.nextInt();     
        int[][] array2d=new int[n][m];
        System.out.println("ENTER THE ARRAY: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array2d[i][j]=bc.nextInt();
            }
        }
        System.out.println("ARRAY IS: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array2d[i][j]+" "); 
            }
            System.out.println(" ");
        }

        System.out.println("ENTER THE ELEMENT YOU WANT TO SEARCH: ");
        int x=bc.nextInt();
        boolean flag=false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (array2d[i][j]==x) {
                    System.out.println("THE ELEMENT IS AT: "+"("+i+","+j+")");
                    flag=true;
                }
            }
        }
        if (flag==false) {
            System.out.println("ELEMENT NOT FOUND.");
            
        }
    }    

}