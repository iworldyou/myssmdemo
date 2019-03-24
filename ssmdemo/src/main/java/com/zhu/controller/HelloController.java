package com.zhu.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zhu.domain.User;

/**
 * 测试reqest.getParameter(Sting name)
 * @author zhuqinhong
 *
 */
@RestController
public class HelloController {
	
	@RequestMapping(value="/name.do")
	public String login(HttpServletRequest reqest) {
		String name = reqest.getParameter("name");
		return name;
	}
}
