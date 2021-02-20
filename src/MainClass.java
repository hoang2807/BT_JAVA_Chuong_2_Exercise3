import exercise3.pack1.*;
import exercise3.pack2.*;

public class MainClass {
    public static void main(String[] args) throws Exception {
        Deparment dp = new Deparment("Ky su", 2);
        Employee[] e = new Employee[2];
        e[0] = new Employee("Vinh", 29474975, "Ha Noi");
        e[1] = new Employee("Hoang anh", 2943282, "Ha Noi");
        dp.add(e[0]);
        dp.add(e[1]);
        dp.display();
    }
}
