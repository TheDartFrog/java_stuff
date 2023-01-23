class BankCustomer {
    private Person person;
    private Account account;

    public BankCustomer(Person person) {
        this.person = person;
        this.account = new Account();
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Non-positive deposit, transaction cancelled!");
        } else {
            account.deposit(amount);
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Non-positive withdrawal, transaction cancelled!");
        } else if (amount > account.getBalance()) {
            System.out.println("Insufficient funds for withdrawal, transaction cancelled!");
        } else {
            account.withdraw(amount);
        }
    }

    public void transfer(BankCustomer other, double amount) {
        if (amount <= 0) {
            System.out.println("Non-positive transfer, transaction cancelled!");
        } else if (amount > account.getBalance()) {
            System.out.println("Insufficient funds for transfer, transaction cancelled!");
        } else {
            account.withdraw(amount);
            other.deposit(amount);
        }
    }

    public void addInterest() {
        account.addInterest();
    }

    public String toString() {
        return "Customer: " + person.getName() + ", Balance: " + account.getBalance();
    }
}