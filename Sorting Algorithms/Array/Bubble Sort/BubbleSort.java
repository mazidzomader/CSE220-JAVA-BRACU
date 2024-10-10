import java.util.Arrays ;
public class BubbleSort{
    public static int[] bubblesort(int[] arr){
        for (int i = 0 ; i< arr.length-1; i++){
            for (int ii = 0; ii<arr.length-1-i; ii++){
                if (arr[ii]> arr[ii+1]){
                    int temp = arr[ii];
                    arr[ii]= arr[ii+1];
                    arr[ii+1] = temp ;
                }
            }
        }
        return arr ;
    }
    public static void main(String[] args){
        int[] a = {2,3,1,5,7,6,4} ;
        System.out.println(Arrays.toString(bubblesort(a)));
    }
}
