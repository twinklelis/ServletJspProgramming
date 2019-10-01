package com.mycompany.web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class CharacterEncodingFilter implements Filter {
	//Filter가 되려면 반드시 Interface를 하나 구현해야 한다
	private String encoding; //field 선언, 아래 메소드 들에서 변수를 이용하기 위해서(local변수로 선언하지 않았음)
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("CharacterEncodingFilter init run..");
		encoding = filterConfig.getInitParameter("encoding");
	}
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException { //FilterChain : Chain(중복해서 계속 물고 늘어지는 의미)
		//client가 요청을 하면 뭘 요청을 하든 얘가 실행됨
		//얘가 실행되고 나서 servlet이 실행됨
		System.out.println("CharacterEncodingFilter doFilter run..");
		
		request.setCharacterEncoding(encoding); //전처리 실행
		chain.doFilter(request, response); //servlet으로 보냄(이동)
		
		//원래 Filter에는 doFilter, destroy, init 이렇게 3개의 메소드가 존재함
		//모두 추상메소드 이기때문에 재정의를 해주어야 하지만 java8 이후로 들어오면서 default 메소드라는 것이 생김
		//destroy, init은 default method로 따로 재정의 하지 않아도 된다
		//default void init() {}; , default void destroy() {};
	}
	
}
