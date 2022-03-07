package izuchenie2019.entities;


import javax.persistence.Embeddable;

@Embeddable
public class Address {
    String street;
    int number;

    public Address() {
    }

    public Address(String street, int number) {
        this.street = street;
        this.number = number;
    }

}
