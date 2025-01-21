public class Task_03_Matrix {
    public static void main(String[] args) {
        graph test_case = new graph(9, true);
        test_case.insertEdge(4, 6, 20);
        test_case.insertEdge(5, 4, 25);
        test_case.insertEdge(5, 6, 85);
        test_case.insertEdge(0, 1, 65);
        test_case.insertEdge(2, 3, 90);
        test_case.insertEdge(3, 5, 75);
        test_case.insertEdge(1, 4, 60);
        test_case.insertEdge(1, 2, 55);
        test_case.insertEdge(2, 0, 10);
        test_case.insertEdge(6, 2, 15);
        test_case.insertEdge(1, 7, 70);
        test_case.insertEdge(5, 7, 40);
        test_case.insertEdge(3, 7, 35);
        test_case.insertEdge(4, 3, 30);
        test_case.insertEdge(8, 1, 45);
        test_case.insertEdge(0, 8, 50);
        
        Task_01_Matrix.print2D(test_case.matrix);
        
        int[] maxDeg = Task_01_Matrix.maximumDegree(test_case);
        System.out.printf("The vertex %d has maximum outdegree and it is %d%n", maxDeg[1], maxDeg[0]);
        System.out.printf("Sum of outgoing edge weights of the vertex %d is maximum%n", Task_02_Matrix.maximumEdgeWeightWithMatrix(test_case));
    }
}
