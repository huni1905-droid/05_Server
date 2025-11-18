package edu.kh.jsp.controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// @WebServlet() 소괄호 안쪽의 문자열 == 매핑될 주소
// ** 주소 작성 시 반드시 맨 앞에 "/"로 시작해야함("/" 없을시 오류 발생)**
@WebServlet("/el_ustl") //순서 2) 서블릿 주소 등록
// 클라이언트가 /el_ustl 쪽으로 요청이 들어오면 서블릿 동작 할것이다.
public class ElJstlServlet extends HttpServlet{ // 순서 1) 서블릿으로 상속 받고
	
	@Override // 순서 3) doGet 매서드 만들기
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
										throws ServletException, IOException {

		// 1) JSP 경로 (webapp 폴더 기준으로 작성)
		String path = "/WEB-INF/views/el_jstl.jsp";	
		
		// 2) 요청 발송자(Dispatcher) 얻어오기
		RequestDispatcher dispatcher = req.getRequestDispatcher(path);
		
		// 3) 요청 위임(forward)
		dispatcher.forward(req, resp);
		
		
		
	
	
	}
	
}
