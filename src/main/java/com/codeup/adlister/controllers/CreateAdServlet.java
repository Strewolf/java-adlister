package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.Ad;
import com.codeup.adlister.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "controllers.CreateAdServlet", urlPatterns = "/ads/create")
public class CreateAdServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/ads/create.jsp")
            .forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        Ad ad = new Ad(
//            1, // for now we'll hardcode the user id
//            request.getParameter("title"),
//            request.getParameter("description")
//        );
//        DaoFactory.getAdsDao().insert(ad);
//        response.sendRedirect("/ads");
//    }
//}
        User user = (User) request.getSession().getAttribute("user");
        if (user == null) {
            response.sendRedirect("/login");
            return;
        }

        // retrieve ad information from request parameters
        String title = request.getParameter("title");
        String description = request.getParameter("description");

        // create and save a new ad with the logged in user id
        Ad ad = new Ad( user.getId(),title, description);
        DaoFactory.getAdsDao().insert(ad);
        response.sendRedirect("/ads");
    }}