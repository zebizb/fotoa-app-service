package com.zebi.fotoa.app.server.Repositories;

import com.google.gson.Gson;
import com.zebi.fotoa.app.server.Entities.ObjectInterface;
import com.zebi.fotoa.app.server.Exceptions.ObjectAlreadyExists;

import java.io.IOException;
import java.io.PrintWriter;

public class DiskRepository<T extends ObjectInterface> extends Repository<T> {

    private Gson gson;

    public DiskRepository(Gson gson) {
        this.gson = gson;
        //Todo: create folders for disk repositories
        System.out.println(this.getClass().getName());
    }

    public void save(T t) throws IOException, ObjectAlreadyExists {
        super.save(t);
        createFile(t);
    }

    private void createFile(T t) throws IOException, ObjectAlreadyExists {
        if (!idExists(t.getId())) {
            String jsonData = gson.toJson(t);
            try (PrintWriter out = new PrintWriter(t.getId())) {
                out.println(jsonData);
            }
        } else
            throw new ObjectAlreadyExists(String.format("File already exists for id:{0} with type {1}",
                    t.getId(),
                    t.getClass().getSimpleName()
            ));
    }

    private boolean idExists(String id) {
        //Todo: check if user already exists
        return false;
    }
}
