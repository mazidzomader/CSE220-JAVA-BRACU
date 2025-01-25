public class SPRING_24_MID_SOLUTIONS {
    // 01
    public static Integer[] decryptMatrix(int[][] matrix) {
        int[] x = new int[matrix[0].length];
        Integer[] returning = new Integer[matrix[0].length - 1];
        
        for (int index = 0; index < matrix[0].length; index++) {
            int temp = 0;
            for (int index1 = 0; index1 < matrix.length; index1++) {
                temp += matrix[index1][index];
            }
            x[index] = temp;
        }
        
        for (int index = 1; index < x.length; index++) {
            returning[index - 1] = x[index] - x[index - 1];
        }
        
        return returning;
    }
    // 02
    public static boolean isSumPossible(Node head, int n){
        Node temp = head;
        if (temp.next == null) {
            return false;
        }
        else {
            while (temp != null){
                Node temp1 = temp.next;
                while (temp1 != null){
                    if ((int) temp.elem + (int) temp1.elem == n){
                        return true;
                    }
                    temp1 = temp1.next;
                }
                temp = temp.next;
            }
            return false;
        }
    }
    // 03
    private static String[] idGenderExtractor(String s) {
        if (s != null) {
            return new String[]{String.valueOf(s.charAt(0)), s.substring(2)}; // gender, id
        } else {
            return new String[]{null, null};
        }
    }
    public static void dancePair(Stack st) {
        Queue temp = new Queue();
        while (!st.isEmpty()) {
            String x = st.pop();
            String[] xData = idGenderExtractor(x);
            String x_g = xData[0];
            String x_t = xData[1];
            String y = st.isEmpty() ? null : st.pop();
            if (y == null) {
                break;
            }
            String[] yData = idGenderExtractor(y);
            String y_g = yData[0];
            String y_t = yData[1];
            if (!x_g.equals(y_g)) {
                System.out.println(x_t + " and " + y_t + " are paired together");
            } else {
                st.push(y);
                if (x_g.equals("F")) {
                    temp.enq(x);
                } else {
                    if (!temp.isEmpty()) {
                        y = temp.deq();
                        String[] yData2 = idGenderExtractor(y);
                        String y_g2 = yData2[0];
                        String y_t2 = yData2[1];
                        System.out.println(y_t2 + " and " + x_t + " are paired together");
                    }
                }
            }
        }
}
}
