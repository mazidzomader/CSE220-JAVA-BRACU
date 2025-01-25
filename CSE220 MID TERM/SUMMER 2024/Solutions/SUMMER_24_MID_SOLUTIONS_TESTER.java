import java.util.Scanner;

public class SUMMER_24_MID_SOLUTIONS_TESTER {
    public static void main(String[] args){
        System.out.println("Enter any number between 1, 2 and 3 to check the answers.\nTo run all tasks just press enter");
        System.out.print("Which Task do you wanna check: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();

        if( input.equals("1") || input.equals("") ) task1();
        if( input.equals("2") || input.equals("") ) task2();
        if( input.equals("3") || input.equals("") ) task3();
    }
    private static void task1(){
        title("ANSWER TO THE QUESTION NO - 01");
        testcase("============== Test Case 1 =============");
        Integer[][] matrix1 = {{1, 2, 3}, {5, 6, 7}, {9, 10, 11}};
        System.out.println("\n"+blue + bold + "    "+ "Before Modification" + "    "+endFormat+"\n");
        Arr.print2D(matrix1);
        Integer[][] x = SUMMER_24_MID_SOLUTIONS.rotate(matrix1);
        System.out.println("\n"+blue + bold + "    "+ "After Modification" + "    "+endFormat+"\n");
        Arr.print2D(x);
        testcase("============== Test Case 2 =============");
        Integer[][] matrix2 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        System.out.println("\n"+blue + bold + "    "+ "Before Modification" + "    "+endFormat+"\n");
        Arr.print2D(matrix2);
        x = SUMMER_24_MID_SOLUTIONS.rotate(matrix2);
        System.out.println("\n"+blue + bold + "    "+ "After Modification" + "    "+endFormat+"\n");
        Arr.print2D(x);
    }
    private static void task2(){
        title("ANSWER TO THE QUESTION NO - 02");
        testcase("============== Test Case 1 =============");
        System.out.print("Original Compartment Sequence: ");
        Node head1 = LinkedList.createList(new Integer[]{101, 103, 101, 102, 103, 104, 105, 105});
        LinkedList.printLL(head1);
        System.out.print("Changed Compartment Sequence: ");
        LinkedList.printLL(SUMMER_24_MID_SOLUTIONS.remove_Duplicates(head1)); // Expected: 101 --> 103 --> 102 --> 104 --> 105

        testcase("============== Test Case 2 =============");
        System.out.print("Original Compartment Sequence: ");
        Node head2 = LinkedList.createList(new Integer[]{102, 101, 101, 102, 102, 102, 103, 104, 104});
        LinkedList.printLL(head2);
        System.out.print("Changed Compartment Sequence: ");
        LinkedList.printLL(SUMMER_24_MID_SOLUTIONS.remove_Duplicates(head2)); // Expected: 102 --> 101 --> 103 --> 104
    }
    static void task3(){
        title("ANSWER TO THE QUESTION NO - 03");
        testcase("============== Test Case 1 =============");
        Stack st1 = new Stack();
        st1.push(1);
        st1.push(2);
        st1.push(3);
        st1.push(4);
        st1.push(5);
        st1.push(6);
        st1.push(7);
        st1.push(8);

        System.out.println("Original Stack: ");
        printStack(st1);
        System.out.println("------");
        System.out.println("Modified Stack: ");
        Stack modifiedSt1 = SUMMER_24_MID_SOLUTIONS.do_adjacent_swap(st1);
        printStack(modifiedSt1);
        System.out.println("------");

        testcase("============== Test Case 2 =============");
        Stack st2 = new Stack();
        st2.push(1);
        st2.push(2);
        st2.push(3);
        st2.push(4);
        st2.push(5);
        st2.push(6);
        st2.push(7);

        System.out.println("Original Stack: ");
        printStack(st2);
        System.out.println("------");
        System.out.println("Modified Stack: ");
        Stack modifiedSt2 = SUMMER_24_MID_SOLUTIONS.do_adjacent_swap(st2);
        printStack(modifiedSt2);
        System.out.println("------");
    }
    public static void assertTest(boolean actual, boolean expected, String str) {
        if (actual == expected) {
            successPrint(str);
        } else {
            failedPrint(str);
        }
    }
    public static void printStack(Stack stack) {
        if (stack.isEmpty()) {
            return;
        }
        int elem = stack.pop();
        System.out.println("| " + elem + " |");
        printStack(stack);
        stack.push(elem);
    }
    static final String blue = "\u001B[34m" ;
    public static void assertTest(double actual, double expected, String str) {
        if (actual == expected) {
            successPrint(str);
        } else {
            failedPrint(str);
        }
    }
    public static void assertTest(int actual, int expected, String mazid) {
        if (actual == expected) {
            successPrint(mazid);
        } else {
            failedPrint(mazid);
        }
    }
    public static void assertTest(String actual, String expected, String str) {
        if (actual.equals(expected)) {
            successPrint(str);
        } else {
            failedPrint(str);
        }
    }
    private static void taskPrint(String task){
        System.out.println(taskFormat+task+endFormat);
    }
    static final String green = "\u001B[32m", red = "\u001B[31m", white = "\u001B[37m", cyan = "\033[0;96m", purple = "\u001B[35m";
    static final String bold="\u001B[1m", underline = "\u001B[4m", normal = "\033[0;0m";
    
    static String taskFormat = cyan;
    static String sucsFormat = "\n"+green+bold+underline;
    static String failFormat = "\n"+red+bold+underline;
    static String endFormat = normal+white; 
    private static void successPrint(String task){
        System.out.println(sucsFormat+"    "+task+" Success!! Output Matched!!!     "+endFormat);
}

    private static void failedPrint(String task){
        System.out.println(failFormat+"    "+task+" Failed!! Output didn't Match!!!   "+endFormat);
    }
    private static void donePrint(String task){
        System.out.println(sucsFormat+"    "+task+" Output Printing Successful!!!     "+endFormat);
}
    static String done = purple + bold + underline+ "\n";
    private static void title(String task){
        System.out.println(done + "    "+ task + "    "+endFormat);
    }
    static String done1 = cyan + bold + underline+ "\n";
    private static void testcase(String t){
        System.out.println(done1 + "    "+ t + "    "+endFormat);
    }
}
