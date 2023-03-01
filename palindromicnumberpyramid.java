import java.util.*;
 public class palindromicnumberpyramid{
     public static void main(String[] args) {
         System.out.print("ENTER NUMBER OF ROWS:");
         Scanner bc= new Scanner(System.in);
         int n=bc.nextInt();
        
         for(int i =1; i<=n; i++){
            int count=i;
            for(int j=1; j<=n-i; j++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++)
            {
                System.out.print(count);
                if(count==1){
                    break;
                }
                else{
                    count--;
                    continue;
                }
            }
            for(int k=1; k<=i-1;k++)
            {
                count++;
                System.out.print(count);
            }
            System.out.print("\n");

         }
     }
 }