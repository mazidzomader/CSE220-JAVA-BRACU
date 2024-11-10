// Task03: Assemble Conga Line
public class LAB_02_SOLUTION_03 {

    public static Boolean assembleCongaLine(Node head){
        
        //You're not supposed to create any new Linked List for this task

        //TODO
        
        //When you're ready to return the boolean remove the following line
        Node temp = head;
        Integer value = (Integer) temp.next.elem;
        while (temp != null) {
            if ((Integer)temp.elem < value) {
                temp = temp.next;
                if (temp == null) {
                    return true;
                }
                else {
                    if (temp.next == null) {
                        return true;
                    }
                    else {
                        value = (Integer) temp.next.elem;
                    }
                }
            }
            else {
                return false;
            }
        }
        return true;
    }

    //NOTE: if you find any issue with the driver code please inform AIB
    //DO NOT TOUCH THE DRIVER CODE BELOW
    public static void main(String[] args){

        System.out.println("==============Test Case 1=============");
        Node congaLine = LinkedList.createList(new Integer[]{10,15,34,41,56,72});
        System.out.print("Original Conga Line: ");
        LinkedList.printLL(congaLine);
        System.out.println("Expected output: true");
        System.out.println( "Your output: "+assembleCongaLine(congaLine) ); //This should print True
        System.out.println();
        System.out.println("==============Test Case 2=============");
        congaLine = LinkedList.createList(new Integer[]{10,15,44,41,56,72});
        System.out.print("Original Conga Line: ");
        LinkedList.printLL(congaLine);
        System.out.println("Expected output: false");
        System.out.println( "Your output: "+assembleCongaLine(congaLine) ); //This should print False
        System.out.println();
    }
}
