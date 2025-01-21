public class Task_01_Matrix {
    public static void print2D(int[][] array){
        for (int[] x : array){
            for (int y : x){
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
    public static int[] maximumDegree(graph graph_01) {
        double max = Double.NEGATIVE_INFINITY;
        int sum = 0;
        int returningRow = 0;
        for (int index = 0; index < graph_01.vertex; index++) {
            sum = graph_01.getDegree(index);
            if (sum > max) {
                max = sum;
                returningRow = index;
            }
            sum = 0;
        }
        return new int[] {(int) max, returningRow};
    }
    public static void main(String[] args) {
        graph graph1 = new graph(8, false);
        graph1.insertEdge(0, 1);
        graph1.insertEdge(2, 1);
        graph1.insertEdge(1, 3);
        graph1.insertEdge(2, 3);
        graph1.insertEdge(4, 1);
        graph1.insertEdge(4, 2);
        graph1.insertEdge(4, 3);
        graph1.insertEdge(4, 6);
        graph1.insertEdge(5, 1);
        graph1.insertEdge(5, 7);
        graph1.insertEdge(6, 7);
        graph1.insertEdge(6, 3);
        graph1.insertEdge(6, 0);
        graph1.insertEdge(7, 4);
        graph1.insertEdge(0, 7);
        graph1.insertEdge(0, 5);
        graph1.insertEdge(2, 7);
        graph1.insertEdge(3, 7);
        print2D(graph1.matrix);
        int[] maxDegree = maximumDegree(graph1);
        System.out.println("The Vertex " + maxDegree[1] + " has the maximum degree having " + maxDegree[0] + " edges");
    }
}
