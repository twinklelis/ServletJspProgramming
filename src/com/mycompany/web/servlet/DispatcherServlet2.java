package com.mycompany.web.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DispatcherServlet2 extends HttpServlet{
	@Override
	public void init(ServletConfig config) throws ServletException {
		String contextConfigLocation = config.getInitParameter("contextConfigLocation");
		System.out.println("contextConfigLocation�� �� : " + contextConfigLocation);
		System.out.println("�� �˰ڽ��ϴ�. ���� " + contextConfigLocation + " �� ��ο� �ִ� ������ �а� ������ �ϰڽ��ϴ�.");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("DispatcherServlet2 service run!");
	}
}
