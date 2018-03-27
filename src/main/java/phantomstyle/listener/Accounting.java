package phantomstyle.listener;

import phantomstyle.bank.Departament;
import phantomstyle.bank.Employee;

public class Accounting {
    public static void makeDocuments(Employee employee, Departament departament){
        System.out.println("Для сотрудника " + employee.getFio() + " переоформлены документы " + departament.getName());
    }
}
