package com.codeup.adlister.dao;

import com.codeup.adlister.models.User;
import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

    public class MySQLUsersDao implements Users {
        private Connection connection;


        public MySQLUsersDao(Config config) {
            try {
                DriverManager.registerDriver(new Driver());
                connection = DriverManager.getConnection(
                        config.getUrl(),
                        config.getUser(),
                        config.getPassword()
                );

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        public User getUserById(int id) {
            User user = null;
            try {
                PreparedStatement stmt = connection.prepareStatement("SELECT * FROM users WHERE id = ?");
                stmt.setInt(1, id);
                ResultSet rs = stmt.executeQuery();
                if (rs.next()) {
                    user = new User(rs.getString("username"), rs.getString("email"), rs.getString("password"));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return user;
        }

        public List<User> getAllUsers() {
            List<User> users = new ArrayList<User>();
            try {
                PreparedStatement stmt = connection.prepareStatement("SELECT * FROM users");
                ResultSet rs = stmt.executeQuery();
                while (rs.next()) {
                    User user = new User(rs.getString("username"), rs.getString("email"), rs.getString("password"));
                    users.add(user);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return users;
        }

        public void createUser(User user) {
            User newUser = new User(user.getUsername(), user.getEmail(), user.getPassword());
//            System.out.println(newUser.getPassword());
            try {
//                CREATE A USER

//                ADD CREATED USER TO DATABASE
                PreparedStatement stmt = connection.prepareStatement("INSERT INTO users (username, email, password) VALUES (?, ?,?)",Statement.RETURN_GENERATED_KEYS);
                stmt.setString(1, newUser.getUsername());
                stmt.setString(2, newUser.getEmail());
                stmt.setString(3, newUser.getPassword());
                stmt.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        public void updateUser(User user) {
            try {
                PreparedStatement stmt = connection.prepareStatement("UPDATE users SET username = ?, email = ?, password = ? WHERE id = ?");
                stmt.setString(1, user.getUsername());
                stmt.setString(2, user.getEmail());
                stmt.setString(3, user.getPassword());
                stmt.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        public void deleteUser(User user) {
            try {
                PreparedStatement stmt = connection.prepareStatement("DELETE FROM users WHERE username = ?");
                stmt.setInt(1, (int) user.getId());
                stmt.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
           }
        }

        @Override
        public User findByUsername(String username) {
            try {
                String query = "SELECT * FROM users WHERE username = ?";
                PreparedStatement stmt = connection.prepareStatement(query);
                stmt.setString(1, username);
                ResultSet rs = stmt.executeQuery();
                if (rs.next()) {
                    return new User(
                            rs.getLong("id"),
                            rs.getString("username"),
                            rs.getString("email"),
                            rs.getString("password")
                    );
                }
            } catch (SQLException e) {
                throw new RuntimeException("Error finding user by username", e);
            }
            return null;
        }

        @Override
        public Long insert(User user) {
            return null;
        }
    }


