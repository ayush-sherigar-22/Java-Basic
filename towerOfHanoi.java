 import java.util.Scanner;

public class towerOfHanoi {

    public static void towerOfHanoi1(int n, String src, String helper, String destinantion) {
        if (n==1) {
            System.out.println("TRANSFER DISK "+ n +" FROM "+src+" TO "+destinantion );
            return;
            
        }
        towerOfHanoi1(n-1, src, destinantion, helper);

        System.out.println("TRANSFER DISK "+ n +" FROM "+src+" TO "+destinantion);

        towerOfHanoi1(n-1, helper,src, destinantion);
    }

    public static void main(String[] args) {

        Scanner bc=new Scanner(System.in);
        System.out.println("ENTER NUMBER OF BLOCKS: ");
        int n=bc.nextInt();
        towerOfHanoi1(n, "S", "H", "D");

    }
    
}
