package com.example.operatingsystemproject;

public class User {

    String firstName, lastName, email, address, position, username, password;
    long phoneNumber;
    int id, priorityLevel;

    public User() {
    }

    public User(String firstName, String lastName, String email, long phoneNumber, String address, String position, int id, int priorityLevel, String username, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.position = position;
        this.username = username;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.id = id;
        this.priorityLevel = priorityLevel;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPriorityLevel(int priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

    public String getPosition() {
        return position;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public int getId() {
        return id;
    }

    public int getPriorityLevel() {
        return priorityLevel;
    }
}
