import java.util.Arrays;

public class Task_02_List {
    public static int maximumEdgeWeightWithList(LinkedList graph01) {
        int[] sumA = new int[graph01.no_of_vertex];
        Arrays.fill(sumA, 0);
        for (int index = 0; index < graph01.no_of_vertex; index++) {
            int sum = 0;
            EdgeNode temp = graph01.vertex_list[index];
            while (temp != null) {
                sum += temp.weight;
                temp = temp.next;
            }
            sumA[index] = sum;
        }
        int maximum = Integer.MIN_VALUE;
        int maxVertex = 0;
        for (int index = 0; index < sumA.length; index++) {
            if (sumA[index] > maximum) {
                maximum = sumA[index];
                maxVertex = index;
            }
        }
        return maxVertex;
    }
    public static void main(String[] args) {
        LinkedList test_case = new LinkedList(9, false);
        test_case.insertEdge(0, 2, 10);
        test_case.insertEdge(0, 1, 65);
        test_case.insertEdge(0, 8, 50);
        test_case.insertEdge(1, 2, 1);
        test_case.insertEdge(1, 4, 60);
        test_case.insertEdge(1, 7, 70);
        test_case.insertEdge(1, 8, 5);
        test_case.insertEdge(2, 6, 15);
        test_case.insertEdge(2, 3, 90);
        test_case.insertEdge(3, 5, 75);
        test_case.insertEdge(3, 4, 30);
        test_case.insertEdge(3, 7, 35);
        test_case.insertEdge(4, 6, 20);
        test_case.insertEdge(4, 5, 25);
        test_case.insertEdge(5, 6, 85);
        test_case.insertEdge(5, 7, 40);
        test_case.printAdjList();
        System.out.println("\nSum of edge weights of the vertex " + maximumEdgeWeightWithList(test_case) + " is maximum");
    }
}
