public class Main {
    public static void main(String[] args) {
        Account sourav= new Account("123456",0.00,"Sourav Saha","123@gmail.com","123456789");

        //System.out.println(sourav.getAccountNo());
        //System.out.println(sourav.getBalance());
        sourav.deposit(5000);
        sourav.withdraw(2000);
    }
}
