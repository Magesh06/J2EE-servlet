/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
@WebServlet (urlPatterns = { "/StudentDet"})
public class StudentDet extends HttpServlet {

    /**
     *
     * @param req
     * @param res
     * @throws Servlet
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException 
    {
        PrintWriter out = null;        
        try {
            out = res.getWriter();
        } catch (IOException ex) {
            Logger.getLogger(StudentDet.class.getName()).log(Level.SEVERE, null, ex);
        }
	res.setContentType("text/html");
       try
       {
         String StudId=req.getParameter("studid");
         {
             if(StudId.charAt(0)!='s' || StudId.length()!=4)
	     out.println("Invalid Student ID");

         }
         out.println("<br>");
         String StudName=req.getParameter("studname");
         {
            if(StudName.length()>30)
            out.println("Name should not exist 30 character");
        }
         out.println("Student Name is" +StudName);
         out.println("<br>");
         int StudAge=Integer.parseInt(req.getParameter("studage"));
         {
         if(StudAge<25)
	
	 out.println("Age is not valid");
         else
         out.println("Student Age is" +StudAge);
        }
         
         out.println("<br>");
         int StudMark=Integer.parseInt(req.getParameter("studmark"));
         if(StudMark < 0)
	{
		System.out.println("Mark should not be negative");
        }
         out.println("Student Mark is" +StudMark);
         out.println("<br>");
         {
            if(StudMark<=100 && StudMark>=85)
            {    
               out.println("Grade is A");
            }
            else if(StudMark<=84 &&  StudMark>=75)
            {
                out.println("Grade is B");
            }
            else if(StudMark<=74 && StudMark>=65)
            {
                 out.println("Grade is C");
            }
            else if(StudMark<=64 && StudMark>=55)
            {
                 out.println("Grade is D");
            }
            else if(StudMark<=54 && StudMark>=45)
            {
                 out.println("Grade is E");
            }
       } 
         out.println("<br>");          
         int StudPercen=Integer.parseInt(req.getParameter("studpercen"));
         String StudGrade=req.getParameter("studgrade");
         out.println("Student is Pass :" +StudGrade);
          if(StudMark<45)
         {
                  out.println("Grade is Fail " );
         }
         out.println("<br/>");
         out.println("Student Percentage is" +StudPercen);
         out.println("<br>");

         FileWriter fw=new FileWriter("C:\\User\\Documents\\NetBeansProjects\\StudentDetails",true);
	 BufferedWriter bw=new BufferedWriter(fw);
	 bw.write("Student id is" +StudId);
	 bw.newLine();
	 bw.write("Student name is" +StudName);
	 bw.newLine();
	 bw.write("Student Age is" +StudAge);
	 bw.newLine();
	 bw.write("Student Mark is" +StudMark);
	 bw.newLine();
	 bw.write("Student Percentage " +StudPercen);
	 bw.newLine();
	 bw.write("Student Grade is " +StudGrade);
	 bw.newLine();
             bw.close();
       }
         catch (Exception ex)
        { 
            System.out.println(ex);
        }   
         
          
	}

    private static class Servlet extends Exception {

        public Servlet() {
        }
    }
		
        }