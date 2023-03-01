import java.util.*;

public class bitmanupalation {
    
    public static void main(String[] args) {
        
        Scanner bc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER :");
        int num=bc.nextInt();
        System.out.println("ENTER THE POSITION :");
        int pos= bc.nextInt();

        int bitMask=1<<pos;



        //GET  OPERATION
        
        if ((bitMask & num)==0) {
            System.out.println("BIT WAS 0");
            
        } else {
            System.out.println("BIT WAS 1");
            
        }



        //SET OPERATION

        int newnum= bitMask | num;
        System.out.println("AFTER SET NEW NUM IS:" +newnum );

        //CLEAR OPERATION

        int newBm=(~(bitMask)) & num;
        System.out.println("THE NEW NUM AFTER CLEAR IS :" +newBm);



        //UPDATE OPERATION

        System.out.println("ENTER THE UPDATE NUM: ");
        int up=bc.nextInt();

        if (up==1) {
            int newNum=bitMask|num;
            System.out.println("NEW NUM AFTER UPDATE IS:"+newNum);
        } else {
            int newNum=(~(bitMask))&num;
            System.out.println("NEW NUM AFTER UPDATE IS :"+ newNum);
            
        }
    }
}
