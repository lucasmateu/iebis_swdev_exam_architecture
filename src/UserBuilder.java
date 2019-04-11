public class UserBuilder {


    String name;
    String emailAddress;
    int age;
    String address;
    String city;
    String zipCode;

public UserBuilder(String name){
    this.name = name;
    }

    public UserBuilder name(String name) {
        this.name = name;
        return this;
    }

    public UserBuilder emailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    public UserBuilder age(int age) {
        this.age = age;
        return this;
    }

    public UserBuilder address(String address) {
        this.address = address;
        return this;
    }

    public UserBuilder city(String city) {
        this.city = city;
        return this;
    }

    public UserBuilder zipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }
}
