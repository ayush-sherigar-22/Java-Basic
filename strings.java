import java.util.*;

public class strings {
    public static void main(String[] args) {
        
        String name= "Ayush";
        String surname= "Sherigar";
        String fullname= name + " " + surname;
        System.out.println(name);
        System.out.println(surname);
        System.out.println(fullname);
        System.out.println(fullname.length());

        Scanner bc= new Scanner(System.in);
        System.out.println(" Enter a new string ");
        String new1 =bc.nextLine();
        System.out.println("Entered string is:"+ new1);

        for (int i = 0; i < new1.length(); i++) {
            System.out.println(new1.charAt(i));
        }

        if(name.compareTo(new1)==0)
        {
            System.out.println("Strings are equal:");

        }
        else{System.out.println("String are not equal:");}
        

        if(name==new1)
        {
            System.out.println("Strings are equal:");

        }
        else{System.out.println("String are not equal:");}
        
        String name1= fullname.substring(0,5);
        String surname1= fullname.substring(6,fullname.length());
        System.out.println(name1+"\n"+ surname1);


      

        String abc="432";
        int c=Integer.parseInt(abc);
        System.out.println(c);
        
      String str = Integer.toString(c);
      System.out.println(str);
      

 
    }    
}
