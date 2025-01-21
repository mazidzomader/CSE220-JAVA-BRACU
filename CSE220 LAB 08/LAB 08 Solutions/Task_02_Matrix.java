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
}
