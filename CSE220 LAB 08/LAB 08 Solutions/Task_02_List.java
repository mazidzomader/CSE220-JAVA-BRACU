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
}
