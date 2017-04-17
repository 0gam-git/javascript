package com.test.urong;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping(value = "/angular")
@Controller
public class AngularController {

	@RequestMapping(value = "/view")
	public ModelAndView showView(ModelAndView mav) {

		mav.setViewName("angular/test");

		return mav;
	}
}