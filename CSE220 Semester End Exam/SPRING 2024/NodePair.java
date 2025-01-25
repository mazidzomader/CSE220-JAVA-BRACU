public class NodePair {
    String key;
    String value;
    NodePair next;

    public NodePair(String key, String value, NodePair next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }
}