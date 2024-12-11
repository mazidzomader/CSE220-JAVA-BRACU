// Complete the subtractSummation method
public class Task5 {

    //===================================TASK#5===================================
    // This method takes only 1 parameter which is root of the given tree
    // This method returns an Integer
    // At times you may need to typeCast root.elem to Integer
    // You can use extra helper private static methods with extra extra params as per need
    public static Integer subtractSummation( BTNode root ){
        //TO DO
        Integer sum_left = sum_subtrees(root.left, 1), sum_right = sum_subtrees(root.right, 1);
        return sum_left-sum_right; //remove this line
    }
    private static Integer sum_subtrees(BTNode root, int level){
        if (root == null){
            return 0;
        }
        return (Integer) root.elem+ sum_subtrees(root.left, level+1) + sum_subtrees(root.right, level+1);
    }
    //============================================================================

}