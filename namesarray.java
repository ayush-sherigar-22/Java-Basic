import java.util.Scanner;

public class namesarray {

    public static void main(String[] args) {
        System.out.print("ENTER THE SIZE OF ARRAY TO STORE NAMES: ");
        Scanner bc=new Scanner(System.in);
        int size=bc.nextInt();
        String name[]= new String[size];
        for(int i=0; i<size; i++){
            name[i]=bc.next();
        }
        System.out.println("ENTERED NAMES ARE: ");
        for(int i=0; i<name.length; i++){
            System.out.println(name[i]);        }

    }
    
}
