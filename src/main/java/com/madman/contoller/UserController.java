package com.madman.contoller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
	@RequestMapping(value = "/testrestful/{id}/{name}/{customerid}", method = RequestMethod.GET)
	public void madman(@PathVariable(value = "id") String id, @PathVariable(value = "name") String name, @PathVariable(value = "customerid") String customerid,
			HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		System.out.println(id);
		System.out.println(name);
		System.out.println(customerid);
		System.out.println(request);
		System.out.println(response);
		System.out.println("123");
		response.sendRedirect("http://photocdn.sohu.com/20160719/Img459923421.jpg");
		// request.getRequestDispatcher("www.baidu.com").forward(request,
		// response);
		// request.getRequestDispatcher("www.baidu.com").forward(request,
		// response);
	}

	@RequestMapping(value = "/tt/")
	public void tt(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("重定向到这里了");
		response.getWriter().write("  good  game  ");

	}
}
