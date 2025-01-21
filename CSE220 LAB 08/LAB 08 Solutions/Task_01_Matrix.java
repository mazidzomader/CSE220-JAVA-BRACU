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
}
