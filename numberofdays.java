import java.nio.channels.NonReadableChannelException;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class numberofdays {

    public static void main(String[] args) {
        Scanner bc=new Scanner(System.in);
        System.out.println("ENTER A YEAR :");
        int ab=bc.nextInt();
        System.out.println("ENTER A MONTH: ");
        int mnth=bc.nextInt();

        if(mnth==2){
            if(ab%4==0)
            {
                System.out.println("number of days in February in "+ab+" is 29");
            }
            else{
                System.out.println("number of days in February in"+ab+" is 28");
            }
            
        }
        else if (mnth==1||mnth==3||mnth==5||mnth==7||mnth==8||mnth==10||mnth==12) {
            switch(mnth){

                case 1:
                System.out.println("number of days in January in "+ab+" is 31");
                break;

                case 3:
                System.out.println("number of days in March in "+ab+" is 31");
                break;

                case 5:
                System.out.println("number of days in May in "+ab+" is 31");
                break;

                case 7:
                System.out.println("number of days in July in "+ab+" is 31");
                break;

                case 8:
                System.out.println("number of days in August in "+ab+" is 31");
                break;

                case 10:
                System.out.println("number of days in October in "+ab+" is 31");
                break;

                case 12:
                System.out.println("number of days in "+" in "+ab+" is 31");
                break;

            }
           
          
        } else {
            switch(mnth){

              
                case 4:
                System.out.println("number of days in April in "+ab+" is 31");
                break;

                case 6: 
                System.out.println("number of days in June in "+ab+" is 31");
                break;

                case 9:
                System.out.println("number of days in September in "+ab+" is 31");
                break;

                case 11:
                System.out.println("number of days in November in "+ab+" is 31");
                break;


            }
            
            
        }
    }
    
}
