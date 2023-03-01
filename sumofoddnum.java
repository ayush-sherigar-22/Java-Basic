import java.util.*;

public class sumofoddnum {
    public static int  ans(int n)
    {
        int ans=0;
        for(int i=0; i<=n; i++)
        {
            if((i%2)!=0)
            {
                ans+=i;
            }
        }
        return ans;
    }
     
    public static void main(String[] args) {
        System.out.println("ENTER THE LIMIT OF NUMBERS: ");
        Scanner bc=new Scanner(System.in);
        int n=bc.nextInt();
        System.out.println("SUM OF ALL OD NUMBERS FROM 1 TO "+n+" IS: "+ans(n));
        
    }   
    
}
