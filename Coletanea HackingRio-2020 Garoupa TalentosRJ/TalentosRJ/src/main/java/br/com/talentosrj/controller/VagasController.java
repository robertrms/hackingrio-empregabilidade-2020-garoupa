package br.com.talentosrj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("vagas")
public class VagasController {
	
	@GetMapping("")
	public ModelAndView vagas() {
		ModelAndView mv = new ModelAndView("vagas/vagas");
		return mv;
	}
	
	@GetMapping("/informacao")
	public ModelAndView infoVagas() {
		ModelAndView mv = new ModelAndView("vagas/vagaInformacao");
		return mv;
	}
}
