package com.store.auth.service;

import com.store.auth.domain.User;

import java.util.List;

public interface GenericService<T> {
    List<T> getAll();

    T get(Long id, String noSuchElementException);

    void save(T entity);

    void update(T entity);

    void delete(Long id);
}
