package br.com.talentosrj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.talentosrj.domain.Anuncio;

@Repository
public interface AnuncioRepository extends JpaRepository<Anuncio, Integer>{

}
