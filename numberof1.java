import java.util.Scanner;

public class numberof1 {

    public static void main(String[] args) {
        
        Scanner bc= new Scanner(System.in);
        System.out.println("ENTER A NUMBER: ");
        int n= bc.nextInt();  
        int count=0;
        int bm=1;
        for (int i = 0; i < 8 ; i++) {
            int num=n>>i;
            if ((bm & num)==1) {
                count++;
        
            }
            
            
           
        }
        System.out.println("NUMBER OF 1's IN NUMBER ARE: "+count);
    }
    
}
