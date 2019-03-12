package com.IMDB.service;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
		
	@RequestMapping("/Home")
	public ModelAndView home() {
		
		ModelAndView mav= new ModelAndView("Home");
		return mav;
	}
	
	@RequestMapping("/Aquaman")
	public ModelAndView aquaman() {
		
		ModelAndView mav= new ModelAndView("Aquaman");
		return mav;
	}
	
	@RequestMapping("/avengers")
	public ModelAndView avengers() {
		
		ModelAndView mav= new ModelAndView("avengers");
		return mav;
	}
	
	@RequestMapping("/comment")
	public ModelAndView comment() {
		
		ModelAndView mav= new ModelAndView("comment");
		return mav;
	}
	@RequestMapping("/Home")
	public ModelAndView home() {
		
		ModelAndView mav= new ModelAndView("Home");
		return mav;
	}
	@RequestMapping("/f2")
	public ModelAndView f2() {
		
		ModelAndView mav= new ModelAndView("f2");
		return mav;
	}
	@RequestMapping("/greenbook")
	public ModelAndView greenbook() {
		
		ModelAndView mav= new ModelAndView("greenbook");
		return mav;
	}
	@RequestMapping("/Gullyboy")
	public ModelAndView gullyboy() {
		
		ModelAndView mav= new ModelAndView("Gullyboy");
		return mav;
	}
	@RequestMapping("/index")
	public ModelAndView index() {
		
		ModelAndView mav= new ModelAndView("index");
		return mav;
	}
	@RequestMapping("/kgf")
	public ModelAndView kgf() {
		
		ModelAndView mav= new ModelAndView("kgf");
		return mav;
	}
	@RequestMapping("/login")
	public ModelAndView login() {
		
		ModelAndView mav= new ModelAndView("login");
		return mav;
	}
	@RequestMapping("/manikarnika")
	public ModelAndView manikarnika() {
		
		ModelAndView mav= new ModelAndView("manikarnika");
		return mav;
	}
	@RequestMapping("/NTRMahanayakudu")
	public ModelAndView ntrm() {
		
		ModelAndView mav= new ModelAndView("NTRMahanayakudu");
		return mav;
	}
	@RequestMapping("/register")
	public ModelAndView register() {
		
		ModelAndView mav= new ModelAndView("register");
		return mav;
	}
	@RequestMapping("/totaldhamaal")
	public ModelAndView totaldhamaal() {
		
		ModelAndView mav= new ModelAndView("totaldhamaal");
		return mav;
	}
//	@RequestMapping("/Home")
//	public ModelAndView home() {
//		
//		ModelAndView mav= new ModelAndView("Home");
//		return mav;
//	}
//	@RequestMapping("/Home")
//	public ModelAndView home() {
//		
//		ModelAndView mav= new ModelAndView("Home");
//		return mav;
//	}
//	@RequestMapping("/Home")
//	public ModelAndView home() {
//		
//		ModelAndView mav= new ModelAndView("Home");
//		return mav;
//	}
	
	
	

}
