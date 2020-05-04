package com.javapath.userdbservice.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue
    private int id;
    private int userId;
    private String userName;

    public User() {
    }

    public User(int userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    public User(int id, int userId, String userName) {
        this.id = id;
        this.userId = userId;
        this.userName = userName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
