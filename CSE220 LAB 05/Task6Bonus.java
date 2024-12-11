// Complete the levelSum method
public class Task6Bonus {

    //===================================TASK#6===================================
    // This method takes only 1 parameter which is root of the given tree
    // This method returns an Integer
    // At times you may need to typeCast root.elem to Integer
    // You can use extra helper private static methods with extra extra params as per need
    public static Integer levelSum( BTNode root ){
        //TO DO
        return level_sum(root, 0); //remove this line
    }
    private static Integer level_sum(BTNode root, int level) {
        if (root == null) {
            return 0;
        }
        if (level % 2 == 0) {
            return level_sum(root.left, level+1) + level_sum(root.right, level+1)-(Integer) root.elem;
        }
        return (Integer) root.elem+level_sum(root.left, level+1) + level_sum(root.right, level+1);
    }
    //============================================================================

}