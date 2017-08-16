package info.henryk.springframework;

public class Address {
    private String locality;
    private String zipCode;
    private String street;
    private String streetNumber;

    public Address(String locality, String zipCode, String street, String streetNumber) {
        this.locality = locality;
        this.zipCode = zipCode;
        this.street = street;
        this.streetNumber = streetNumber;
    }

    @Override
    public String toString() {
        return "Address{" +
                "locality='" + locality + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", street='" + street + '\'' +
                ", streetNumber='" + streetNumber + '\'' +
                '}';
    }
}
