// Complete the sumOfLeaves method
public class Task4 {

    //===================================TASK#4======================
    // This method takes only 2 parameters
    // 1st one is root of the given tree
    // 2nd one is the Node of which you need to find the predecessor
    // This method returns the predecessor's Node
    // You can use extra helper private static methods as per need
    public static BSTNode inOrderPredecessor( BSTNode root, BSTNode x ){
        //TO DO
        if (x.left != null){
            BSTNode y = x.left ;
            return maximum(y) ;
        }
        else {
            BSTNode returning = null ;
            while (x.elem != root.elem) {
                if (x.elem > root.elem) {
                    returning = root ;
                    root = root.right ;
                }
                else {
                    root = root.left ;
                }
            }
            return returning ;
        }
    }
    private static BSTNode maximum(BSTNode root){
        if (root.right == null) {
            return root ;
        }
        return maximum(root.right);
    }
    //===============================================================


}
