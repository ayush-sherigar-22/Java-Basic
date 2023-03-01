import java.util.*;
public class numconversion {

    public static void decTobinary(int num) {
       
       
        StringBuilder num2= new StringBuilder("00000000");
        
        for (int i = 0; i < 8 ; i++) {
            int bitmask=1<<i;
            int pos=7-i;

            // if (pos==4) {
            //     num2.setCharAt(pos, ' ');
                
            // }

            if ((bitmask & num)==0) {

                num2.setCharAt(pos, '0');
        
            }
            
            else{
                num2.setCharAt(pos, '1');
            }
            
            
           
        }
        System.out.println("CONVERSION IS:"+num2);
        
    }

    public static void main(String[] args) {
        Scanner bc= new Scanner(System.in);
        System.out.println("ENTER YOUR CHOICE:\n  1.BINARY TO DECIMAL\n 2.DECIMAL TO BINARY  ");
        int c=bc.nextInt();
      

        switch (c) {
            case 1:
            System.out.println("ENTER  A NUMBER: ");
            int num=bc.nextInt();
               decTobinary(num);
               break;
        
            default:
                System.out.println("INVALID INPUT");
        }
        

    }
}
