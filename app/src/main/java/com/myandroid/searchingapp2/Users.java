package com.myandroid.searchingapp2;

import com.google.gson.annotations.SerializedName;

public class Users {
    @SerializedName("id") private int id;
    @SerializedName("name") private String name;
    @SerializedName("email") private String email;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
