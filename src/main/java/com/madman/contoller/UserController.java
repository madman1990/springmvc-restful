package com.madman.contoller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.madman.pojo.Person;

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
	}

	@RequestMapping(value = "/error/{id}", method = RequestMethod.GET)
	public String madman2(@PathVariable(value = "id") String id, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		System.out.println(id);
		System.out.println(request);
		System.out.println(response);
		System.out.println("ha ha  hah ");
		return id;
	}

	@RequestMapping(value = "/welcome", headers = "Accept=application/json, application/xml")
	@ResponseBody
	public Object tt(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println(" 这是要进入到欢迎界面啊  ，，，，，，，");
		Map<String, Object> map = new HashMap<String, Object>();
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");

		map.put("name", "madman");
		map.put("password", "123456");
		map.put("list", list);
		Person p = new Person();
		p.setXxxx("fff");
		return map;
	}
}
