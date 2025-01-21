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
}
