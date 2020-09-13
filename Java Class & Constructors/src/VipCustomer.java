public class VipCustomer {
    private String Name;
    private  double creditLimit;
    private  String Email;

    public VipCustomer(){
        this("Default name",50000.00,"default@gmail.com");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name,creditLimit,"unknown@gmail.com");
    }

    public VipCustomer(String name, double creditLimit, String email) {
        this.Name = name;
        this.creditLimit = creditLimit;
        this.Email = email;
    }

    public String getName() {
        return Name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return Email;
    }
}
