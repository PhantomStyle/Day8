package phantomstyle.listener;

import phantomstyle.bank.Departament;
import phantomstyle.bank.Employee;

import java.util.ArrayList;
import java.util.List;

public class HR {
    List<EmployeeTransferListener> listeners = new ArrayList<EmployeeTransferListener>();
    public void addEployeeTransferListerer(EmployeeTransferListener employeeTransferListener){
        listeners.add(employeeTransferListener);
    }
}
