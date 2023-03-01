import java.nio.file.spi.FileSystemProvider;
import java.util.*;

public class tableofgivennumber {
    public static void main(String[] args) {
        System.out.print("ENTER THE NUMBER :");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        System.out.println("THE TABLE IS :");
        for(int i=1; i<=12; i++)
        {
            System.out.println(n+" X "+i+" = "+i*n);
        }
    }
}
