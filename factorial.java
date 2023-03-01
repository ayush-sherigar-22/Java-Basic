import java.util.*;

import javax.lang.model.util.ElementScanner14;

public class factorial {
 public static int factNum(int n)
  {
      if(n==0 || n==1)
      {
          int ans=1;
          return ans;

      }
      else if(n<0)
      {
         int ans=0;
          return ans;
      }
      else{
        int ans=1;
          for(int i=1; i<=n; i++)
          {
              ans=ans*i;
            }
            return ans;
      }
      }
      public static void main(String[] args) 
      {
          System.out.println("ENTER A NUMER: ");
          Scanner bn=new Scanner(System.in);
          int n=bn.nextInt();
          System.out.println("FACTORIAL IS :"+factNum(n));
          
      }
     
 
}
