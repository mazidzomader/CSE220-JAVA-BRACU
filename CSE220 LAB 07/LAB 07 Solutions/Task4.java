class Task4 {
    public static Integer[] top_k_largest(Integer[] arr, Integer k){
        Integer[] rIntegers = new Integer[k];
        MaxHeap max = new MaxHeap(arr.length);
        for (int i = 0; i < arr.length; i++){
            max.insert(arr[i]);
        }
        System.out.println("The Given Heap:");
        HeapPrinter.printNode(HeapTester.Heap_Constructor(max.get_value(),1));
        for (int i = 0; i<k; i++){
            rIntegers[i] = max.getMax();
            max.extractMax();
        }
        return rIntegers;
    }
}
