class Account {
    private static double interestRate;
    private double balance;

    public static void setInterestRate(double rate) {

        interestRate = rate;

    }

    public void deposit(double amount) {

        balance += amount;

    }

    public void withdraw(double amount) {

        balance -= amount;

    }

    public void addInterest() {

        balance += balance * (interestRate / 100);

    }

    public double getBalance() {
        return balance;
    }
}