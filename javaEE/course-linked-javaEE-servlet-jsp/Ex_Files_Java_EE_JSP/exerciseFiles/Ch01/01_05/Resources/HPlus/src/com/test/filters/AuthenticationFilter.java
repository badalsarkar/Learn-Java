package com.test.filters;

import java.io.IOException;
import java.util.Date;
import java.util.Enumeration;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class AuthenticationFilter implements Filter {
	private ServletContext context;

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)
			throws IOException, ServletException {
		HttpServletRequest req = ((HttpServletRequest) request);
		if (req.getRequestURI().startsWith("/HPlusGit/orderHistory")
				|| req.getRequestURI().startsWith("/HPlusGit/viewProfile")) {
			HttpSession session = req.getSession();
			if (session.getAttribute("username") == null) {
				// redirect to login
				req.getRequestDispatcher("/html/login.jsp").forward(req, response);
			}
		}
			filterChain.doFilter(req, response);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("init of filter");
		System.out.println(arg0.getInitParameter("abc"));

	}

}
