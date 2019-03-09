package com.zebi.fotoa.app.server.Repositories;


import com.google.gson.Gson;
import com.zebi.fotoa.app.server.Entities.User;
import com.zebi.fotoa.app.server.Exceptions.ObjectAlreadyExists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class UserRepository extends DiskRepository<User> {
    //Todo: implement user crud operations
    private Gson gson;

    @Autowired
    public UserRepository(Gson gson) {
        super(gson);
    }

    public void save(User u) throws IOException, ObjectAlreadyExists {
        super.save(u);
    }
}
