public class Answer_02 {
    public static void main(String[] args) {
        System.out.println("==============Test Case 1=============");
        System.out.print("Original Compartment Sequence: ");
        Node head = LinkedList.createList(new Integer[]{101, 103, 101, 102, 103, 104, 105, 105});
        LinkedList.printLL(head);
        System.out.print("Changed Compartment Sequence: ");
        LinkedList.printLL(removeDuplicates(head)); // This should print 101 --> 103 --> 102 --> 104 --> 105

        System.out.println("==============Test Case 2=============");
        System.out.print("Original Compartment Sequence: ");
        head = LinkedList.createList(new Integer[]{102, 101, 101, 102, 102, 102, 103, 104, 104});
        LinkedList.printLL(head);
        System.out.print("Changed Compartment Sequence: ");
        LinkedList.printLL(removeDuplicates(head));
    }
    public static Node removeDuplicates(Node head) {
        Node temp = head;
        int idx = 0;
        while (temp != null) {
            Node temp1 = head ;
            if (idx == 0) {
                idx += 1 ;
                temp = temp.next; // Remove duplicate
            }
            else {
                while (temp1 != temp) {
                    if (temp.elem == temp1.elem) {
                        Node x = head ;
                        while (x.next != temp) {
                            x = x.next;
                        }
                        x.next = x.next.next;
                        break;
                    }
                    temp1 = temp1.next;
                }
                temp = temp.next;

            }

        }
        return head;
    }
}
