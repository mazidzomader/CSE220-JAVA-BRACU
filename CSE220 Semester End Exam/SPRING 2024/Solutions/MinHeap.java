import java.util.*;
class MinHeap{
    private Integer[] array;
    private Integer size;
    MinHeap(Integer size){
        this.array = new Integer[size+1] ;
        this.size = 0 ;
    }
    public Integer[] get_value(){
        return Arrays.copyOfRange(this.array, 0,this.size+1);
    }
    public void insert(Integer value){
        this.size += 1 ;
        this.array[this.size] = value ;
        this.swim(size);
    }
    public void swim(int index) {
        if (index <= 1) {
            return;
        } else {
            int parent = this.array[index / 2];
            if (parent < this.array[index]) {
                return;
            } else {
                int temp = this.array[index / 2];
                this.array[index / 2] = this.array[index];
                this.array[index] = temp; // Swapping
                swim(index / 2);
            }
        }
    }
    public void extractMin(){
        if (this.size == 0){
            return ;
        }
        else {
            Integer temp = this.array[1] ;
            this.array[1] = this.array[this.size];
            this.array[this.size] = temp ;
            this.size -=1 ;
            sink(1);
        }
    }
    public void sink(Integer index) {
        Integer left = 2 * index ;
        Integer right = (2 * index) + 1 ;
        if (left>this.size){
            return;
        } 
        if (right > this.size){
            if (this.array[index] > this.array[left]){
                Integer temp = this.array[index] ;
                this.array[index] = this.array[left];
                this.array[left] = temp ;
                sink(left);
            }
            return ;
        }
        if (this.array[index] <= Math.min(this.array[left],this.array[right])){
            return;
        }
        if (this.array[left]<this.array[right]){
            Integer temp = this.array[index] ;
            this.array[index] = this.array[left];
            this.array[left] = temp ;
            sink(left);
        }
        else {
            Integer temp = this.array[index] ;
            this.array[index] = this.array[right];
            this.array[right] = temp ;
            sink(right);
        }
    }
    public Integer getMin(){
        return this.array[1];
    }
    public Integer[] sort(){
        Integer[] r_array = new Integer[this.size];
        for (int i = 0; i<r_array.length;i++){
            r_array[i] = getMin();
            extractMin();
        }
        return r_array ;
    }
    
}