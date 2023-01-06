public class Main {
    public static void main(String[] args) {
        AccountFactory bankAcc = new AccountFactory();

        BankAccount acc1 = AccountFactory.createAccount("Personal");
        acc1.create();

        BankAccount acc2 = AccountFactory.createAccount("Cooperate");
        acc2.create();

        BankAccount acc3 = AccountFactory.createAccount("Business");
        acc3.create();
    }
}