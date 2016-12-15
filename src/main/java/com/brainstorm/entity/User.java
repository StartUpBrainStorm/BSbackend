package com.brainstorm.entity;

import javax.persistence.*;

@Entity
//Name of the table
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //name for ID column
    @Column(name = "id")
    private long id;

    //name for user_first_name column
    @Column(name = "user_first_name")
    private String userFirstName;

    //name for user_last_name column
    @Column(name = "user_last_name")
    private String userLastName;

    //name for user_email column
    @Column(name = "user_email")
    private String userEmail;

    //name for user_password column
    @Column(name = "user_password")
    private String userPassword;

    //name for user_age column
    @Column(name = "user_age")
    private int userAge;

    //empty constructor
    public User() {
    }

    //contructor FULL
    public User(String userFirstName, String userLastName, String userEmail, String userPassword, int userAge) {
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.userAge = userAge;
    }

    //GETER and SETER


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }
}

