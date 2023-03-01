import java.util.*;
import java.math.*;

import javax.lang.model.util.ElementScanner14;

public class conditionalStatment {
    public static void main(String[] args) {
        // Scanner bv=new Scanner(System.in);
        // int b=bv.nextInt();
        // if(b>18)
        //  System.out.println("Adult");
        // else
        //  System.out.println("Not Adult");
        
        // if(b>18){
        //     System.out.println("YOU ARE ADULT");
        // }
        // else if(13<b && b<18){
        //     System.out.println("YOU ARE TEEN");
        // }
        // else if(9 <b && b < 13){
        //     System.out.println("YOU ARE PRE-TEEN");
        // }
        // else{
        // System.out.println("YOU ARE A CHILD");
        // }
        System.out.println("ENTER TWO NUMBERS :");
        Scanner bv=new Scanner(System.in);
        int b=bv.nextInt();
        int a=bv.nextInt();
        System.out.println("WHICH CALCULATION YOU WANT TO PERFORM : \n 1.ADDITION \n 2.SUBTRACTION \n 3.MULTIPLICATION \n 4.DIVISION");
        int c=bv.nextInt();
        int d;

        switch(c)
        {
            case 1: d = a+b;
            System.out.println(d);
            break;

            case 2: d = a-b;
            System.out.println(d);
            break;
            
            case 3: d = a*b;
            System.out.println(d);
            break;

            case 4: double f = b/a;
            System.out.println(f);
            break;

            default:
             System.out.println("INVALID INPUT.");


        }
    }

    
}
