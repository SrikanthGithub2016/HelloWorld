package com.zensar.srikanth;

import javax.servlet.http.*;  
import javax.servlet.*;  
import java.io.*;  

public class HelloWorld extends HttpServlet
{  
public void doGet(HttpServletRequest req,HttpServletResponse res)  
throws ServletException,IOException  
{  
PrintWriter pw=res.getWriter();
pw.println("Hello World");  
pw.println(" I am learning Git");
 }
} 