package com.store.electronic.service;

import com.store.electronic.dao.DaoException;
import com.store.electronic.dao.UserDAO;
import com.store.electronic.entity.User;

public class UserService {

    private final UserDAO userDao = new UserDAO();

    public User findByUserName(String username) {
        try {
            return userDao.findByUsername(username);
        } catch (DaoException e) {
            System.out.println("Failed to find");
            return null;
        }
    }

    public User findById(Integer id) {
        try {
            return userDao.getById(id);
        } catch (DaoException e) {
            System.out.println("Failed to find");
            return null;
        }
    }

}
