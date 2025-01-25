public class Stack {
    private Node top;

    public Stack() {
        this.top = null;
    }

    // Push method
    public void push(String elem) {
        Node nn = new Node(elem, top);
        top = nn;
    }

    // Pop method
    public String pop() {
        if (top == null) {
            // Stack underflow
            return null; // Method returns Integer instead of int to ensure this line works. If you know exception, modify this using Stack Underflow exception.
        }
        String e = (String)top.elem;
        top = top.next;
        return e;
    }

    // Peek method
    public String peek() {
        if (top == null) {
            // Stack underflow
            return null; // Method returns Integer instead of int to ensure this line works. If you know exception, modify this using Stack Underflow exception.
        }
        return (String) top.elem;
    }

    // isEmpty method
    public boolean isEmpty() {
        return top == null;
    }
}
