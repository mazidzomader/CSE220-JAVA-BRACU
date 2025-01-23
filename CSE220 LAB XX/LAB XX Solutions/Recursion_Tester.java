//THIS IS THE DRIVER CODE
//DO NOT MAKE ANY CHANGES HERE
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Recursion_Tester {
    public static void main(String[] args) {
        System.out.println("Enter any number between 1 to 6.\nTo run all tasks just press enter");
        System.out.print("Which Task do you wanna check: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();

        if( input.equals("1") || input.equals("") ) task1();
        if( input.equals("2") || input.equals("") ) task2();
        if( input.equals("3") || input.equals("") ) task3();
        if( input.equals("4") || input.equals("") ) task4();
        if( input.equals("5") || input.equals("") ) task5();
        if( input.equals("6") || input.equals("") ) task6();
    }
        public static void task1(){
        System.out.println("=======================  Testing Task 01  =======================\n");
        System.out.println("=======================        (a)        =======================");
        int[] arr = {1,2,-2,3,4,5,6,2};
        int result1 = Task_01.even_sum(arr);
        System.out.println("Your Output: "+result1);
        assertTest(result1, 14,"Task 01 (a)");
        System.out.println();
        System.out.println("=======================        (b)        =======================");
        Integer[] arr1 = {2,1,2,4,5,7,0};
        Node root = LinkedList.createList(arr1);
        LinkedList.printLL(root);
        int result2 = Task_01.multiply_odd_positive(root);
        System.out.println("Your Output: "+result2);
        assertTest(result2, 35,"Task 01 (b)");
        System.out.println();
        System.out.println("=======================        (c)        =======================");
        int result3 = Task_01.total_combinations(100, 2);
        System.out.println("Your Output: "+result3);
        assertTest(result3, 4950, "Task 01 (c)");
        System.out.println();
        System.out.println("=======================        (d)        =======================");
        int result4 = Task_01.total_digits(11233);
        System.out.println("Your Output: "+result4);
        assertTest(result4, 5, "Task 01 (d)");
        System.out.println();
        System.out.println("=======================        (e)        =======================");
        boolean result5 = Task_01.primeChecker(23);
        System.out.println("Your Output: "+result5);
        assertTest(result5, true, "Task 01 (e) -- 01");
        System.out.println();
        result5 = Task_01.primeChecker(15);
        System.out.println("Your Output: "+result5);
        assertTest(result5, false, "Task 01 (e) -- 02");
        System.out.println();
        System.out.println("=======================        (f)        =======================");
        Integer[] arr2 = {10,20,30,40};
        Node root1 = LinkedList.createList(arr2);
        LinkedList.printLL(root1);
        Task_01.print_list(root1);
        donePrint("Task 01 (f)");
        System.out.println();
    }
    public static void task2(){
        System.out.println("=======================  Testing Task 02  =======================\n");
        System.out.println("=======================        (a)        =======================");
        String r1 = Task_02.decimalToBinary(174);
        System.out.println("Your Output: "+r1);
        assertTest(r1, "10101110", "Task 02 (a) -- 01");
        System.out.println();
        r1 = Task_02.decimalToBinary(13);
        System.out.println("Your Output: "+r1);
        assertTest(r1, "1101", "Task 02 (a) -- 02");
        System.out.println();
        System.out.println("=======================        (b)        =======================");
        r1 = Task_02.decimalToHexadecimal(7562);
        System.out.println("Your Output: "+r1);
        assertTest(r1, "1D8A", "Task 02 (b) -- 01");
        System.out.println();
        r1 = Task_02.decimalToHexadecimal(35631);
        System.out.println("Your Output: "+r1);
        assertTest(r1, "8B2F", "Task 02 (b) -- 02");
        System.out.println();
        System.out.println("=======================        (c)        =======================");
        String[] arr = {"Abdullah", "Al", "Mazid", "Zomader"};
        Node head = LinkedList.createList(arr);
        LinkedList.printLL(head);
        Task_02.printVowelThenConsonant(head);
        donePrint("Task 02 (c)");
        System.out.println();
        System.out.println("=======================        (d)        =======================");
        double r2 = Task_02.alternateHarmonicSum(3);
        System.out.println("Your Output: "+r2);
        assertTest(r2, 0.8333333333333333, "Task 02 (d) -- 01");
        System.out.println();
        r2 = Task_02.alternateHarmonicSum(4);
        System.out.println("Your Output: "+r2);
        assertTest(r2, 0.5833333333333333, "Task 02 (d) -- 02");
        System.out.println();
    }
    public static void task3(){
        System.out.println("=======================  Testing Task 03  =======================\n");
        System.out.println("=======================        (a)        =======================");
        int r1 = Task_03.houseOfCards(0);
        System.out.println("Your Output: "+r1);
        assertTest(r1, 0 , "Task 03 (a) -- 1");
        r1 = Task_03.houseOfCards(1);
        System.out.println("Your Output: "+r1);
        assertTest(r1, 8 , "Task 03 (a) -- 2");
        r1 = Task_03.houseOfCards(2);
        System.out.println("Your Output: "+r1);
        assertTest(r1, 13 , "Task 03 (a) -- 3");
        r1 = Task_03.houseOfCards(3);
        System.out.println("Your Output: "+r1);
        assertTest(r1, 18 , "Task 03 (a) -- 4");
        System.out.println("=======================        (b)        =======================");
        r1 = Task_03.gameOfCards(21);
        System.out.println("Your Output: "+r1);
        assertTest(r1, 7 , "Task 03 (b) -- 1");
        r1 = Task_03.gameOfCards(64);
        System.out.println("Your Output: "+r1);
        assertTest(r1, 6 , "Task 03 (b) -- 2");
        r1 = Task_03.gameOfCards(42);
        System.out.println("Your Output: "+r1);
        assertTest(r1, 8 , "Task 03 (b) -- 3");
    }
    public static void task4(){
        System.out.println("=======================  Testing Task 03  =======================\n");
        System.out.println("=======================        (a)        =======================");
        Task_04.printPattern(15);
        System.out.println();
        Task_04.printPattern(10);
        donePrint("Task 04 (a)");
        System.out.println();
        System.out.println("=======================        (b)        =======================");
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(5, 7, 14, 20, 24));
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(10, 12, 25));
        System.out.println(Task_04.merge(arr1, arr2));
        donePrint("Task 04 (b) -- 01");
        arr1 = new ArrayList<>(Arrays.asList(11, 20, 24, 28));
        arr2 = new ArrayList<>(Arrays.asList(10, 12));
        System.out.println(Task_04.merge(arr1, arr2));donePrint("Task 04 (b) -- 02");
    }
    public static void task5(){
        List<Object> given = List.of(1, List.of(2, List.of(3, List.of(4), 5), 6), List.of(7, 8), 
                                           List.of(9, List.of(List.of(10, 11), 12), 13), 14, 
                                           List.of(15, List.of(16, List.of(17))));
        System.out.println(given);
        System.out.println(Task_05.flattenList(given, new ArrayList<>()));
        donePrint("Task 05");
    }
    public static void task6(){
        int n = 3;
        System.out.println("The number of ways to climb " + n + " steps is: " + Task_06_Bonus.countWays(n));
        n = 5;
        System.out.println("The number of ways to climb " + n + " steps is: " + Task_06_Bonus.countWays(n));
        donePrint("Task 06 (Bonus)");
        System.out.println("======================= More Elaboralely =======================");
        n = 3;
        List<List<Integer>> ways = Task_06_Bonus.countWaysWithSteps(n);
        System.out.println("Input: " + n);
        System.out.println("Output: " + ways.size());
        System.out.println("Explanation: ");
        for (List<Integer> path : ways) {
            System.out.println(String.join(" -> ", path.stream().map(String::valueOf).toArray(String[]::new)));
        }
        System.out.println("Therefore, you can climb the remaining " + n + " steps using " + ways.size() + " possible ways.\n");

        n = 5;
        ways = Task_06_Bonus.countWaysWithSteps(n);
        System.out.println("Input: " + n);
        System.out.println("Output: " + ways.size());
        System.out.println("Explanation: ");
        for (List<Integer> path : ways) {
            System.out.println(String.join(" -> ", path.stream().map(String::valueOf).toArray(String[]::new)));
        }
        System.out.println("Therefore, you can climb the remaining " + n + " steps using " + ways.size() + " possible ways.");
        donePrint("Task 06 (Bonus) Elaborate Version");
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
    private static void donePrint(String task){
        System.out.println(sucsFormat+"    "+task+" Success!! Output Printed!!!     "+endFormat);
}
}
