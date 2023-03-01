import java.util.*;
public class stringbuilder1 {

    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("hello");

        sb.append("o");
        System.out.println(sb);
        
        sb.setCharAt(0, 'c');
        System.out.println(sb);

        sb.insert(0, "h");
        System.out.println(sb);

        sb.delete(0, 1);
        System.out.println(sb);
    }
    
}
