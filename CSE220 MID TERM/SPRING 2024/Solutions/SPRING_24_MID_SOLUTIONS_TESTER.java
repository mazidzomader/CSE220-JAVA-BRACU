import java.util.Arrays;
import java.util.Scanner;

public class SPRING_24_MID_SOLUTIONS_TESTER {
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
        int[][] matrix = {
            {1, 3, 1},
            {6, 4, 2},
            {5, 1, 7},
            {9, 3, 3},
            {8, 5, 4}
        };

        Integer[] returnedArray = SPRING_24_MID_SOLUTIONS.decryptMatrix(matrix);
        Arr.print(returnedArray);
        donePrint("Question 01");
    }
    private static void task2(){
        title("ANSWER TO THE QUESTION NO - 02");
        System.out.println("==============Test Case 1=============");
        Node head = LinkedList.createList(new Integer[]{1, 2, 3, 4, 5});
        LinkedList.printLL(head);
        boolean returnedValue = SPRING_24_MID_SOLUTIONS.isSumPossible(head, 7);
        System.out.println(returnedValue);
        assertTest(returnedValue, true,"Question 02 -- 01");
        
        System.out.println("==============Test Case 2=============");
        head = LinkedList.createList(new Integer[]{1, 2, 4, 5, 6});
        LinkedList.printLL(head);
        returnedValue = SPRING_24_MID_SOLUTIONS.isSumPossible(head, 4);
        System.out.println(returnedValue);
        assertTest(returnedValue, false,"Question 02 -- 02");
        
        System.out.println("==============Test Case 3=============");
        head = LinkedList.createList(new Integer[]{5});
        LinkedList.printLL(head);
        returnedValue = SPRING_24_MID_SOLUTIONS.isSumPossible(head, 5);
        System.out.println(returnedValue);
        assertTest(returnedValue, false,"Question 02 -- 03");
    }
    private static void task3(){
        title("ANSWER TO THE QUESTION NO - 03");
        Stack st = new Stack();
        st.push("F_18");
        st.push("F_9");
        st.push("M_7");
        st.push("M_1");
        st.push("M_19");
        st.push("M_3");
        st.push("F_5");
        st.push("F_4");
        st.push("F_20");
        st.push("M_10");
        SPRING_24_MID_SOLUTIONS.dancePair(st);
        donePrint("Question 03");
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
}
