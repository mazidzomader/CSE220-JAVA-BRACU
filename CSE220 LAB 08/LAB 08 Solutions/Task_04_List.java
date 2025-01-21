public class Task_04_List {
    public static void directedToUndirected(LinkedList graph) {
        for (int index = 0; index < graph.no_of_vertex; index++) {
            EdgeNode temp = graph.vertex_list[index];
            while (temp != null) {
                graph.insertEdge(temp.destination, index, temp.weight);
                temp = temp.next;
            }
        }
    }
    public static void main(String[] args) {
        LinkedList test_case = new LinkedList(9, true);

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

        System.out.println("Directed weighted graph:");
        test_case.printAdjList();
        directedToUndirected(test_case);
        System.out.println("\nConverted undirected weighted graph:");
        test_case.printAdjList();
    }
}
