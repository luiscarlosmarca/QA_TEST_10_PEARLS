package models.builder;

import models.UserModel;
import ui.Builder;

public class UserModerBuilder implements Builder<UserModel> {

    private String userBuild;
    private String passBuild;

    public UserModerBuilder() {
    }
    public UserModerBuilder ForDefault(){
        this.passBuild="test1234";
        this.userBuild="3016827691";
        return this;
    }
    public UserModerBuilder withUser(String user) {
        this.userBuild = user;
        return this;
    }

    public UserModerBuilder withPass(String pas) {
        this.passBuild = pas;
        return this;
    }
    public String getUserBuild() {
        return userBuild;
    }

    public String getPassBuild() {
        return passBuild;
    }

    public static UserModerBuilder newUser() {
        return new UserModerBuilder();
    }


    @Override
    public UserModel build(){
        return new UserModel(this);
    }
}
