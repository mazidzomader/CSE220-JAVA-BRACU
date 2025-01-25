import java.util.Scanner;

public class Summer_24_Solutions_Tester {
    public static void main(String[] args) {
        System.out.println("Enter any number between 2 and 3 to check the answers.\nTo run all tasks just press enter");
        System.out.print("Which Task do you wanna check: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();

        if( input.equals("2") || input.equals("") ) task2();
        if( input.equals("3") || input.equals("") ) task3();
    }
    public static void task2(){
        System.out.println("========================== Test Case 01 ==========================");
        Node head = new Node("A3");
        head.next = new Node("A9");
        head.next.next = new Node("A4");
        head.next.next.next = new Node("A2");
        head.next.next.next.next = new Node("A7");
        head.next.next.next.next.next = new Node("A8");
        head.next.next.next.next.next.next = new Node("A1");System.out.print("Original: ");
        LinkedList.printLL(head);
        System.out.print("Rearranged: ");
        LinkedList.printLL(Summer_24_Solutions.rearrange_tokens(head, 4));
        System.out.println("========================== Test Case 02 ==========================");
        head = new Node("A9");
        head.next = new Node("A3");
        head.next.next = new Node("A4");
        head.next.next.next = new Node("A8");
        head.next.next.next.next = new Node("A6");
        head.next.next.next.next.next = new Node("A5");
        System.out.print("Original: ");
        LinkedList.printLL(head);
        System.out.print("Rearranged: ");
        LinkedList.printLL(Summer_24_Solutions.rearrange_tokens(head, 5));
    }
    public static void task3(){System.out.println("=======================   TREE   =======================");
        BTNode root = treeConstruction(new String[] {null, "C", "S", "R", "T", "E", "M", "P", null, null, null, null, null, null, "D", null}, 1);
        BTPrinter.printNode(root);
        System.out.println("=======================   Test Case 01   =======================");
        String key = "CSE";
        boolean x = Summer_24_Solutions.is_Valid(root, key);
        System.out.println("Key: CSE => Validity: " + x);
        assertTest(x, true, "Question 03 -- 01");
        System.out.println("=======================   Test Case 02   =======================");
        key = "CRA";
        x = Summer_24_Solutions.is_Valid(root, key);
        System.out.println("Key: CRA => Validity: " + x);
        assertTest(x, false, "Question 03 -- 02");
        System.out.println("=======================   Test Case 03   =======================");
        key = "CRP";
        x = Summer_24_Solutions.is_Valid(root, key);
        System.out.println("Key: CRp => Validity: " + x);
        assertTest(x, false, "Question 03 -- 02");
    }
    private static BTNode treeConstruction( Object[] arr, int i ){
        if (i>=arr.length || arr[i]==null)
        return null;
        BTNode p = new BTNode(arr[i]);
        p.left = treeConstruction(arr, 2*i);
        p.right = treeConstruction(arr, 2*i+1);
        return p;
    }
    public static void assertTest(boolean actual, boolean expected, String str) {
        if (actual == expected) {
            successPrint(str);
        } else {
            failedPrint(str);
        }
    }
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
    
    static final String green = "\u001B[32m", red = "\u001B[31m", white = "\u001B[37m", cyan = "\033[0;96m";
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
}
