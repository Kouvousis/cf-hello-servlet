package gr.aueb.cf.helloservlet.controller;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serial;

@WebServlet("/hello")
public class HelloController extends HttpServlet {
    @Serial
    private static final long serialVersionUID = 1L;

    private String message;

    @Override
    public void init(ServletConfig config) throws ServletException {
        message = "Hello World!";
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html><body><h1>Hello World!</h1></body></html>");

    }

    @Override
    public void destroy() {
    }
}
