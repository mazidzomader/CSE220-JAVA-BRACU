public class EdgeNode {
    public int source;
    public int destination;
    public int weight;
    public EdgeNode next;

    public EdgeNode(int source, int destination, int weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
        this.next = null;
    }
}

