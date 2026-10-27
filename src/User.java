package src;

public class User {
    private String userName;
    private String password;
    private int yearOfBirth;

    public User(String userName, String password, int yearOfBirth) {
        this.userName = userName;
        this.password = password;
        this.yearOfBirth = yearOfBirth;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public String toString() {
        return "User [userName=" + userName + ", password=" + password + ", yearOfBirth=" + yearOfBirth + "]";
    }
    
    public String getInfo() {
        return "User [userName=" + userName + ", password=" + password + ", yearOfBirth=" + yearOfBirth + "]";
    }
}
