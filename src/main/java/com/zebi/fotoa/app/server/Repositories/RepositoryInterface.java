package com.zebi.fotoa.app.server.Repositories;

import com.zebi.fotoa.app.server.Exceptions.ObjectAlreadyExists;

import java.io.IOException;

interface RepositoryInterface<T> {
    void save(T t) throws IOException, ObjectAlreadyExists;
}
