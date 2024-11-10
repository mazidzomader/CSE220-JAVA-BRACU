public class LAB_02_SOLUTION_06 {
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

    public static void main(String[] args) {
        System.out.println("=========Test Case 1=============");
        Node head1 = LinkedList.createList(new Integer[]{10, 16, -5, 9, 3, 4});
        int[] dist = new int[] {2, 0, 5, 2, 8};
        int returnedValue = LAB_02_SOLUTION_06.sumDist(head1, dist);
        System.out.println("Sum of Nodes: "+returnedValue); // This should print: Sum of Nodes: 4
    }
}
