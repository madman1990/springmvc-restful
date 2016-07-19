package com.madman.contoller;

import java.io.IOException;

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
			HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println(id);
		System.out.println(name);
		System.out.println(customerid);
		System.out.println(request);
		System.out.println(response);
		System.out.println("123");
		response.getWriter().write("<h1> hello  word </h1>");
	}
}
