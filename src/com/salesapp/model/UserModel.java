package com.salesapp.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.Valid;
import javax.validation.constraints.Size;

/*
User model that will be used by both the login and registration modules for the time being
 */
public class UserModel {

    private int ID;
    @NotEmpty(message = "This is a required field")
    @Size(min = 2, max = 14, message = "Please be sure that your input is more than 2 characters and less than 14")
    private String firstName;
    @NotEmpty(message = "This is a required field")
    @Size(min = 2, max = 14, message = "Please be sure that your input is more than 2 characters and less than 14")
    private String lastName;
    @Valid
    private String password;
    @Valid
    private String username;
    private int role;
    private int status;

    //Default constructor for forms
    public UserModel(){
        ID = 0; // The user's ID, largely used in conjuction with a database
        firstName = "fname"; //User's first name
        lastName = "lname"; // User's last name
        password= "pass"; ///User password
        username = "testuser"; //Valid email for user
        role = 0; //Whether the user is a typical user or administrator
        status = 0; //Whether the user is active or disabled
    }

    //Non-default constructor for use during registration
    public UserModel(int ID, String firstName, String lastName, String password, String username, int role, int status) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password=password;
        this.username = username;
        this.role = role;
        this.status = status;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password=password;
    }
}
