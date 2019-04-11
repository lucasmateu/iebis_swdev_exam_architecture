public class User {

    String name;
    String emailAddress;
    int age;
    String address;
    String city;
    String zipCode;

    public User(UserBuilder builder) {
        this.name = builder.name;
        this.emailAddress = builder.emailAddress;
        this.age = builder.age;
        this.address = builder.address;
        this.city = builder.city;
        this.zipCode = builder.zipCode;

    }

    public String getName() {
        return name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getZipCode() {
        return zipCode;
    }
}
