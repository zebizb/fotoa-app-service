package com.zebi.fotoa.app.server.Repositories;

import com.zebi.fotoa.app.server.Entities.ObjectInterface;

import java.io.IOException;

public class MemoryRepository<T extends ObjectInterface> extends Repository<T> {
    public MemoryRepository() {
        super();
    }
    public void save(T t) throws IOException {

    }
}
