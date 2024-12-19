// Complete the lowestCommonAncestor method
public class Task1 {

    //======================TASK#1======================
    // This method takes only 2 parameter as 2 integers
    // You'll need to find the lowest common ancestor of them and return it
    public static Integer lowestCommonAncestor( BSTNode root, Integer x, Integer y ){
        // TO DO
        while (root != null) {
            if (root.elem < x && root.elem < y) {
                root = root.right ;
            }
            else if (root.elem > x && root.elem > y ) {
                root = root.left ;
            } 
            else {
                break ;
            }
    }
    return root.elem ;
    //==================================================
    }
}
