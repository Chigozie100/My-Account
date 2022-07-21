package BankAccount;

public class Account {
    private String Number;
    private double Balance;
    private String name;
    private String email;
    private String PhoneNumber;

    public Account(String number, double balance, String name, String email, String phoneNumber) {
        Number = number;
        Balance = balance;
        this.name = name;
        this.email = email;
        PhoneNumber = phoneNumber;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public void DepositMoney(double depositedMoney){
        this.Balance += depositedMoney;
        System.out.println("Deposit is successful, new Balance is " + this.Balance);
    }

    public void withdrawMoney(double withdrawalMoney){
        if (this.Balance - withdrawalMoney < 0){
            System.out.println("withdraw unsuccessful only " +
                    this.Balance + " is left");
        } else {
            this.Balance -= withdrawalMoney;
            System.out.println("withdraw successful, current balance is " + this.Balance);
        }
    }


}
