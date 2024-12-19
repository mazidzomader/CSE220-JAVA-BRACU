import java.util.Objects;

import static java.lang.Integer.parseInt;

// Complete the sumOfLeaves method
public class Task2 {

    //===================================TASK#2===================================
    // This method takes only 2 parameters
    // 1st one is root
    // 2nd one is an Integer
    // You'll need to find the path from the root to a node containing the Integer
    // return the path as a String
    public static String findPath( BSTNode root, Integer key ){
        // TO DO
        Boolean flag = findpath(root, key);
        if ( !flag){
            return "No Path Found";
        }
        return path_finder(root, key, ""); //remove this line
    }
    public static Boolean findpath( BSTNode root, Integer key){
        if (root == null){
            return false;
        }
        else if (Objects.equals(root.elem, key)){
            return true;
        }
        else if (root.elem > key){
            return true && findpath(root.left, key);
        }
        else {
            return true && findpath(root.right, key);
        }
    }
    public static String path_finder(BSTNode root, Integer key, String path){
        if (root.elem == key){

            return Integer.toString(root.elem);
        }
        else if (root.elem > key){
            String x = Integer.toString(root.elem);
            return  x + " "+path_finder(root.left, key, path);
        }
        else {
            String x = Integer.toString(root.elem);
            return  x +" "+ path_finder(root.right, key, path);
        }
    }
    //============================================================================

}
