import java.util.Scanner;

import javax.sound.midi.Synthesizer;

public class spiralprinting {
    public static void main(String[] args) {
        System.out.println("ENTER THE SIZE OF 2D ARRAY: ");
        Scanner bc= new Scanner(System.in);
        int n=bc.nextInt();
        int m=bc.nextInt();
        int arr[][]= new int[n][m];
        System.out.println("ENTER THE ARRAY: ");
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <m; j++) {
                arr[i][j]=bc.nextInt();
            }
            
        }

        System.out.println("ENTERED ARRAY IS:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
               System.out.print(arr[i][j]+" ");
            }
            System.err.println("");
            
        }
        int row_start=0, col_start=0, row_end= n-1, col_end= m-1;
        System.out.println(" ");
        while (row_start<= row_end && col_start<= col_end) {
            for (int i = col_start; i <=col_end; i++) 
            {
                System.out.print(arr[row_start][i]+" ");

            }

            row_start++;
            for (int i = row_start; i <= row_end; i++) {
                System.out.print(arr[i][col_end]+" ");
            }

            col_end--;
            for (int i = col_end; i >=col_start; i--) {
                System.out.print(arr[row_end][i]+" ");
            }

            row_end--;
            for (int i = row_end; i >=row_start; i--) {
                System.out.print(arr[i][col_start]+" ");
            }

            col_start++;
           


        }
    }
    
}
