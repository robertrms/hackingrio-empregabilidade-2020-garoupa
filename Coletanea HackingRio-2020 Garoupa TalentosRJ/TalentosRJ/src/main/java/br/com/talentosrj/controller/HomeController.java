package br.com.talentosrj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.talentosrj.domain.Aluno;
import br.com.talentosrj.service.AlunoService;

@Controller
@RequestMapping("index")
public class HomeController {
	
	@Autowired
	AlunoService alunoService;
	
	@GetMapping("")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("home/index");
		return mv;
	}
	
	@PostMapping("")
	public ModelAndView logar(Aluno aluno) {
		ModelAndView mv = new ModelAndView("login");
		
		List<Aluno> alunos = alunoService.list();
		for (Aluno alunoPesquisado : alunos) {
			if(alunoPesquisado.getCpf().equals(aluno.getCpf()) && alunoPesquisado.getSenha().equals(aluno.getSenha())) {
				mv = new ModelAndView("home/index");
			}
		}
		return mv;
	}
}
