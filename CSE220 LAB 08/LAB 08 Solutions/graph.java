public class graph{
    int vertex ;
    int[][] matrix ;
    boolean status ;
    graph(int v ,boolean s){
        this.vertex = v ;
        this.matrix = new int[v][v];
        this.status = s ;
    }
    void insertEdge(int s, int d){
        this.matrix[s][d] = 1;
        if (!this.status){
            this.matrix[d][s] = 1;
        }
    }
    void insertEdge(int s, int d, int w){
        this.matrix[s][d] = w;
        if (!this.status){
            this.matrix[d][s] = w;
        }
    }
    int getDegree(int v) {
        int x = 0;
        for (int i = 0; i<this.vertex; i++){
            if (this.matrix[v][i] != 0) {
                x += 1;
            }
        }
        return x;
    }
    int getWeight(int v){
        int x = 0 ;
        for (int i = 0; i<this.vertex; i++){
            if (this.matrix[v][i] != 0) {
                x += this.matrix[v][i];
            }
        }
        return x;
    }

}