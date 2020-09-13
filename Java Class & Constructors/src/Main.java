public class Main {
    public static void main(String[] args) {
        Account sourav= new Account("123456",0.00,"Sourav Saha","123@gmail.com","123456789");

        //System.out.println(sourav.getAccountNo());
        //System.out.println(sourav.getBalance());
        sourav.deposit(5000);
        sourav.withdraw(2000);

        VipCustomer Ram=new VipCustomer();
        System.out.println(Ram.getName());

        VipCustomer Sam=new VipCustomer("Sam",25000.00);
        System.out.println(Sam.getName());
        System.out.println(Sam.getEmail());

        VipCustomer Bob=new VipCustomer("Bob",40000.00,"bob@gmail.com");
        System.out.println(Bob.getName());
        System.out.println(Bob.getEmail());
    }
}
