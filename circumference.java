import java.util.*;

public class circumference {
    public static double  circumferenceCircle(int n) {
        double ans=2*3.14*n;
        return ans;
    }

    public static double  areaCircle(int n) {
        double ans=3.14*n*n;
        return ans;
    }

    public static void main(String[] args) {
        System.out.print("ENTER THE RADIUS OF CIRCLE: ");
        Scanner bc=new Scanner(System.in);
        int r=bc.nextInt();
        System.out.println("THE CIRCUMFERENCE IS: "+circumferenceCircle(r));
        System.out.print("THE AREA IS: "+areaCircle(r));
    }
    
}
