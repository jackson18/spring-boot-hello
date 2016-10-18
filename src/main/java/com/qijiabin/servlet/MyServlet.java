package com.qijiabin.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ========================================================
 * 日 期：2016年10月18日 上午11:54:01
 * 版 本：1.0.0
 * 类说明：
 * TODO
 * ========================================================
 * 修订日期     修订人    描述
 */
@WebServlet(urlPatterns="/myServlet/*", description="Servlet的说明")
public class MyServlet extends HttpServlet{
 
  private static final long serialVersionUID = 1L;

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      System.out.println(">>>>>>>>>>doGet()<<<<<<<<<<<");
      doPost(req, resp);
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      System.out.println(">>>>>>>>>>doPost()<<<<<<<<<<<");
      resp.setCharacterEncoding("utf-8");
      resp.setContentType("text/html"); 
      PrintWriter out = resp.getWriter(); 
      out.println("<html>"); 
      out.println("<head>"); 
      out.println("<title>Hello World</title>"); 
      out.println("</head>"); 
      out.println("<body>"); 
      out.println("<h1>这是：MyServlet1</h1>"); 
      out.println("</body>"); 
      out.println("</html>");
  }
  
}

