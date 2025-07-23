package creational.builder;

public class User {

    private final String name;
    private final String email;
    private final int age;
    private final String address;

    private User(UserBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.email = builder.email;
        this.address = builder.address;
    }

    public void getUserDetails() {
        System.out.println("Name " + this.name);
        System.out.println("Email " + this.email);
        System.out.println("Age " + this.age);
        System.out.println("Address " + this.address);
    }

    public static class UserBuilder {
        private final String name;
        private final String email;
        private int age;
        private String address;

        public UserBuilder(String name, String email) {
            this.name = name;
            this.email = email;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        public User build() {
            return new User(this);
        }

    }

}
