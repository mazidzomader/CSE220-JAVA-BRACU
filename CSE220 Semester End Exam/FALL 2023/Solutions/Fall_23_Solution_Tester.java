//THIS IS THE DRIVER CODE
//DO NOT MAKE ANY CHANGES HERE
import java.util.Objects;
import java.util.Scanner;

public class Fall_23_Solution_Tester {
    public static void main(String[] args) {
        System.out.println("Enter any number between 2,4 and 5 to check the answers.\nTo run all tasks just press enter");
        System.out.print("Which Task do you wanna check: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();

        if( input.equals("2") || input.equals("") ) task2();
        if( input.equals("4") || input.equals("") ) task4();
        if( input.equals("5") || input.equals("") ) task5();
        
        
    }
    public static void task2(){
        System.out.println("=========Test Case 1=============");
        Node head1 = LinkedList.createList(new Integer[]{10, 16, -5, 9, 3, 4});
        int[] dist = new int[] {2, 0, 5, 2, 8};
        int returnedValue = Fall_23_Solution.sumDist(head1, dist);
        System.out.println("Sum of Nodes: "+returnedValue); // This should print: Sum of Nodes: 4
        assertTest(returnedValue, 4, "Question 02");
    }
    public static void task4(){
        String[][] arr = {{"10A", "ABW"}, {"13D", "ZMD"}, {"31B", "NZF"}, {"1A2", "MNY"}, {"C7B", "FAF"}, {"2A4", "RAK"}};
        Hashtable ht = new Hashtable(3);
        ht.createFromArray(arr);
        ht.printHashtable();
        System.out.println("======================");
        Fall_23_Solution.remove(ht,"C7B");
        ht.printHashtable();
        donePrint("Question 04");
    }
    public static void task5(){
        Object[] tree;
        BTNode givenRoot, expectedRoot;
        taskPrint("\n===================== Question 05 =====================");
        taskPrint("============== Swap Children Nodes ===============");
        // index              0    1    2    3    4    5    6     7    8    9   10    11    12   13     14
        tree = new Object[]{null, 'A', 'B', 'C', 'D', 'E', null, 'F', 'G', 'H', 'I', null, null, null, 'J' };
        givenRoot = treeConstruction(tree, 1);
        BTPrinter.printNode(givenRoot);
        System.out.println("--------------------------------------------------");
        // index              0    1    2    3    4    5     6    7    8    9    10    11    12   13    14   15
        tree = new Object[]{null, 'A', 'C', 'B', 'F', null, 'E', 'D', 'J', null, null, null, 'I', null, 'G', 'H' };
        expectedRoot = treeConstruction(tree, 1);
        System.out.println("::Expected Output Tree::");
        BTPrinter.printNode(expectedRoot);        
        System.out.print("InOrder Printing: ");
        BTPrinter.inOrderPrint(expectedRoot);
        
        System.out.println(bold+"\n::Your Binary Tree::");
        Fall_23_Solution.swapChild(givenRoot, 0, 2);
        BTPrinter.printNode(givenRoot);
        System.out.print("InOrder Printing: ");
        BTPrinter.inOrderPrint(givenRoot);
        
        if( isTreeEqual(expectedRoot, givenRoot) ) successPrint("Question#4");
        else failedPrint("Question#4");
        System.out.println(normal);
    }
    private static BTNode treeConstruction( Object[] arr, int i ){
        if (i>=arr.length || arr[i]==null)
        return null;
        BTNode p = new BTNode(arr[i]);
        p.left = treeConstruction(arr, 2*i);
        p.right = treeConstruction(arr, 2*i+1);
        return p;
    }
    
    
    private static int getDepth( BTNode root ){
        return getDepthHelper(root,0);
    }
    
    private static int getDepthHelper( BTNode root, int lvl ){
        if( root==null){
            return lvl;
        }
        int leftLvl = getDepthHelper(root.left, lvl+1);
        int rightLvl = getDepthHelper(root.right, lvl+1);
        
        return leftLvl>rightLvl ? leftLvl: rightLvl;
    }
    
    private static boolean isTreeEqual( BTNode root1, BTNode root2  ){
        
        if(root1==null && root2==null) return true;
        if(root1==null && root2!=null) return false;
        if(root1!=null && root2==null) return false;
        //if elements didn't match
        if( !Objects.equals(root1.elem, root2.elem) ){
            return false;
        } 
        boolean left = isTreeEqual(root1.left, root2.left);
        boolean right = isTreeEqual(root1.right, root2.right);
        return left && right; 
    }
    
    private static boolean isArrEqual(Object[] arr1, Object[] arr2){
      if(arr1.length!=arr2.length) return false;
      else{
        for(int i=0; i<arr1.length; i++)
          if( !Objects.equals(arr1[i],arr2[i]) ) return false;
        return true;
      }
    }
    
    private static void printArr(Object[] arr){
        if(arr==null){
            System.out.println("null");
            return;
        }
        System.out.print("{ ");
        for(int i=0; i<arr.length; i++){
            System.out.print( "Lvl("+i+"): "+arr[i]);
            if (i!=arr.length-1)
            System.out.print(", ");
        }
        System.out.println(" }");
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
