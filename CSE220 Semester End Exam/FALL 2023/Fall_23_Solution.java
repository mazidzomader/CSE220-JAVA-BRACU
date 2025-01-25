public class Fall_23_Solution{
    public static int sumDist(Node head, int[] arr) {
        // To Do
         // Remove this line.
        Integer sum = 0;
        for (int index = 0; index < arr.length; index++) {
            int count = 0;
            Node temp = head;
            while (count != arr[index]) {
                if (temp == null) {
                    break;
                } else {
                    count++;
                    temp = temp.next;
                }
            }
            if (temp != null) {
                sum +=(Integer) temp.elem;
            }
        }
        return sum;
    }
    public static void remove(Hashtable cls,String key) {
        boolean flag = true;
        for (int i = 0; i < cls.ht.length; i++) {
            NodePair head = cls.ht[i];
            NodePair prev = head;
            while (head != null) {
                if (head.key.equals(key)) {
                    if (head == cls.ht[i]) {
                        cls.ht[i] = head.next;
                    } else {
                        prev.next = head.next;
                    }
                    flag = false;
                    break;
                }
                prev = head;
                head = head.next;
            }
            if (!flag) {
                break;
            }
        }
    }
    public static BTNode swapChild( BTNode root, int lvl, int M ){
        //TO DO
        if (root == null || lvl == M) {
            return null;
        }
        BTNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        swapChild(root.left, lvl+1, M);
        swapChild(root.right, lvl+1, M);
        return root;
    }
}