import java.util.Scanner;

import javax.sound.midi.Synthesizer;

public class solidrectangle {
    public static void main(String[] args) {
        System.out.println("ENTER THE NUMBER OF ROWS & COLUMNS :");
        Scanner bc=new Scanner(System.in);
        int n=bc.nextInt();
        int m=bc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
            System.out.print(" * ");
            }
            System.out.print("\n");;
        }
    }
    
}
