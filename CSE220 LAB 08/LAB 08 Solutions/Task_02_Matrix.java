public class Task_02_Matrix {
    public static int maximumEdgeWeightWithMatrix(graph graph01) {
        double maximum = -Double.MAX_VALUE;
        int idx = -1;
        for (int index = 0; index < graph01.vertex; index++) {
            double weight = graph01.getWeight(index);
            if (weight > maximum) {
                maximum = weight;
                idx = index;
            }
        }
        return idx;
    }
    public static void main(String[] args) {
        graph testCase = new graph(9, false);

        testCase.insertEdge(0, 2, 10);
        testCase.insertEdge(0, 1, 65);
        testCase.insertEdge(0, 8, 50);
        testCase.insertEdge(1, 2, 1);
        testCase.insertEdge(1, 4, 60);
        testCase.insertEdge(1, 7, 70);
        testCase.insertEdge(1, 8, 5);
        testCase.insertEdge(2, 6, 15);
        testCase.insertEdge(2, 3, 90);
        testCase.insertEdge(3, 5, 75);
        testCase.insertEdge(3, 4, 30);
        testCase.insertEdge(3, 7, 35);
        testCase.insertEdge(4, 6, 20);
        testCase.insertEdge(4, 5, 25);
        testCase.insertEdge(5, 6, 85);
        testCase.insertEdge(5, 7, 40);

        Task_01_Matrix.print2D(testCase.matrix);;
        System.out.println("Vertex " + maximumEdgeWeightWithMatrix(testCase) + " has maximum sum of edge weights");
    }
}
