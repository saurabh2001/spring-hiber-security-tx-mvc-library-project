package com.example.library.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class IndexController {

	@RequestMapping(value = "/loginPage", method = {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView login(@RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "logout", required = false) String logout) {
		ModelAndView model = new ModelAndView();
		if (error != null) {
			model.addObject("error", "Invalid Credentials provided.");
		}

		if (logout != null) {
			model.addObject("message", "Logged out successfully.");
		}

		model.setViewName("loginPage");
		return model;
	}
	
	/*@RequestMapping(value = "/loginPage", method = RequestMethod.GET)
	public ModelAndView login(@RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "logout", required = false) String logout) {
		ModelAndView model = new ModelAndView();
		if (error != null) {
			model.addObject("error", "Invalid Credentials provided.");
		}

		if (logout != null) {
			model.addObject("message", "Logged out successfully.");
		}

		model.setViewName("loginPage");
		return model;
	}*/
	
	/*@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView welcome() {
		ModelAndView model = new ModelAndView();
		model.setViewName("welcome");
		return model;
	}*/

	@RequestMapping(value = "/admin/home", method = RequestMethod.GET)
	public ModelAndView adminHomePage() {
		ModelAndView model = new ModelAndView();
		model.setViewName("adminHomePage");
		return model;
	}
	
	@RequestMapping(value = "/user/home", method = RequestMethod.GET)
	public ModelAndView userhomePage() {
		ModelAndView model = new ModelAndView();
		model.setViewName("userHomePage");
		return model;
	}
	
	@RequestMapping(value = "/admin/userdetails", method = RequestMethod.GET)
	public ModelAndView userdetails() {
		ModelAndView model = new ModelAndView();
		model.setViewName("alluserdetails");
		return model;
	}

}
