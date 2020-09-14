package models;

import models.builder.UserModerBuilder;

public class UserModel {

    private String username;
    private String pass;

    public UserModel(UserModerBuilder builder) {
        this.username = builder.getUserBuild();
        this.pass = builder.getPassBuild();
    }

    public String getUsername() {
        return username;
    }

    public String getPass() {
        return pass;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
