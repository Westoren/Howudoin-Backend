package com.howudoin.backend.Users;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Document(collection="Users")
public class User {


    @Id
    private String id;
    private String name;
    private String lastname;
    private String email;
    private String password;
    private List<String> friends;

    public User() {

    }

    public User(String id, String name, String lastname, String email, String password, List<String> friends) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.friends = friends;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }
}
