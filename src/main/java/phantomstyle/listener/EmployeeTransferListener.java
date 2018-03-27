package phantomstyle.listener;

import phantomstyle.bank.Departament;

public interface EmployeeTransferListener {
    void onEmployeeTransfer(Employee employee, Departament departament);
}
