package phantomstyle.bank;

import phantomstyle.listener.Accounting;
import phantomstyle.listener.HR;
import phantomstyle.listener.ServiceDesk;

public abstract class Employee {
    private String fio;

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public void work(){
        takeTask();
        performTask();
        signTask();
    }
    public void takeTask(){
        System.out.println("I've taken the task");
    }
    public void performTask(){
        System.out.println("I've done this task");
    }
    public abstract void signTask();

    public void move(String departamentName){
        Departament departament = new Departament(departamentName);
        HR.move(this, departament);
        Accounting.makeDocuments(this, departament);
        ServiceDesk.makeEngine(this);
    }
}
