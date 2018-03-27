package phantomstyle.bank;

public class CreditLoan {
    private final String number;
    private final int sum;
    private final String fio;
    private final String param1;
    private final String param2;
    private final String param3;
    private final String param4;

    private CreditLoan(String number, int sum, String fio, String param1, String param2, String param3, String param4) {
        this.number = number;
        this.sum = sum;
        this.fio = fio;
        this.param1 = param1;
        this.param2 = param2;
        this.param3 = param3;
        this.param4 = param4;
    }

    public static class CreditLoanBuilder {
        private String number;
        private int sum;
        private String fio;
        private String param1 = "";
        private String param2 = "";
        private String param3 = "";
        private String param4 = "";

        public CreditLoanBuilder(String number, String fio, int sum) {
            this.number = number;
            this.sum = sum;
            this.fio = fio;
        }

        public CreditLoanBuilder withParam1(String param1){
            this.param1 = param1;
            return this;
        }

        public CreditLoanBuilder withParam2(String param2){
            this.param2 = param2;
            return this;
        }

        public CreditLoanBuilder withParam3(String param3){
            this.param3 = param3;
            return this;
        }

        public CreditLoanBuilder withParam4(String param4){
            this.param4 = param4;
            return this;
        }


        public CreditLoan build() {
                return new CreditLoan(number, sum, fio, param1, param2, param3, param4);
        }
    }
}
