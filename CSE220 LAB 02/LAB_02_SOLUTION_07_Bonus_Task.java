class BonusTask {
    public static Node idGenerator(Node head1, Node head2, Node head3) {
        // To Do
        Integer a = (Integer) head2.elem+ (Integer) head3.elem;
        Node tail, head;
        if (a>=10) {
            head = new Node(a%10, null);
            tail = head;
        }
        else {
            head = new Node(a, null);
            tail = head;
        }
        head2 = head2.next;
        head3 = head3.next;
        while (head2 != null) {
            a = (Integer)head2.elem +(Integer) head3.elem;
            if (a >= 10) {
                tail.next = new Node(a % 10, null);
                tail = tail.next;
            } else {
                tail.next = new Node(a, null);
                tail = tail.next;
            }
            head2 = head2.next;
            head3 = head3.next;
        }
        Node return_head = reverse(head1) ;
        while (head1.next != null) {
            head1 = head1.next;
        }
        head1.next = head ; ;
        return return_head; // Remove this line
    }
    public static Node reverse(Node head){
        Node current = head;
        Node previous = null;
        while (current != null){
            Node temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }
        return previous;
    }

    public static void main(String[] args) {
        System.out.println("=========Test Case 1=============");
        Node head1 = LinkedList.createList(new Integer[]{0, 3, 2, 2});
        Node head2 = LinkedList.createList(new Integer[]{5, 2, 2, 1});
        Node head3 = LinkedList.createList(new Integer[]{4, 3, 2, 1});

        System.out.println("Linked List 1");
        LinkedList.printLL(head1); // This should print 0 -> 3 -> 2 -> 2

        System.out.println("Linked List 2");
        LinkedList.printLL(head2); // This should print 5 -> 2 -> 2 -> 1

        System.out.println("Linked List 3");
        LinkedList.printLL(head3); // This should print 4 -> 3 -> 2 -> 1

        Node result = BonusTask.idGenerator(head1, head2, head3);

        System.out.println("New ID");
        LinkedList.printLL(result); // This should print 2 -> 2 -> 3 -> 0 -> 9 -> 5 -> 4 -> 2

        System.out.println("=========Test Case 2=============");
        Node head4 = LinkedList.createList(new Integer[]{0, 3, 9, 1});
        Node head5 = LinkedList.createList(new Integer[]{3, 6, 5, 7});
        Node head6 = LinkedList.createList(new Integer[]{2, 4, 3, 8});

        System.out.println("Linked List 4");
        LinkedList.printLL(head4); // This should print 0 -> 3 -> 9 -> 1

        System.out.println("Linked List 5");
        LinkedList.printLL(head5); // This should print 3 -> 6 -> 5 -> 7

        System.out.println("Linked List 6");
        LinkedList.printLL(head3); // This should print 2 -> 4 -> 3 -> 8

        Node result2 = BonusTask.idGenerator(head4, head5, head6);

        System.out.println("New ID");
        LinkedList.printLL(result2); // This should print 1 -> 9 -> 3 -> 0 -> 5 -> 0 -> 8 -> 5
    }
}
