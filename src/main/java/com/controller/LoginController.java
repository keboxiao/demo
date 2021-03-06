package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author 柯博晓
 * @date 创建时间：2017年8月7日 下午3:56:13
 */

public class LoginController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private Integer counter;
	private String test;

	public Integer getCounter() {
		return counter;
	}

	public void setCounter(Integer counter) {
		this.counter = counter;
	}

	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		test = (String) config.getServletContext().getAttribute("test");
		super.init(config);
		counter = 0;
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		String name = req.getParameter("name");
		out.print(name);
		out.flush();
		out.close();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String psw = req.getParameter("psw");
		if (username.equals("test") && psw.equals("123")) {
			counter++;
			HttpSession session = req.getSession();
			session.setAttribute("counter", counter);
			resp.sendRedirect("login.jsp");
		} else {
			resp.sendRedirect("loginfailed.html");
		}
	}

}
