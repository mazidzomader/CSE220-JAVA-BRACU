public class Task_04_Matrix {
    public static graph directedToUndirected(graph graph_01) {
        for (int index = 0; index < graph_01.vertex; index++) {
            for (int index1 = 0; index1 < graph_01.vertex; index1++) {
                if (graph_01.matrix[index][index1] != 0) {
                    graph_01.matrix[index1][index] = graph_01.matrix[index][index1];
                }
            }
        }
        return graph_01;
    }
    public static void main(String[] args) {
        graph testCase = new graph(9, true);

        testCase.insertEdge(4, 6, 20);
        testCase.insertEdge(5, 4, 25);
        testCase.insertEdge(5, 6, 85);
        testCase.insertEdge(0, 1, 65);
        testCase.insertEdge(2, 3, 90);
        testCase.insertEdge(3, 5, 75);
        testCase.insertEdge(1, 4, 60);
        testCase.insertEdge(1, 2, 55);
        testCase.insertEdge(2, 0, 10);
        testCase.insertEdge(6, 2, 15);
        testCase.insertEdge(1, 7, 70);
        testCase.insertEdge(5, 7, 40);
        testCase.insertEdge(3, 7, 35);
        testCase.insertEdge(4, 3, 30);
        testCase.insertEdge(8, 1, 45);
        testCase.insertEdge(0, 8, 50);

        System.out.println("Directed weighted graph:");
        Task_01_Matrix.print2D(testCase.matrix);
        directedToUndirected(testCase);
        System.out.println("\nConverted undirected weighted graph:");
        Task_01_Matrix.print2D(testCase.matrix);
    }
}