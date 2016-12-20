/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
@WebServlet(urlPatterns = {"/Myservlet"})
public class Myservlet extends HttpServlet {

    /**
     *
     * @param request
     * @param response
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException, ServletException
            
     {
         PrintWriter printDetails = response.getWriter();
         response.setContentType("text/html");
         
         String ID = request.getParameter("EmpID");
         String Name = request.getParameter("EmpName");
         String Age = request.getParameter("EmpAge");
         String Salary = request.getParameter("EmpSalary");
         String Email = request.getParameter("EmpEmail");
         String Citizen = request.getParameter("EmpCitizen");
         
         printDetails.println("<h1>Employee Retreived Data</h1>");
         printDetails.println("<br/>");
         printDetails.println("\tEmployee ID : "+ID);
         printDetails.println("<br/>");
         printDetails.println("Employee Name \t: "+Name);
         printDetails.println("<br/>");
         printDetails.println("Employee Age \t: "+Age);
         printDetails.println("<br/>");
         printDetails.println("Employee Salary \t: "+Salary);
         printDetails.println("<br/>");
         printDetails.println("Employee Email \t: "+Email);
         printDetails.println("<br/>");
         printDetails.println("Employee Citizen \t: "+Citizen);
         printDetails.println("<br/>");
        
         int eAge = Integer.parseInt(Age);
         float eSalary = Float.parseFloat(Salary);
         if(eAge>30)
         {
             eSalary += 3500;
             printDetails.println("<br/>");
             printDetails.println("Employee Medical Aid is added, and the new Salary is "+eSalary);
         }
         Citizen = Citizen.toUpperCase();
         if(!Citizen.equals("INDIAN"))
         {
             eSalary *= (0.9f);
         }
         if(!Email.contains("niit.com"))
         {
            Email = "Invalid EMail ID";
         }
         
         printDetails.println("<hr/>Employee Modified Data<hr/>");
         printDetails.println("<br/>");
         printDetails.println("\tEmployee ID : "+ID);
         printDetails.println("<br/>");
         printDetails.println("Employee Name \t: "+Name);
         printDetails.println("<br/>");
         printDetails.println("Employee Age \t: "+Age);
         printDetails.println("<br/>");
         printDetails.println("Employee Salary \t: "+eSalary);
         printDetails.println("<br/>");
         printDetails.println("Employee Email \t: "+Email);
         printDetails.println("<br/>");
         printDetails.println("Employee Citizen \t: "+Citizen);
         printDetails.println("<br/>");
         
     }
 }// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   


    
