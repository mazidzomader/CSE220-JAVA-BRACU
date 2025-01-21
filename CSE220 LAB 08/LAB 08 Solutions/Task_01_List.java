public class Task_01_List {
    public static int[] maximumDegree(LinkedList graph_01) {
        double max = Double.NEGATIVE_INFINITY;
        int sum = 0;
        int returningRow = 0;
        for (int index = 0; index < graph_01.no_of_vertex; index++) {
            sum = graph_01.getDegree(index);
            if (sum > max) {
                max = sum;
                returningRow = index;
            }
            sum = 0;
        }
        return new int[] {(int) max, returningRow};
    }
    
}
