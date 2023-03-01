public class strictlysortedarray {

    public static boolean strictlysorted(int arr[], int ind) {
        if(ind==(arr.length-1)){
            return true;
        }
        
        if (!strictlysorted(arr,ind+1)) {
            return false;
            
        }
        return arr[ind]< arr[ind+1];

    }
    public static void main(String[] args) {
        
        int arr[]={1,2,3,4,5,9,9};
        
        if (strictlysorted(arr, 0)) {
            System.out.print("ARRAY IS STRICTLY INCREASING.");
            
        }
        else{
            System.out.print("ARRAY IS NOT STRICTLY INCREASING.");
        }
    }
}
