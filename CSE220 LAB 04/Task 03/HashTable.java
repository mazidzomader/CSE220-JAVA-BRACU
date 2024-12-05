/*You will have to complete the FruitNode Contrustor first
 then within this class you only have to complete two methods
 hashFunction() and insert()
 the rest of the metods are already written
 DO NOT TOUCH any other methods or codes*/
public class HashTable {

    //ht[] :: is the HashTable array that stores the FruitNode objects
    FruitNode[] ht;

    //Constructor that initializes the HashTable array
	//DO NOT change this Constructor
    public HashTable(int size){
        this.ht = new FruitNode[size];
    }
    
    //This method basically prints the HashTable
    //DO NOT change this method
    public void show(){
        for(int i=0; i<ht.length; i++){
            System.out.print( i+" " );
            FruitNode n = ht[i];
            while (n!=null){
                System.out.print("('"+n.fruit[0]+"', "+n.fruit[1]+") --> ");
                n = n.next;
            }
            System.out.println();
        }
    }

    //you need to COMPLETE this method
    private int hashFunction( String key ){
        // TO DO
        int sum = 0 ;
        if (key.length() % 2 == 0) {
            for (int i = 0; i < key.length(); i+=2) {
                sum += (int)key.charAt(i);
            }

        }
        else {
            for (int i = 1; i < key.length(); i+=2) {
                sum += (int)key.charAt(i);
            }
        }
        return sum % this.ht.length; 
    }

    //you need to COMPLETE this method
    //The insert() method will create FruitNode using name(Key) & price(value)
	//then inserts it in the proper hashed index
    //If collision occurs resolve using the steps explained in the question
    public void insert(String key, Integer value){
        // TO DO
        int index = this.hashFunction(key);
        if (ht[index] == null) {
            this.ht[index] = new FruitNode(key, value);;
        }
        else {
            if ((int) this.ht[index].fruit[1] < value) {
                FruitNode newNode = new FruitNode(key, value);
                newNode.next = this.ht[index];
                this.ht[index] = newNode;
            }
            else {
            FruitNode head = this.ht[index];
            while (head.next != null) {
                if ((int) head.next.fruit[1] < value) {
                    break ;
                }
                head = head.next;
            }
            FruitNode temp = new FruitNode(key, value);
            temp.next = head.next ;
            head.next = temp;
            }
        }
    }

}
