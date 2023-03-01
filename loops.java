public class loops {
    public static void main(String[] args) {
        for(int i=0; i<=10; i++)
        {
            System.out.print(i+" ");
        }
        System.out.println("\n");

        int i=0;
        while(i<=10){
            System.out.print(i+" ");
            i+=1;
        }
        System.out.println("\n");
        
        int j=0;
        do{
            System.out.print(j+" ");
            j+=1;
        }while(j<=10);
    }
    
}
