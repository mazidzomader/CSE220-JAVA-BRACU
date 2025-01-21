import java.util.Arrays;

class LinkedList {
    public int no_of_vertex;
    public EdgeNode[] vertex_list;
    public boolean status;

    public LinkedList(int vertex, boolean status) {
        this.no_of_vertex = vertex;
        this.vertex_list = new EdgeNode[vertex];
        Arrays.fill(vertex_list, null);
        this.status = status;
    }
    public void insertEdgeHelper(int source, int destination, int weight) {
        EdgeNode newE = new EdgeNode(source, destination, weight);
        if (vertex_list[source] == null) {
            vertex_list[source] = newE;
        } 
        else {
            EdgeNode temp = vertex_list[source];
            while (temp != null) {
                if (temp.destination == destination) {
                    return;
                }
                temp = temp.next;
            }
            newE.next = vertex_list[source];
            vertex_list[source] = newE;
        }
    }
    public void insertEdge(int src, int dest, int weight) {
        insertEdgeHelper(src, dest, weight);
        if (!status) {
            insertEdgeHelper(dest, src, weight);
        }
    }
    public void insertEdge(int src, int dest) {
        insertEdgeHelper(src, dest, 1);
        if (!status) {
            insertEdgeHelper(dest, src, 1);
        }
    }
    public int getDegree(int vertex) {
        int count = 0;
        EdgeNode temp = vertex_list[vertex];
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
    public void printAdjList() {
        for (int i = 0; i < this.no_of_vertex; i++) {
            EdgeNode temp = this.vertex_list[i];
            System.out.print(i + ": ");
            while (temp != null) {
                System.out.print("-> " + temp.destination + " (W: " + temp.weight + ") ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
}

