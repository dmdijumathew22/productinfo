package com.hcl.simplilearn;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hcl.simplilearn.ProductInfo.drink.DrinkDAO;
import com.hcl.simplilearn.ProductInfo.drink.DrinkDAOImpl;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		  response.setContentType("text/html");

	        PrintWriter out = response.getWriter();
	        out.println("<form action='' method='POST'>");
	        out.println("<label>Enter Product (Drink) ID: <input type='text' name='drink-id'></input></label>");
	        out.println("<input type='submit'>Get Details</input>");
	        out.println("</form>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String drinkId = request.getParameter("drink-id");
	        PrintWriter out = response.getWriter();
	        DrinkDAO d= new DrinkDAOImpl();
	        out.println(d.productInfo((Integer.parseInt(drinkId))));
	        // Use the drinkDAO .. get the drinkDTO
	        // show the details
	        // or if not found
	        // show an error message

	        //out.println("showing drink details - or an issue if not found");
	}

}
