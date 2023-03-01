import java.util.*;

public class array {
    public static void main(String[]args) {
        
        System.out.print("ENTER ARRAY SIZE: ");
        Scanner bn=new Scanner(System.in);
        int n=bn.nextInt();
        int array[]= new int[n];
        System.out.print("ENTER ARRAY ELEMENT: ");
        for(int i=0; i<n; i++)
        {
            array[i]=bn.nextInt();

        }
        System.out.print("ENTERED ARRAY IS: ");
        for(int i=0; i<n; i++)
        {
            System.out.print(array[i]+" "); 

        }
        int marks[]={80, 90, 89};
        System.out.println("\n"+marks[1]);

        
    }
    
}
