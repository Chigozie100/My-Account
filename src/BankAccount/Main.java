package BankAccount;

public class Main {
    public static void main(String[] args) {

    Account account = new Account("20204543", 0.0, "gozie",
            "goazie@mail.com", "08137588264");

    account.DepositMoney(100.00);
    account.withdrawMoney(50.00);

    }
}
