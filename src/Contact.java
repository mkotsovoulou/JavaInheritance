class Contact{
    //Encapsulation: hide the Attributes, Variables, Fields by making them private!!! and create methods to get and set their values!
    private String name;
    private String email;
    private String phoneNumber;
    private double amount;

    //Here we see an example of Constructor Overloading
    //Default or empty Constructor
    public Contact() {
        name="...";
        email="not yet provided";
        phoneNumber="+30...";
        amount = 0;
        System.out.println("Default Constructor is executing!!!");
    }

    //A constructor with 3 arguments
    public Contact(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    //A constructor with 2 arguments
    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.email = "not yet provided";
        this.phoneNumber = phoneNumber;
    }

    //getter & setter - ASSESSOR & MUTATOR
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String p_email) {
        this.email = p_email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    //Overloading
    public int test() {
        return 1;
    }

    public int test(int x) {
        return x+10;
    }

    public int test(int x, int y) {
        return x+y;
    }

    @Override
    public String toString() {   //this method is called by default every time we try to print an instance of our object
        return "Contact{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}