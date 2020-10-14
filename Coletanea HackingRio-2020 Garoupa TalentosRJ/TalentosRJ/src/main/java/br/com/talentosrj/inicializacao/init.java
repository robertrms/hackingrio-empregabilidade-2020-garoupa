package br.com.talentosrj.inicializacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import br.com.talentosrj.domain.Aluno;
import br.com.talentosrj.repository.AlunoRepository;

@Component
public class init implements ApplicationListener<ContextRefreshedEvent>{

	@Autowired
	AlunoRepository alunoRepository;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		Aluno aluno = new Aluno();
		aluno.setNome("Robert Rodrigues");
		aluno.setCpf("122.192.377-37");
		aluno.setEmail("robert-rm@Hotmail.com");
		aluno.setInstituicao("Faculdade Senac RJ");
		aluno.setSenha("123");
		alunoRepository.save(aluno);
	}
}