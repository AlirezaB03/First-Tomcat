package org.example.firsttomcat;

import java.io.*;

import jakarta.faces.annotation.ViewMap;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;

@WebServlet(name = "helloServlet", value = "/hello-servlet" )
public class HelloServlet extends HttpServlet {
    private String message;
    private String BankName;

    public void init() {
        message = "Hello World!";
        BankName = "BankName";

    }

     public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println(new java.util.Date().toString());
        out.println("</body></html>");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)throws IOException{
        response.setContentType("text/html");


        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + BankName + "</h1>");
        out.println("</body></html>");

    }

    public void destroy() {
    }
}