import java.util.Arrays ;
public class InsertionSort {
    static int[] sort(int arr[])
    {
        for (int i = 1; i < arr.length; ++i) 
        {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) 
            {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = temp;
        }
        return arr ;
    }
    // Driver code
    public static void main(String args[])
    {
        int arr[] = { 2,3,1,5,7,6,4 };
        System.out.println(Arrays.toString(sort(arr)));
    }
}
