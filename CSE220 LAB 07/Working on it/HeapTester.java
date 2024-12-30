import java.util.Arrays;
import java.util.Scanner;

public class HeapTester {
    public static void main(String[] args){
        System.out.println("Enter any number between 1 to 4.\nTo run all tasks just press enter");
        System.out.print("Which Task do you wanna check: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();

        if( input.equals("1") || input.equals("") ) task1();
        // if( input.equals("2") || input.equals("") ) task2();
        // if( input.equals("3") || input.equals("") ) task3();
        // if( input.equals("4") || input.equals("") ) task4();
    }
    public static void task1(){
        MinHeap minHeap = new MinHeap(10);
        minHeap.insert(5);
        minHeap.insert(2);
        minHeap.insert(6);
        minHeap.insert(3);
        minHeap.insert(1);
        minHeap.insert(10);
        minHeap.insert(8);
        minHeap.insert(-1);
        minHeap.insert(0);
        minHeap.insert(7);
        System.out.println(Arrays.toString(minHeap.get_value()));

        Integer[] arr = minHeap.get_value();
        HeapNode root = Heap_Constructor(arr, 1 );
        HeapPrinter.printNode(root);
        
    }
    public static HeapNode Heap_Constructor(Integer[] arr, Integer i){
        if (i>=arr.length || arr[i] == null) {
            return null ;
        }
        HeapNode p = new HeapNode(arr[i]);
        p.left = Heap_Constructor(arr, 2*i);
        p.right = Heap_Constructor(arr, 2*i+1); 
        return p;
    }
        
}
