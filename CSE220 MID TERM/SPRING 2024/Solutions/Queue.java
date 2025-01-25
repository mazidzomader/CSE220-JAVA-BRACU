// Thanks to CHATGPT
import java.util.LinkedList;

public class Queue {
    private LinkedList<String> queue;

    // Constructor to initialize the queue
    public Queue() {
        queue = new LinkedList<>();
    }

    // Method to add an element to the queue
    public void enq(String value) {
        queue.addLast(value);
    }

    // Method to remove and return the front element of the queue
    public String deq() {
        if (isEmpty()) {
            System.out.println("Underflow");
            return null;
        }
        return queue.removeFirst();
    }

    // Method to peek at the front element without removing it
    public String peek() {
        if (isEmpty()) {
            System.out.println("Underflow");
            return null;
        }
        return queue.getFirst();
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return queue.isEmpty();
    }
}