package exercise3.pack2;

import exercise3.pack1.*;

public class Deparment {
    private String name;
    private Employee[] emps;
    private int num;

    public Deparment(String name, int N) {
        this.name = name;
        emps = new Employee[N];
        num = 0;
    }

    public void add(Employee e) {
        emps[num] = e;
        ++num;
    }

    public void display() {
        System.out.println("Department name: " + name + "\n");
        for (int i = 0; i < num; ++i) {
            emps[i].output();
        }
    }

}
