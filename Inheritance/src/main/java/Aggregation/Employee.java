package Aggregation;

public class Employee {
    int id;
    String name;
    Address address;

    public Employee(int id, String name, Address address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void display(){
        System.out.println("Employee id: "+id+", Employee name: "+name);
        System.out.println("City: "+address.city+", State: "+address.state+", Country: "+address.country);
    }

    public static void main(String[] args){
        Address address1 = new Address("Nairobi", "Nairobi", "Kenya");
        Address address2 = new Address("Kakamega", "Kakamega", "Kenya");

        Employee e1 = new Employee(23, "Michael", address1);
        Employee e2 = new Employee(26, "Ndula", address2);

        e1.display();
        e2.display();
    }
}
