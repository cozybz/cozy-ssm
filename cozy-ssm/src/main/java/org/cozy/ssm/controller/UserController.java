package org.cozy.ssm.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.cozy.ssm.pojo.User;
import org.cozy.ssm.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

	@Resource
	private UserService userServiceImpl;

	@RequestMapping("/login")
	public String login(String name, String password, HttpServletRequest request) {
		User user = null;
		if ((user = userServiceImpl.vertify(name, password)) != null) {
			request.getSession().setAttribute("name", user.getName());
			request.getSession().setAttribute("id", user.getId());
			return "index";
		}
		return "login";
	}
}
