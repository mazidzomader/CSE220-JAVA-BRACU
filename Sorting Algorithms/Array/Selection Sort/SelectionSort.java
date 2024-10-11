import java.util.Arrays ;
class SelectionSort {
    public static void main(String[] args) {
        int[] a = {2,3,1,5,7,6,4};
        System.out.println(Arrays.toString(selectionsort(a))) ;
    }
    static int[] selectionsort(int[] arr){
        for (int i = 0; i< arr.length-1; i++){
            int min_idx = i ;
            for (int ii = i+1 ; ii< arr.length; ii++ ){
                if (arr[ii] < arr[min_idx]) {
                    min_idx = ii;
                }
            }
            int temp =arr[i] ;
            arr[i] = arr[min_idx];
            arr[min_idx] = temp ;
        }
        return arr;
    }
}
