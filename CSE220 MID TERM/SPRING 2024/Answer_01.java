public class Answer_01{

    //Complete this method so that it gives the Expected Output
    public static Integer[] decryptMatrix( Integer[][] matrix ){

        //For this task you'll need to create new arrays
        //we recommend you to use Integer type.
        //example:  Integer[] array = new Integer[5]

        //TO DO
        //DELETE the following return statement when you're ready to return the 2D array
        Integer[] new_arr = new Integer[matrix[0].length];
        Integer[] final_return = new Integer[new_arr.length-1];
        for (int i = 0; i < matrix[0].length; i++) {
            int temp = 0;
            for (int j = 0; j < matrix.length; j++) {
                temp += matrix[j][i];
            }
            new_arr[i] = temp;
        }
        for (int i = 1; i < new_arr.length; i++) {
            final_return[i-1] = new_arr[i]-new_arr[i-1];
        }
        return final_return;
    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[][] matrix = {
                {1,3,1},
                {6,4,2},
                {5,1,7},
                {9,3,3},
                {8,5,4}
        };
        System.out.println("Given Matrix: ");
        Arr.print2D(matrix);
        System.out.println("\nExpected Output:\n[ -13 1 ]");
        Integer[] returned_val_1 = decryptMatrix( matrix );
        System.out.print("\nYour Output:\n");
        Arr.print(returned_val_1);

    }
}