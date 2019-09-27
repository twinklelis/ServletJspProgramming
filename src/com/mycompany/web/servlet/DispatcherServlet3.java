package com.mycompany.web.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DispatcherServlet3 extends HttpServlet {
	/*
	 * @Override protected void service(HttpServletRequest req, HttpServletResponse
	 * resp) throws ServletException, IOException {
	 * System.out.println("DispatcherServlet3 service run!!"); }
	 */ //service를 정의하면 밑에 정의한 doGet,doPost가 실행되지 않고 service만 실행된다
	//새롭게 작성한 servlet은 기존에 있던 httpservlet을 재정의 한 상태
	//httpservlet은 service가 호출방식에 따라 get이나 post방식으로 실행된다
	//그런데 현재 get과 post 또한 재정의 되어 있으므로 재정의 된 내용이 호출된다
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("DispatcherServlet3 doGet run!!");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("DispatcherServlet3 doPost run!!");
	}
}
