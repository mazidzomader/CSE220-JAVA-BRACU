public class Task3 {
    public static MinHeap motherboard_machine(Integer[] arr, Integer num){
    MinHeap min_heap = new MinHeap(num);
    for (int i= 0;i<num;i++){
        min_heap.insert(0);
    }
    for (int i = 0;i<arr.length;i++){
        Integer temp = min_heap.getMin();
        min_heap.extractMin();
        min_heap.insert(temp+arr[i]);
    }
    return min_heap;
}
    
}

