public class Spring_24_Solutions {
    // Question 02
    public static int hash(Node head, String st){
        Node temp = head;
        int sum = 0;
        int x = 0;
        while (temp != null) {
            String y = (String)temp.elem;
            if (checker(st, y)){
                for (int i = 0 ; i < st.length(); i++){
                    if (String.valueOf(st.charAt(i)).equals(y)){
                        x = i ;
                    }
                }
                sum += x;
            }
            else {
                sum -= 1 ;
            }
            temp = temp.next;
        }
        return sum % 10;
    }
    private static boolean checker(String str, String x) {
        for (int i = 0; i < str.length(); i++){
            if (String.valueOf(str.charAt(i)).equals(x)){
                return true;
            }
        }
        return false;
    }
    // Question 03
    public static boolean sumTree(BTNode root){
        Integer x = sumtree(root.left,0);
        Integer y = sumtree(root.right,0);
        return x+y == (Integer) root.elem;
    }
    private static int sumtree(BTNode root, int sum ){
        if (root == null){
            return 0 ;
        }
        if (root.left == null  && root.right == null){
            return (Integer) root.elem;
        }
        int x = sumtree(root.left, sum);
        int y = sumtree(root.right, sum);
        sum += x + y + (int) root.elem;
        return sum ;
    }

    // Question 04
    public static int heapSum(int[] A, int k){
        MinHeap minheap = new MinHeap(A.length);
        for (int i = 0; i < A.length; i++){
            minheap.insert(A[i]);
        }
        Integer[] sorted = minheap.sort();
        for (int i = 0; i < k; i++){
            sorted = modifier(A);
        }
        int sum = 0;
        for (int i = 0; i < sorted.length; i++){
            sum += sorted[i];
        }
        return sum;
    }
    private static Integer[] modifier(int[] A) {
        Integer[] x = new Integer[A.length - 1];
        int idx = 0;
        for (int index = 1; index < A.length - 1; index++) {
            x[idx] = A[index];
            idx += 1;
        }
        int temp = Math.abs(A[0] - A[A.length - 1]);
        x[idx] = temp;
        return x;
    }
}
