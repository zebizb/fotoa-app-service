package com.zebi.fotoa.app.server.Entities;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class User implements ObjectInterface {
    @NotNull
    @Valid
    private String id;

    @NotNull
    @Valid
    private String userId;

    private String userName;

    @Override
    public String getId() {
        return this.id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
