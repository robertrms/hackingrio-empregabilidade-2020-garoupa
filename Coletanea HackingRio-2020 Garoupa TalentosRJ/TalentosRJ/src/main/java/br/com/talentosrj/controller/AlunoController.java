package br.com.talentosrj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.talentosrj.domain.Aluno;
import br.com.talentosrj.service.AlunoService;

@Controller
@RequestMapping("login")
public class AlunoController {
	
	@Autowired
	private AlunoService alunoService;
	
	@GetMapping("")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("login");
		mv.addObject("aluno", new Aluno());
		return mv;
	}
	
	@GetMapping("/cadastro")
	public ModelAndView cadastro() {
		ModelAndView mv = new ModelAndView("cadastro");
		mv.addObject("aluno", new Aluno());
		return mv;
	}
	
	@PostMapping("/salvar")
	public ModelAndView salvar(Aluno aluno) {
		alunoService.save(aluno);
		return index();
	}
}
