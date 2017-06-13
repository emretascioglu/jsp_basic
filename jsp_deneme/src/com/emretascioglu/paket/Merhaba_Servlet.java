package com.emretascioglu.paket;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Merhaba_Servlet")
public class Merhaba_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L; 
    public Merhaba_Servlet() {
        super(); 
    }	
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		PrintWriter writer = response.getWriter();
	    writer.write("S.a");
	    
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
