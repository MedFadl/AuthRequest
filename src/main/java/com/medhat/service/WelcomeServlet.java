package com.medhat.service;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException , IOException {
        HttpSession session = request.getSession(false);

        if (session == null || session.getAttribute("username") == null)
        {
            response.sendRedirect(request.getContextPath() + "/login");
            return;
        }
        String username = (String) session.getAttribute("username");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Welcome</title>");
        out.println("</head>");
        out.println("<body>");

        out.println("<h1>Welcome " + username + "</h1>");
        out.println("<p>You are logged in using a Java session.</p>");

        out.println("<form method='post' action='logout'>");
        out.println("<button type='submit'>Logout</button>");
        out.println("</form>");

        out.println("</body>");
        out.println("</html>");

    }
}
