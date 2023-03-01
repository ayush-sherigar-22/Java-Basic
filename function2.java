import java.util.*;

public class function2{
    public static int addNum(int a, int c) {
        int ans=a+c;
        return ans;
    }

    public static int divideNum(int a, int c) {
        int ans=a/c;
        return ans;
    }

    public static int subtractNum(int a, int c) {
        int ans=a-c;
        return ans;
    }

    public static int multiplyNum(int a, int c) {
        int ans=a*c;
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("ENTER TWO NUMBERS: ");
        Scanner bc=new Scanner(System.in);
        int a=bc.nextInt();
        int c=bc.nextInt();
        System.out.println("ANSWER AFTER ADDITON: "+addNum(a,c));
        System.out.println("ANSWER AFTER SUBTRACTION: "+subtractNum(a,c));
        System.out.println("ANSWER AFTER MULTIPLICATION "+multiplyNum(a,c));
        System.out.println("ANSWER AFTER DIVISION: "+divideNum(a,c));

    }        
}
