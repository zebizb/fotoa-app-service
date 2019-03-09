package com.zebi.fotoa.app.server.Repositories;

import com.zebi.fotoa.app.server.Entities.ObjectInterface;
import com.zebi.fotoa.app.server.Exceptions.ObjectAlreadyExists;

import java.io.IOException;

public class Repository<T extends ObjectInterface> implements RepositoryInterface<T> {

    public Repository() {
        super();
    }
    public void save(T t) throws IOException, ObjectAlreadyExists {

    }
}
