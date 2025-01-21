public class Task_03_List {
    public static void main(String[] args) {
        LinkedList testCase = new LinkedList(9, true);
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
        testCase.printAdjList();

        int[] maxDegVertex = Task_01_List.maximumDegree(testCase);
        System.out.println("The maximum outdegree is " + maxDegVertex[0]);
        System.out.println("Sum of outgoing edge weights of the vertex " + Task_02_List.maximumEdgeWeightWithList(testCase) + " is maximum");
    }
}
