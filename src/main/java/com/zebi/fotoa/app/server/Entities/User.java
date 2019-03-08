package com.zebi.fotoa.app.server.Entities;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class User {
    @NotNull
    @Valid
    private String id;

    @NotNull
    @Valid
    private String userId;

    private String userName;

    public String getUserId() {
        return userId;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
