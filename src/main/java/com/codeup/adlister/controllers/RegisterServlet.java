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
        if (request.getSession().getAttribute("user") != null) {
            response.sendRedirect("/profile");
            return;
        }
        request.getRequestDispatcher("/register.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println(username);
        System.out.println(email);
        System.out.println(password);



        // TODO: ensure the submitted information is valid
        if (username == null || email == null || password == null ||
                username.isEmpty() || email.isEmpty() || password.isEmpty()){
            System.out.println("error");
            request.setAttribute("error", "Invalid registration information");
            response.sendRedirect("/register");
            return;
        }

        // TODO: create a new user based off of the submitted information
        User user = new User(username, email, password);
        System.out.println(user.getPassword());
        // Attempt to add the user to the database
//        try {
//            if (DaoFactory.getUsersDao().createUser(user) == null) {
//                request.setAttribute("error", "Error creating user");
//                request.getRequestDispatcher("WEB-INF/profile.jsp").forward(request, response);
//                return;
//            }
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }

        try {
            DaoFactory.getUsersDao().createUser(user);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        // TODO: if a user was successfully created, send them to their profile
        try {
            request.getSession().setAttribute("user", DaoFactory.getUsersDao().findByUsername(username));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        request.getRequestDispatcher("WEB-INF/profile.jsp").forward(request, response);
    }
}
