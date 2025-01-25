public class SUMMER_24_MID_SOLUTIONS {
    public static Integer[][] rotate(Integer[][] matrix) {
        int n = matrix.length;
        for (int index = 0; index < n - 1; index++) {
            int temp = matrix[0][0];
            for (int i = 1; i < n; i++) {
                matrix[0][i - 1] = matrix[0][i];
            }
            int temp1 = matrix[n - 1][0];
            for (int i = n - 1; i > 0; i--) {
                matrix[i][0] = matrix[i - 1][0];
            }
            matrix[1][0] = temp;
            temp = matrix[n - 1][n - 1];
            for (int i = n - 2; i >= 0; i--) {
                matrix[n - 1][i + 1] = matrix[n - 1][i];
            }
            matrix[n - 1][1] = temp1;
            for (int i = 1; i < n; i++) {
                matrix[i - 1][n - 1] = matrix[i][n - 1];
            }
            matrix[n - 2][n - 1] = temp;
        }
        return matrix;
    }
    public static Node remove_Duplicates(Node head){
        Node temp = head ;
        int idx = 0 ;
        while (temp!= null){
            Node temp1 = head;
            if (idx == 0){
                idx += 1;
                temp = temp.next;
            }
            else {
                while (temp1 != temp){
                    if ((int) temp.elem == (int) temp1.elem){
                        Node x = head ;
                        while (x.next != temp) {
                            x = x.next;
                        }
                        x.next = x.next.next;
                        break;
                    }
                    temp1 = temp1.next;
                }
                temp = temp.next;
                idx += 1;
            }
        }
        
        return head;
    }
    public static Stack do_adjacent_swap(Stack st){
        Stack temp = reverse_stack(st);
        Stack stack = new Stack();
        while (!temp.isEmpty()){
            int x = temp.pop();
            if (temp.isEmpty()){
                stack.push(x);
                return stack;
            }
            int y = temp.pop();
            stack.push(y);
            stack.push(x);
        }
        return stack;
    }
    private static Stack reverse_stack(Stack st){
        Stack temp = new Stack();
        while (!st.isEmpty()){
            temp.push(st.pop());
        }
        return temp;
    }
}
