package exercise3.pack1;

public class Employee {
    private String name;
    private long phone;
    private String address;

    public Employee() {
        name = "No name";
        phone = 0;
        address = "No address";
    }

    public Employee(String name, long phone, String address) {
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    public void output() {
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
        System.out.println("Address: " + address);
        System.out.println();
    }
}
