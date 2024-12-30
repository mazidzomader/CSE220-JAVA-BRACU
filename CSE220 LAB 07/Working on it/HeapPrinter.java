// THIS CLASS IS FOR PRINTING THE BINARY TREE ONLY
// source: https://stackoverflow.com/questions/4965335/how-to-print-binary-tree-diagram-in-java
// This is a slightly modified version of the source to accomodate the lab tasks
// !!!!!!! DO NOT TOUCH THIS FILE AT ALL !!!!!!!
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

class HeapPrinter {

    public static void inOrderPrint( HeapNode root ){
        if (root == null) System.out.println("null");
        else{
            inOrderPrintHelper(root);
            System.out.println();
        }
    }

    public static void inOrderPrintHelper(HeapNode root){
        if (root == null) return;
        inOrderPrintHelper(root.left);
        System.out.print(root.elem+" ");
        inOrderPrintHelper(root.right);
    }

    public static void printNode(HeapNode root) {
        if (root==null)
            System.out.println("null");
        else {
            int maxLevel = HeapPrinter.maxLevel(root);
            printNodeInternal(Collections.singletonList(root), 1, maxLevel);
        }
    }

    private static void printNodeInternal(List<HeapNode> nodes, int level, int maxLevel) {
        if (nodes.isEmpty() || HeapPrinter.isAllElementsNull(nodes))
            return;

        int floor = maxLevel - level;
        int endgeLines = (int) Math.pow(2, (Math.max(floor - 1, 0)));
        int firstSpaces = (int) Math.pow(2, (floor)) - 1;
        int betweenSpaces = (int) Math.pow(2, (floor + 1)) - 1;

        HeapPrinter.printWhitespaces(firstSpaces);

        List<HeapNode> newNodes = new ArrayList<HeapNode>();
        for (HeapNode node : nodes) {
            if (node != null) {
                System.out.print(node.elem);
                newNodes.add(node.left);
                newNodes.add(node.right);
            } else {
                newNodes.add(null);
                newNodes.add(null);
                System.out.print(" ");
            }

            HeapPrinter.printWhitespaces(betweenSpaces);
        }
        System.out.println("");

        for (int i = 1; i <= endgeLines; i++) {
            for (int j = 0; j < nodes.size(); j++) {
                HeapPrinter.printWhitespaces(firstSpaces - i);
                if (nodes.get(j) == null) {
                    HeapPrinter.printWhitespaces(endgeLines + endgeLines + i + 1);
                    continue;
                }

                if (nodes.get(j).left != null){
                    int elemLength = String.valueOf(nodes.get(j).left.elem).length();
                    if( elemLength==1 ) System.out.print("/");
                    else System.out.print(" /");
                }
                else
                    HeapPrinter.printWhitespaces(1);

                HeapPrinter.printWhitespaces(i + i - 1);

                if (nodes.get(j).right != null){
                    int elemLength = String.valueOf(nodes.get(j).right.elem).length();
                    if( elemLength==1 ) System.out.print("\\");
                    else System.out.print(" \\");
                }
                else
                    HeapPrinter.printWhitespaces(1);

                HeapPrinter.printWhitespaces(endgeLines + endgeLines - i);
            }

            System.out.println("");
        }

        printNodeInternal(newNodes, level + 1, maxLevel);
    }

    private static void printWhitespaces(int count) {
        for (int i = 0; i < count; i++)
            System.out.print(" ");
    }

    private static int maxLevel(HeapNode node) {
        if (node == null)
            return 0;

        return Math.max(HeapPrinter.maxLevel(node.left), HeapPrinter.maxLevel(node.right)) + 1;
    }

    private static boolean isAllElementsNull(List<?> list) {
        for (Object object : list) {
            if (object != null)
                return false;
        }

        return true;
    }

}