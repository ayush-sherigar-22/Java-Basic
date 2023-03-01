import java.util.Scanner;

public class occuranceOfChar {

    public static int first=-1;
    public static int last=-1;

    
    public static void printOccurance(String op, String el, int ind) {
        if(ind==op.length()){
            return;
        }

        if(op.charAt(ind)== el.charAt(0)){
            if (first==-1) {
                first=ind;
                
            }
            else{
                last=ind;
            }
        }
         printOccurance(op, el, ind+1);
        
    }
    
    
    public static void main(String[] args) {
        Scanner bc=new Scanner(System.in);
        System.out.print("ENTER A STRING : ");
        String str=bc.nextLine();
        System.out.print("ENTER THE ELEMENT FOR OCCURANCE: ");
        String el=bc.next();
        printOccurance(str, el, 0);
        System.out.print("FIRST OCCURANCE IS: "+ first);
        System.out.print("\n LAST OCCURANCE IS :"+ last);
    }

}
