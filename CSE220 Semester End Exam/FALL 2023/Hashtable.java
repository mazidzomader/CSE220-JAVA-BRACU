public class Hashtable {
    public NodePair[] ht;

    public Hashtable(int size) {
        ht = new NodePair[size];
    }

    public void insert(String[] s) {
        int hashedIndex = hashFunction(s[0]);
        NodePair pair = new NodePair(s[0], s[1], null);
        if (ht[hashedIndex] == null) {
            ht[hashedIndex] = pair;
        } else {
            pair.next = ht[hashedIndex];
            ht[hashedIndex] = pair;
        }
    }

    public void createFromArray(String[][] arr) {
        for (String[] i : arr) {
            insert(i);
        }
    }

    public void printHashtable() {
        int idx = 0;
        for (NodePair i : ht) {
            System.out.print(idx + " : ");
            NodePair head = i;
            while (head != null) {
                if (head.next == null) {
                    System.out.println("(" + head.key + ", " + head.value + ")");
                    break;
                }
                System.out.print("(" + head.key + ", " + head.value + ") --> ");
                head = head.next;
            }
            idx++;
        }
    }

    public int hashFunction(String key) {
        int sum = 0;
        for (int i = 0; i < key.length(); i++) {
            sum += key.charAt(i);
        }
        return sum % ht.length;
    }
}