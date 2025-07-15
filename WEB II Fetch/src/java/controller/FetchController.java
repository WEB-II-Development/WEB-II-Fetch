/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author govin
 */
@WebServlet(name = "FetchController", urlPatterns = {"/FetchController"})
public class FetchController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("success");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Gson gson = new Gson();
        JsonObject fromJson = gson.fromJson(req.getReader(), JsonObject.class);
        String name = fromJson.get("name").getAsString();
        System.out.println(fromJson.get("name").getAsString());

        JsonObject jo = new JsonObject();
        jo.addProperty("message", "Hello, " + name);

        String toJson = gson.toJson(jo);
        resp.setContentType("application/json");
        resp.getWriter().write(toJson);

    }

}
