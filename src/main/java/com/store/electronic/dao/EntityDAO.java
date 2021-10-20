package com.store.electronic.dao;

import com.store.electronic.dao.DaoException;
import com.store.electronic.entity.Category;

import java.util.List;

abstract public class EntityDAO<T>{

    abstract Integer create(T type) throws DaoException;
    abstract void delete(T type) throws DaoException;
    abstract List<T> findAll() throws DaoException;
    abstract T getById(int id) throws DaoException;
}
