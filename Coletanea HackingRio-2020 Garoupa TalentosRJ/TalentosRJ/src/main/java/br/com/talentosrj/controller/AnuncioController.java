package br.com.talentosrj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.talentosrj.domain.Anuncio;
import br.com.talentosrj.service.AnuncioService;

@Controller
@RequestMapping("anuncio")
public class AnuncioController {
	
	@Autowired
	AnuncioService anuncioService;
	
	@GetMapping("")
	public ModelAndView anuncio() {
		ModelAndView mv = new ModelAndView("anuncio/anuncio");
		mv.addObject("anuncio", new Anuncio());
		return mv;
	}
	
	@PostMapping("/salvar")
	public ModelAndView salvar(Anuncio anuncio) {
		ModelAndView mv = new ModelAndView("freelancer/freelancers");
		
		anuncioService.save(anuncio);
		if(anuncio.getTipoAnuncio().equals("option1")) {
			mv = new ModelAndView("projeto/projetos");
		}
		return mv;
	}

}
