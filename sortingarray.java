import java.util.*;
public class sortingarray {
    
    public static void main(String[] args) {

        System.out.print("ENTER ARRAY SIZE: ");
        Scanner bc= new Scanner(System.in);
        int n=bc.nextInt();
        System.out.print("ENTER A ARRAY: ");
        int array[]=new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i]=bc.nextInt();
        }
    
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i]>array[j])
                {
                    temp=array[j];
                    array[j]=array[i];
                    array[i]=temp;
                }
                else{
                    continue;
                }
            }
        }
        System.out.print("SORTED ARRAY IS: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" "+array[i]);
        }
    }
}
