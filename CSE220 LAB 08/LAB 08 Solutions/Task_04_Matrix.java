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
}