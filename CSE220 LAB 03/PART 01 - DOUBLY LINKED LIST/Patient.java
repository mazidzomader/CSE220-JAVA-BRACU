//This class will behave like a Doubly Node which will be used in the WRM class
class Patient{

    public Integer id;
    public String name;
    public Integer age;
    public String bloodGroup;
    public Patient next;
    public Patient prev;

    public Patient(Integer id,String name,Integer age,String bloodGroup,Patient next,Patient prev){
        // To Do
        this.id = id;
        this.name = name;
        this.age = age;
        this.bloodGroup = bloodGroup;
        this.next = next;
        this.prev = prev;
    }


}