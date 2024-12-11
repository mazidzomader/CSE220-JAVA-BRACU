// Complete the sumTree method
public class Task3 {

        //===================================TASK#3===================================
        // This method takes only 1 parameter which is root of the given tree
        // This method returns an Integer
        // At times you may need to typeCast root.elem to Integer
        // You can use extra helper private static methods as per need
        public static Integer sumTree( BTNode root ){
            //TO DO
            return sum(root, 0); //remove this line
        }
        private static Integer sum(BTNode root, int level){
            if (root == null){
                return 0;
            }
            if (level == 0){
                return (Integer) root.elem+ sum(root.left, level+1) + sum(root.right, level+1);
            }
            return ((Integer) root.elem % level)+ sum(root.left, level+1) + sum(root.right, level+1);
        }
        //============================================================================

}
