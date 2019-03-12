package com.IMDB.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.IMDB.DAO.LoginDAOimpl;
import com.IMDB.model.Loginuser;

@Controller
public class LoginController {
	
	@RequestMapping(value = "/login.jsp", method = RequestMethod.GET)
	  public ModelAndView userLogin(HttpServletRequest request, HttpServletResponse response) {
		 
		@ModelAttribute("login") Loginuser login) 
	 {
	    ModelAndView mav = null;
	    LoginDAOimpl user = check(login);
	    if(null != user)
	    { 
	    	 mav = new ModelAndView("Home");
			 mav.addObject("firstname", user.getUsername());
	    }
	    else
	    {
	    	 mav = new ModelAndView("login");
			 mav.addObject("message", "Username or Password is wrong!!");
	    }
	    return mav;
	    }
	}
}
