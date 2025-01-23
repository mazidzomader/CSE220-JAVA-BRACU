import java.util.ArrayList;

public class Task_04 {
    public static void printPattern(int num, int empty) {
        if (num <= 0) {
            return;
        } else {
            printEmpty(empty);
            int x = singleLine(num);
            singleLineRight(x + 5, num);
            printEmpty(empty);
            System.out.println();
        }
        printPattern(num - 5, empty + 1);
    }

    private static void printEmpty(int num2) {
        if (num2 == 0) {
            return;
        } else {
            System.out.print("   ");
            printEmpty(num2 - 1);
        }
    }

    private static int singleLine(int num1) {
        if (num1 <= 0) {
            System.out.print(num1 + " ");
            return num1;
        } else {
            System.out.print(num1 + " ");
            return singleLine(num1 - 5);
        }
    }

    private static void singleLineRight(int num1, int originalNum) {
        if (num1 == originalNum) {
            System.out.print(num1 + " ");
            return;
        } else {
            System.out.print(num1 + " ");
            singleLineRight(num1 + 5, originalNum);
        }
    }
    public static void printPattern(int num){
        printPattern(num,0);
    }
    public static ArrayList<Integer> merge(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
        if (arr2.isEmpty()) {
            bubbleSortRecursive(arr1, arr1.size());
            return arr1;
        } else {
            arr1.add(arr2.get(0));
            return merge(arr1, new ArrayList<>(arr2.subList(1, arr2.size())));
        }
    }

    public static void bubbleSortRecursive(ArrayList<Integer> arr, int n) {
        if (n == 1) return;
        for (int i = 0; i < n - 1; i++) {
            if (arr.get(i) < arr.get(i + 1)) {
                int temp = arr.get(i);
                arr.set(i, arr.get(i + 1));
                arr.set(i + 1, temp);
            }
        }
        bubbleSortRecursive(arr, n - 1);
    }
    
}
