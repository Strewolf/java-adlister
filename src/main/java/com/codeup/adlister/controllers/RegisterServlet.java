//package com.codeup.adlister.controllers;
//
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//@WebServlet(name = "controllers.RegisterServlet", urlPatterns = "/register")
//public class RegisterServlet extends HttpServlet {
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
//        // TODO: show the registration form
//    }
//
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
//        // TODO: ensure the submitted information is valid
//        // TODO: create a new user based off of the submitted information
//        // TODO: if a user was successfully created, send them to their profile
//    }
//}

package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "controllers.RegisterServlet", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String passwordConfirmation = request.getParameter("confirm_password");

        // TODO: ensure the submitted information is valid
        if (username == null || email == null || password == null ||
                username.isEmpty() || email.isEmpty() || password.isEmpty() || !password.equals(passwordConfirmation)) {
            request.setAttribute("error", "Invalid registration information");
            request.getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
            return;
        }

        // TODO: create a new user based off of the submitted information
        User user = new User(username, email, password);

        // Attempt to add the user to the database
        try {
            if (DaoFactory.getUsersDao().insert(user) == null) {
                request.setAttribute("error", "Error creating user");
                request.getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
                return;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        // TODO: if a user was successfully created, send them to their profile
        request.getSession().setAttribute("user", user);
        response.sendRedirect("/profile");
    }
}
