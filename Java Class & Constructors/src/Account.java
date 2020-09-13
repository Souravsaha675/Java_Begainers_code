public class Account {
    private String accountNo;
    private double balance;
    private String Name;
    private String Email;
    private String Number;

    public Account(String accountNo,double balance,String name,String email,String number){
        this.accountNo=accountNo;
        this.balance=balance;
        this.Name=name;
        this.Email=email;
        this.Number=number;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Your current balance is = " + this.balance);
    }

    public void withdraw(double amount) {
        if (amount > this.balance)
            System.out.println("Insufficient Balance");
        else {
            this.balance -= amount;
            System.out.println("Your current balance is = " + this.balance);
        }
    }
}
