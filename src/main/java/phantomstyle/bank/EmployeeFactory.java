package phantomstyle.bank;

public class EmployeeFactory {

    private EmployeeFactory() {

    }

    public static Employee approverBYCredit(int credit) {
        if (credit <= 10000) {
            return new Manager();
        } else {
            if (credit > 10000 && credit <= 50000) {
                return new SeniorManager();
            } else {
                if (credit > 50000) {
                    return new Director();
                }
            }
        }
        return null;
    }
}
