package com.zebi.fotoa.app.server.Components;

import com.zebi.fotoa.app.server.Entities.User;
import com.zebi.fotoa.app.server.Exceptions.ObjectAlreadyExists;
import com.zebi.fotoa.app.server.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserComponent {

    private UserRepository userRepository;
    //Todo: fetch users from respository and return as a list
    @Autowired
    public UserComponent(UserRepository userRepository) {
        this.userRepository = userRepository;
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
    public void saveUser(User u) throws IOException, ObjectAlreadyExists {
        userRepository.save(u);
    }
}
