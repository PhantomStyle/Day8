package phantomstyle;


import phantomstyle.bank.Director;
import phantomstyle.bank.Employee;

public class App {
    public static void main(String[] args) {
        Employee employee = new Director();
        employee.work();
    }
}
