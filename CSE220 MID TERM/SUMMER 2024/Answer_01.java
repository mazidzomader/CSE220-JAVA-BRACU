import java.util.Arrays;

public class Answer_01 {
    public static void main(String[] args) {
        System.out.println("==============Test Case 1=============");
        Integer[][] matrix1 = {{1, 2, 3}, {5, 6, 7}, {9, 10, 11}};
        Arr.print2D(rotate(matrix1));
        System.out.println();
        System.out.println("==============Test Case 2=============");
        Integer[][] matrix2 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        Arr.print2D(rotate(matrix2));
    }
    static Integer[][] rotate(Integer[][] matrix) {
        for (int j = 0; j < matrix.length - 1; j++) {
            int temp = matrix[0][0];
            for (int i = 1; i < matrix.length; i++) {
                matrix[0][i - 1] = matrix[0][i];
            }
            int temp1 = matrix[matrix.length - 1][0];
            for (int i = matrix.length - 1; i > 0; i--) {
                matrix[i][0] = matrix[i - 1][0];
            }
            matrix[1][0] = temp;
            temp = matrix[matrix.length - 1][matrix[0].length - 1];
            for (int i = matrix.length - 2; i > -1; i--) {
                matrix[matrix.length - 1][i + 1] = matrix[matrix.length - 1][i];
            }
            matrix[matrix.length - 1][1] = temp1;
            for (int i = 1; i < matrix.length; i++) {
                matrix[i - 1][matrix.length - 1] = matrix[i][matrix.length - 1];
            }
            matrix[matrix.length - 2][matrix[0].length - 1] = temp;

        }
        return matrix;
    }
}
