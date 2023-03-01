import java.util.*;

public class greaternumber {
    public static int  greaterNumber(int n1,int n2) {
        if(n1>n2)
        {
            return n1;
        }
        else
        {
            return n2;
        }
        
    }    

    public static void main(String[] args) {
        System.out.print("ENTER TWO NUMBERS: ");
        Scanner bc=new Scanner(System.in);
        int a=bc.nextInt();
        int b=bc.nextInt();
        System.out.println("THE GREATER BETWEEN "+a+" AND "+b+" IS: "+greaterNumber(a, b));
    }
    
}
