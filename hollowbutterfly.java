import java.util.*;

import javax.naming.event.NamingExceptionEvent;
import javax.sound.midi.SysexMessage;
import javax.sql.rowset.spi.SyncResolver;
public class hollowbutterfly {
    public static void main(String[] args) {
        System.out.print("ENTER THE ROWS :");
        Scanner bc=new Scanner(System.in);
        int n=bc.nextInt();
        for(int i=1; i<=n-1; i++)
        {
            for(int j=1; j<=i; j++)
            {
                if(j==1 || j==i)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            for(int j=1; j<=n-i; j++ )
            {
                System.err.print(" ");
            }
            for(int j=1; j<=n-i; j++ )
            {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++)
            {
                if(j==1 || j==i)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");

        }
        for(int i=n; i>=1; i--)
        {
            for(int j=1; j<=i; j++)
            {
                if(j==1 || j==i)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            for(int j=1; j<=n-i; j++ )
            {
                System.err.print(" ");
            }
            for(int j=1; j<=n-i; j++ )
            {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++)
            {
                if(j==1 || j==i)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");

        }


    }
}
