public class Task_02 {
    public static String decimalToBinary(int num) {
        if (num == 0) {
            return "";
        } else {
            return decimalToBinary(num / 2) + (num % 2);
        }
    }
    public static String decimalToHexadecimal(int num) {
        if (num == 0) {
            return "";
        } else if (num % 16 == 10) {
            return decimalToHexadecimal(num / 16) + "A";
        } else if (num % 16 == 11) {
            return decimalToHexadecimal(num / 16) + "B";
        } else if (num % 16 == 12) {
            return decimalToHexadecimal(num / 16) + "C";
        } else if (num % 16 == 13) {
            return decimalToHexadecimal(num / 16) + "D";
        } else if (num % 16 == 14) {
            return decimalToHexadecimal(num / 16) + "E";
        } else if (num % 16 == 15) {
            return decimalToHexadecimal(num / 16) + "F";
        } else {
            return decimalToHexadecimal(num / 16) + (num % 16);
        }
    }
    private static void printVowel(String string) {
        if (string.isEmpty()) {
            return;
        } else if ("aeiouAEIOU".indexOf(string.charAt(0)) != -1) {
            System.out.print(string.charAt(0));
            printVowel(string.substring(1));
        } else {
            printVowel(string.substring(1));
            System.out.print(string.charAt(0));
        }
    }
    public static void printVowelThenConsonant(Node head) {
        if (head == null) {
            return;
        } else {
            printVowel((String) head.elem);
            System.out.println();
            printVowelThenConsonant(head.next);
        }
    }
    public static double alternateHarmonicSum(int num) {
        if (num <= 0) {
            return 0;
        } else if (num == 1) {
            return 1;
        } else {
            if (num % 2 == 0) {
                return -(1.0 / num) + alternateHarmonicSum(num - 1);
            } else {
                return (1.0 / num) + alternateHarmonicSum(num - 1);
            }
        }
    }
}
