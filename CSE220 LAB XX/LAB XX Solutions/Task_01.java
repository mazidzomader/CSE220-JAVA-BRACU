public class Task_01{
    public static int even_sum(int[] arr){
        return EvenSum(arr, 0);
    }
    public static int EvenSum(int[] arr,int  idx){
        if (arr.length <= idx) {
            return 0 ;
        }
        if (arr[idx] > 0 && arr[idx] % 2 == 0 ){
            return arr[idx] + EvenSum(arr, idx+1);
        }
        return EvenSum(arr, idx+1);
    }
    public static int multiply_odd_positive(Node node){
        if (node == null){
            return 1 ;
        }
        if ((int) node.elem > 0 && (int) node.elem % 2 != 0){ // Need to do type cast casting. Damn you BRACU
            return (int) node.elem * multiply_odd_positive(node.next);
        }
        return multiply_odd_positive(node.next);
    }
    public static int total_combinations(int n, int r){
        if (r == 0 || n == r){
            return 1 ;
        }
        return total_combinations(n-1, r-1) + total_combinations(n-1, r);
    }
    public static int total_digits(int num){
        if (num ==0) {
            return 0 ;
        } 
        return 1 + total_digits(num/10);
    }
    public static boolean primeChecker(int num){
        return prime_Checker(num,2);
    }
    public static boolean prime_Checker(int num ,int idx){
        if (num % idx == 0){
            return false;
        }
        else if (idx == num-1){
            return true;
        }
        else {
            return true && prime_Checker(num, idx + 1 );
        }
    }
    public static void print_list(Node node){
        if (node == null ){
            return;
        }
        print_list(node.next);
        System.out.println(node.elem);
    }
    
}
