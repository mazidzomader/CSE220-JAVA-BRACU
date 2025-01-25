import java.util.Scanner;

public class Spring_24_Solution_Tester {
    public static void main(String[] args) {
        System.out.println("Enter any number between 2,3 and 4 to check the answers.\nTo run all tasks just press enter");
        System.out.print("Which Task do you wanna check: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();

        if( input.equals("2") || input.equals("") ) task2();
        if( input.equals("3") || input.equals("") ) task3();
        if( input.equals("4") || input.equals("") ) task4();
        
        
    }
    private static void task2(){
        String[] arr = {"D", "A", "T", "A"};
        Node head = LinkedList.createList(arr);
        LinkedList.printLL(head);
        String st = "SADA";
        int x = Spring_24_Solutions.hash(head, st);
        System.out.println("Output: "+x);;
        assertTest(x, 7, "Question 02");
    }
    private static void task3(){
        BTNode root = new BTNode(26);
        BTNode node1 = new BTNode(10);
        BTNode node2 = new BTNode(3);
        BTNode node3 = new BTNode(4);
        BTNode node4 = new BTNode(6);
        BTNode node5 = new BTNode(3);
        
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.right = node5;
        
        BTPrinter.printNode(root);
        boolean x = Spring_24_Solutions.sumTree(root);
        System.out.println("Output: "+x);;
        assertTest(x, true, "Question 03");
    }
    private static void task4(){
        int[] A = {3, 2, 1, 5, 4};
        int k = 2;
        int x = Spring_24_Solutions.heapSum(A, k);
        System.out.println("Output: "+x);;
        assertTest(x, 9, "Question 04");
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
