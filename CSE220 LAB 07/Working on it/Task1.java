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
    
    
}