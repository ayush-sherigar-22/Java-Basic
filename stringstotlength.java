import java.util.*;

public class stringstotlength{

    public static void main(String[] args) {
        
        Scanner bc=new Scanner(System.in);

        System.out.println("ENTER SIZE OF ARRAY:");
        int b=bc.nextInt();

        String array[]= new String[b];
        
        int totlen=0;
        System.out.println("ENTER ELEMENT:");

        for (int i = 0; i <b; i++) {

            array[i]=bc.nextLine();

            totlen+=array[i].length();

            
        }

        System.out.println("ELEMENTS AND SIZE IS :");

        for (int i = 1; i < array.length; i++) {
            
            System.out.println(array[i]);
        }
        System.out.println(totlen);
    }
}
    
