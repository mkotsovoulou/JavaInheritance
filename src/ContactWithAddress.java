public class ContactWithAddress extends Contact { //Inherits all attributes and methods of the parent class
    private String address;
    private String city;
    private String zipCode;
    private String country;

    public ContactWithAddress(String name, String email, String phoneNumber, String address, String city, String zipCode, String country) {
        super(name, email, phoneNumber);
        this.address = address;
        this.city = city;
        this.zipCode = zipCode;
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "ContactWithAddress {" + super.toString() +
                "address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
