package com.mycompany.web.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DispatcherServlet extends HttpServlet {
	private String x;
	private String y; //field로 선언해두고 메소드 안에 선언하지 않는다
	//service에서도 사용하기 위해서
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init(ServletConfig config) run!!");
		//초기화할 내용이 있다면 init에서 해라!
		//ServletConfig를 통해서 초기화 값을 얻는다
		x = config.getInitParameter("x"); //name을 String타입으로 넣어준다
		System.out.println("전달 받은 x 값 : " + x);
		
		y = config.getInitParameter("y");
		System.out.println("전달 받은 y 값 : " + y);
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("DispatcherServlet service run!!");
		int xValue = Integer.parseInt(x);
		int yValue = Integer.parseInt(y);
		int result = xValue + yValue;
		System.out.println("result 의 값 : " + result);
	}
}
