package com.store.electronic.dao;

import com.store.electronic.entity.Category;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static com.store.electronic.utils.jdbcConnect.getConnection;

public class CategoryDAO extends EntityDAO<Category> {

    private static final String INSERT_SQL = "Insert Into category(name) value";
    private static final String SELECT_ALL = "Select id, name from category";


    @Override
    public Integer create(Category category) throws DaoException {
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement =
                     connection.prepareStatement(INSERT_SQL, Statement.RETURN_GENERATED_KEYS)) {
            return preparedStatement.executeUpdate();
        } catch (SQLException | ClassNotFoundException throwables) {
            throw new DaoException();
        }
    }

    @Override
    void delete(Category type) throws DaoException {
    }

    @Override
    public List<Category> findAll() throws DaoException {
        List<Category> categories = new ArrayList<>();
        try (
                Connection connection = getConnection();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(SELECT_ALL);
        ) {
            while (resultSet.next()) {
                Integer id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                Category category = new Category(id, name);

                categories.add(category);
            }
        } catch (SQLException | ClassNotFoundException throwables) {
            throw new DaoException();
        }
        return categories;
    }

    @Override
    public Category getById(int id) throws DaoException {
        return null;
    }
}
