package br.com.talentosrj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("profissional")
public class ProfissionalController {

	@GetMapping("")
	public ModelAndView orientacaoProfissional() {
		ModelAndView mv = new ModelAndView("profissional/orientacaoProfissional");
		return mv;
	}
}
