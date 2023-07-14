package org.example.LLDExampleProblems.CarRentalSystem;

public class User {
    int userId;
    String name;

    public User(int userId, String name, String license) {
        this.userId = userId;
        this.name = name;
        this.license = license;
    }

    public User() {

    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    String license;

}
