package com.gontuseries.hellocontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;


 @Controller
 public class HelloController{
 
 @RequestMapping("/welcome")
 public ModelAndView helloworld() {
	 ModelAndView modelandview = new ModelAndView("HelloPage");
  modelandview.addObject("welcomeMessage", "Hi User");
  return modelandview;
  } 
 
 @RequestMapping("/wel")
 public ModelAndView helloworld1() {
	 ModelAndView modelandview = new ModelAndView("HelloPage");
  modelandview.addObject("welcomeMessage", "hello risheendra");
  return modelandview;
  } 
 
 
 
}
 
/*
 * public class HelloController extends AbstractController{
 * 
 * @Override protected ModelAndView handleRequestInternal(HttpServletRequest
 * request, HttpServletResponse response) throws Exception {
 * 
 * ModelAndView mv=new ModelAndView("HelloPage"); mv.addObject("welcomeMessage",
 * "Hi user"); return mv; } }
 */