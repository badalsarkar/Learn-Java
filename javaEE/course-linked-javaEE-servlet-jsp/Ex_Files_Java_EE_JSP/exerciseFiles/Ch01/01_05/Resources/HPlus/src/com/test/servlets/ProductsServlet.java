package com.test.servlets;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.test.beans.Product;
import com.test.dao.ApplicationDao;

/**
 * Servlet implementation class ProductsServlet
 */
@WebServlet("/products")
public class ProductsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ProductsServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		List<String> productNames = (ArrayList<String>)(session.getAttribute("noofproducts"));
		
		if(productNames==null){
			productNames=new ArrayList<String>();
		}
		
		System.out.println("product name== "+request.getParameter("product"));
		
		if (request.getParameter("product") != null ) {
			
			productNames.add(request.getParameter("product"));			
		}
		
		
		
		ApplicationDao searchDao = new ApplicationDao();
		session.setAttribute("noofproducts", productNames);
		List<Product> products = new ArrayList<>();
		
		try {
			products = searchDao.searchProducts(session.getAttribute("searchCriteria").toString());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("fresh fetch:::: "+products.size());
		request.setAttribute("products", products);
		request.getRequestDispatcher("/html/search.jsp").forward(request, response);

		
	}

	
	private String getHTMLString(String filePath, List<Product> products, int sizeOfCart) throws IOException {
		BufferedReader template = new BufferedReader(new FileReader(filePath));
		String line="";
		StringBuilder builder = new StringBuilder();
		while((line=template.readLine())!=null){
			builder.append(line);
		}
		String page = builder.toString();
		page = MessageFormat.format(page, 
				products.get(0).getProductImgPath(),
				products.get(1).getProductImgPath(),
				products.get(2).getProductImgPath(),
				products.get(0).getProductName(),
				products.get(1).getProductName(),
				products.get(2).getProductName(),sizeOfCart);
				
		return page;
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
