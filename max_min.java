import java.util.*;

import javax.lang.model.util.ElementScanner14;

import java.math.*;

public class max_min {
    public static void main(String[] args) {
        System.out.print("ENTER THE SIZE OF ARRAY: ");
        Scanner bv=new Scanner(System.in);
        int size=bv.nextInt();
        int array[]=new int[size];
        System.out.print("ENTER ARRAY: ");
        for(int i=0; i<size; i++ )
        {
            array[i]=bv.nextInt();

        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0; i<array.length; i++)
        {
            if(array[i]>max)
            {
                max=array[i];
            }
            else if(array[i]<min)
            {
                min=array[i];
            }
            else{
                continue;
            }
        
        }
        
        System.out.println("THE MAX IS: "+max+"\n AND MIN IS:"+min);
    }
    
}
