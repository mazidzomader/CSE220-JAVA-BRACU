// Task04: Word Decoder
public class LAB_02_SOLUTION_04 {

    public static Node wordDecoder( Node head ){
        
        //You're supposed to create a Dummy headed Singly Linked List in this method

        //TODO

        //remove the followin line when you're ready to return
        int length = 0 ;
        Node temp = head;
        while (temp != null){
            length++;
            temp = temp.next;
        }
        int a = 13 % length;
        int index = 0 ;
        temp = head ;
        int count = 0 ;
        Node tail = null ;
        while (temp != null){
            if (index % a == 0) {
                if (index == 0) {
                }
                else {
                    if (count == 0){
                        head = new Node(temp.elem, null) ;
                        tail = head ;
                        count ++ ;
                    }
                    else {
                        tail.next = new Node(temp.elem, null) ;
                        tail = tail.next;
                    }
                }
            }
            index += 1 ;
            temp = temp.next; ;
        }
        Node dummy = new Node(null, null) ;
        dummy.next = reverse(head) ;
        return dummy ;
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

    //NOTE: if you find any issue with the driver code please inform AIB
    //DO NOT TOUCH THE DRIVER CODE BELOW
    public static void main(String[] args){
        System.out.println("==============Test Case 1=============");
        Node head = LinkedList.createList(new Character[]{'B', 'M', 'D', 'T', 'N', 'O', 'A', 'P', 'S', 'C'});
        System.out.print("Encoded Word: ");
        LinkedList.printLL(head);
        System.out.println("\nExpected output: null -> C -> A -> T");
        Node result = wordDecoder(head);
        System.out.println( "Your output: ");
        LinkedList.printLL(result); //This should print null -> C -> A -> T
        System.out.println();
        System.out.println("==============Test Case 2=============");
        head = LinkedList.createList(new Character[]{'Z', 'O', 'T', 'N', 'X'});
        System.out.print("Encoded Word: ");
        LinkedList.printLL(head);
        System.out.println("\nExpected output: null -> N");
        result = wordDecoder(head);
        System.out.println( "Your output: ");
        LinkedList.printLL(result); //This should print null -> N
        System.out.println();
    }
}
