package com.mycompany.web.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DispatcherServlet extends HttpServlet {
	private String x;
	private String y; //field�� �����صΰ� �޼ҵ� �ȿ� �������� �ʴ´�
	//service������ ����ϱ� ���ؼ�
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init(ServletConfig config) run!!");
		//�ʱ�ȭ�� ������ �ִٸ� init���� �ض�!
		//ServletConfig�� ���ؼ� �ʱ�ȭ ���� ��´�
		x = config.getInitParameter("x"); //name�� StringŸ������ �־��ش�
		System.out.println("���� ���� x �� : " + x);
		
		y = config.getInitParameter("y");
		System.out.println("���� ���� y �� : " + y);
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("DispatcherServlet service run!!");
		int xValue = Integer.parseInt(x);
		int yValue = Integer.parseInt(y);
		int result = xValue + yValue;
		System.out.println("result �� �� : " + result);
	}
}
