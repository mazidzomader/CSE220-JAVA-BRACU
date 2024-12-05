/*You will have to complete the PairNode Contrustor first
 then within this class you only have to complete two methods
 hashFunction() and searchHashtable()
 the rest of the metods are already written
 DO NOT TOUCH any other methods or codes*/
public class HashTable {

    //ht[] :: is the HashTable array that stores the PairNode objects
    PairNode[] ht;

    //Constructor that initializes the HashTable array
	//DO NOT change this Constructor
    public HashTable(int size){
        this.ht = new PairNode[size];
    }

    //This method is called to insert each pair from the 2D Array
	//DO NOT change this method
    public void createFromArray(Object[][] arr){
        for( Object[] x: arr )
            this.insert( x );
    }

    //The insert() method inserts the pair into proper Hashed Index
	//This method is already written including collision resolve using Forward Chaining
    //DO NOT change this method
    public void insert(Object[] keyValuePair){
        String key = (String)keyValuePair[0];
        Integer value = (Integer)keyValuePair[1];
        String srchResult = this.searchHashtable(keyValuePair);
        if ( srchResult==null ) {
            System.out.println("Incomplete searchHashTable() and hashFunction() method");
        } else if ( srchResult.equals( "Found" ) ){
            System.out.println("("+key+","+value+") already Inserted. Cannot reinsert.");
        } else {
            int hashedIndex = this.hashFunction( key );
            PairNode newPNode = new PairNode( key, value );
            if ( this.ht[hashedIndex] == null ){
                this.ht[hashedIndex] = newPNode;
            } else {
                newPNode.next = this.ht[hashedIndex];
                this.ht[hashedIndex] = newPNode;
            }
        }
    }

    //This method basically prints the HashTable
    //DO NOT change this method
    public void printHashTable(){
        for(int i=0; i<ht.length; i++){
            System.out.print( i+" : " );
            PairNode pNode = ht[i];
            if( pNode==null ) System.out.println("null");
            while (pNode!=null){
                System.out.print("(Key: "+pNode.key+", Value: "+pNode.value+") --> ");
                if (pNode.next==null) System.out.println("null");
                pNode = pNode.next;
            }
        }
    }

	//you need to COMPLETE this method
    private int hashFunction( String key ){
        // TO DO !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        int sum = 0 ;
        if (key.length()%2 == 0) {
            for (int i = 0; i < key.length(); i+=2) {
                String temp = Character.toString(key.charAt(i))+Character.toString(key.charAt(i+1)) ;
                String x ="";
                for (int j = 0; j < temp.length(); j++) {
                    x += (int) temp.charAt(j);
                }
                sum += Integer.parseInt(x);
            }
        }
        else {
            for (int i = 0; i < key.length()-1; i+=2) {
                String temp = Character.toString(key.charAt(i))+Character.toString(key.charAt(i+1)) ;
                String x ="";
                for (int j = 0; j < temp.length(); j++) {
                    x += (int) temp.charAt(j);
                }
                sum += Integer.parseInt(x);
            }
            String temp = Character.toString(key.charAt(key.length()-1))+Character.toString('N') ;
            String x ="";
            for (int i = 0; i < temp.length(); i++) {
                x += (int) temp.charAt(i);
            }
            sum += Integer.parseInt(x);
        }
        return sum % this.ht.length; //remove this line
    }


	//you need to COMPLETE this method
    //Hint: you may need to use Integer.parseInt() to convert from String to Integer
    public String searchHashtable( Object[] keyValuePair ) {
        // TO DO !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

        //it'll return either "Found" or "Not Found"
        for (int i = 0; i < ht.length; i++) {
            PairNode pNode = ht[i];
            while (pNode != null) {
                if (pNode.key.equals(keyValuePair[0]) && pNode.value.equals(keyValuePair[1])) {
                    return "Found";
                }
                pNode = pNode.next;
            }
        }
        return "Not Found";
    }
}
