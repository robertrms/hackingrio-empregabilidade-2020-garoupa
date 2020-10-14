package br.com.talentosrj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.talentosrj.domain.Aluno;
import br.com.talentosrj.repository.AlunoRepository;

@Service
public class AlunoService {
	
	@Autowired
	AlunoRepository alunoRepository;
	
	public List<Aluno> list() {
		return alunoRepository.findAll();
	}
	
	public Aluno save(Aluno aluno) {
		return alunoRepository.save(aluno);
	}
	
	public Aluno findById(Integer id) {
		return alunoRepository.findById(id).get();
	}
}
