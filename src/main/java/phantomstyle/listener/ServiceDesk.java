package phantomstyle.listener;

import phantomstyle.bank.Employee;

public class ServiceDesk {
    public static void makeEngine(Employee employee){
        System.out.println("Для сотрудника " + employee.getFio() + " переоформлены железки");
    }
}
