package section3.builderPattern;

public class User {

    private String userName; //Required

    private String emailAddress; //Required

    private String firstName; //Optional

    private String lastName; //Optional

    private int phoneNumber; //Optional

    private String address; //Optional

    private User(Builder builder) {
        this.userName = builder.userName;
        this.emailAddress = builder.emailAddress;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.phoneNumber = builder.phoneNumber;
        this.address = builder.address;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", address='" + address + '\'' +
                '}';
    }

    public static class Builder {

        private String userName; //Required

        private String emailAddress; //Required

        private String firstName; //Optional

        private String lastName; //Optional

        private int phoneNumber; //Optional

        private String address; //Optional

        public Builder(String userName, String emailAddress) {
            this.userName = userName;
            this.emailAddress = emailAddress;
        }

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder phoneNumber(int phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
