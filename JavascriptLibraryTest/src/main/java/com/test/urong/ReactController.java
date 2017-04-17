package com.test.urong;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping(value = "/react")
@Controller
public class ReactController {

	@RequestMapping(value = "/view")
	public ModelAndView showView(ModelAndView mav) {

		mav.setViewName("react/test");

		return mav;
	}
}
