package br.com.talentosrj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.talentosrj.domain.Anuncio;
import br.com.talentosrj.repository.AnuncioRepository;

@Service
public class AnuncioService {
	
	@Autowired
	AnuncioRepository anuncioRepository;
	
	
	public List<Anuncio> list() {
		return anuncioRepository.findAll();
	}
	
	public Anuncio save(Anuncio anuncio) {
		return anuncioRepository.save(anuncio);
	}
}
