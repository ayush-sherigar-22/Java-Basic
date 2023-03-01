import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class cubeofnos {
    
    public static void main(String[] args) {
        Scanner bv=new Scanner(System.in);
        System.out.print("ENTER THE LIMIT OF CUBE : ");
        int n=bv.nextInt();
        for (int i = 1; i <=n; i++) {
            int  cube=i*i*i;
            System.out.print("THE CUBE OF "+i+" IS "+cube+"\n");
            
        }
    }
}
