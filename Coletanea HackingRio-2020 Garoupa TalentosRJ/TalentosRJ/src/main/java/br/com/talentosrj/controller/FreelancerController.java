package br.com.talentosrj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("freelancer")
public class FreelancerController {

	@GetMapping("")
	public ModelAndView projetos() {
		ModelAndView mv = new ModelAndView("freelancer/freelancers");
		return mv;
	}
	
	@GetMapping("/informacao")
	public ModelAndView informacao() {
		ModelAndView mv = new ModelAndView("freelancer/freelancersInformacoes");
		return mv;
	}
}
