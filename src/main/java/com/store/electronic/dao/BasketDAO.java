package com.store.electronic.dao;

import java.util.List;

public interface BasketDAO<T> {
    T insertOrUpdate(T type) throws DaoException;
    void delete(T type) throws DaoException;
    List<T> findAll() throws DaoException;
    T getById(int id) throws DaoException;
}
