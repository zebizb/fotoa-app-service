package com.zebi.fotoa.app.server.Components;

import com.zebi.fotoa.app.server.Entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserComponent {

    //Todo: fetch users from respository and return as a list
    @Autowired
    public UserComponent() {

    }
    public List<User> getUsers() {
        List<User> users = new ArrayList<>();
        User u1 = new User();
        u1.setId("1");
        u1.setUserId("zebizb");
        u1.setUserName("Muhammad Zohaib");
        users.add(u1);
        return users;
    }
}
