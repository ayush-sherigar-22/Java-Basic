import java.util.*;
public class sorting {
    
    public static void main(String[] args) {

        System.out.print("ENTER ARRAY SIZE: ");
        Scanner bc=new Scanner(System.in);
        int n=bc.nextInt();
        int array[]= new int[n];
        System.out.print("ENTER ARRAY ELEMENT: ");
        for(int i=0; i<n; i++)
        {
            array[i]=bc.nextInt();

        }
        System.out.print("SORTED ARRAY IS: ");
 

        //BUBBLE SORT 
        
        // for (int i = 0; i < array.length-1; i++) {
        //     for (int j = 0; j <array.length-i-1; j++) {
                
        //         if(array[j]>array[j+1])
        //         {
        //             int temp=array[j];
        //             array[j]=array[j+1];
        //             array[j+1]=temp;
        //         }

        //     }
            
        // }


        // // SELECTION SORT
        // for (int i = 0; i < array.length-1; i++) {
        //     int smallest=i;
        //     for (int j = i+1; j <array.length; j++) {
                
        //         if(array[smallest]>array[j])
        //         {
        //             smallest=j;
        //         }

        //     }
        //     int temp=array[smallest];
        //     array[smallest]=array[i];
        //     array[i]=temp;
            
        // }


        //INSERTION SORT

        for (int i = 1; i < array.length; i++) {
            int current=array[i];
            int j=i-1;
            while (j>=0 && current<array[j]) {

                array[j+1]=array[j];
                j--;
                
            }
            array[j+1]=current;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }

    }
}
