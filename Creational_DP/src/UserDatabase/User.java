package Creational_DP.src.UserDatabase;

public class User {
    private String userName;
    private String email;
    private int age;

    // private constructor so only Builder can create User
    private User(Builder builder) {
        this.userName = builder.userName;
        this.email = builder.email;
        this.age = builder.age;
    }

    public String getUserName() { return userName; }
    public String getEmail() { return email; }
    public int getAge() { return age; }

    // Static inner Builder class (Clear cut builder design pattern)
    public static class Builder {
        private String userName;
        private String email;
        private int age;

        public Builder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public User build() {
            if (userName == null || userName.isEmpty()) {
                throw new IllegalStateException("Username cannot be empty");
            }
            return new User(this);
        }
    }
}
