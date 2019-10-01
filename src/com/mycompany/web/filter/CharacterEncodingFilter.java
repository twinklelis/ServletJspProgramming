package com.mycompany.web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class CharacterEncodingFilter implements Filter {
	//Filter�� �Ƿ��� �ݵ�� Interface�� �ϳ� �����ؾ� �Ѵ�
	private String encoding; //field ����, �Ʒ� �޼ҵ� �鿡�� ������ �̿��ϱ� ���ؼ�(local������ �������� �ʾ���)
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("CharacterEncodingFilter init run..");
		encoding = filterConfig.getInitParameter("encoding");
	}
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException { //FilterChain : Chain(�ߺ��ؼ� ��� ���� �þ����� �ǹ�)
		//client�� ��û�� �ϸ� �� ��û�� �ϵ� �갡 �����
		//�갡 ����ǰ� ���� servlet�� �����
		System.out.println("CharacterEncodingFilter doFilter run..");
		
		request.setCharacterEncoding(encoding); //��ó�� ����
		chain.doFilter(request, response); //servlet���� ����(�̵�)
		
		//���� Filter���� doFilter, destroy, init �̷��� 3���� �޼ҵ尡 ������
		//��� �߻�޼ҵ� �̱⶧���� �����Ǹ� ���־�� ������ java8 ���ķ� �����鼭 default �޼ҵ��� ���� ����
		//destroy, init�� default method�� ���� ������ ���� �ʾƵ� �ȴ�
		//default void init() {}; , default void destroy() {};
	}
	
}
