package com.smvc.studentadmissioncontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.portlet.ModelAndView;

@Controller
public class StudentAdmissionController {
	
	@RequestMapping(value="/admission.html", method=RequestMethod.GET)
	public ModelAndView getAdmissionForm() {
		
		ModelAndView model=new ModelAndView("AdmissionForm");
		return model;
	}
	
	@RequestMapping(value="/submitAdmissionForm", method=RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@RequestParam("studentname") String name, @RequestParam("studentaddress")  String area ) {
		
		Student s= new Student();
		s.setStudentname(name);
		s.setStudentarea(area);
		
		ModelAndView mv=new ModelAndView("AdmissionSuccess");
		mv.addObject("college", "Sri Indu College Of Engineering and Technology");
		mv.addObject("student", s);
		
		return mv;
		
	}

}
