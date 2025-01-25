public class Summer_24_Solutions {
    //Question 02
    public static Node rearrange_tokens(Node head, int SeniorPos){
        Node temp = head ;
        for (int i = 0; i< SeniorPos-1; i++){
            Node temp1 = temp.next;
            temp.next =  null;
            Node temp2 = temp1;
            while (temp2.next != null){
                temp2 = temp2.next;
            }
            temp2.next = temp;temp = temp1;
        }
        return temp;
    }
    // Quesion 03
    private static boolean valid_checker(BTNode root,String key, int index){
        String y = String.valueOf(key.charAt(index));
        if (String.valueOf(root.elem).equals((y))){
            if (index == key.length()-1){
                if (root.left == null && root.right == null){
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }
    private static boolean is_valid(BTNode root, String key, int index){
        if (root == null){
            return true ;
        }
        return valid_checker(root, key, index) && (is_valid(root.left, key, index+1) || is_valid(root.right, key, index+1));
    }
    public static boolean is_Valid(BTNode root, String key){
        return is_valid(root, key, 0);
    }
}
