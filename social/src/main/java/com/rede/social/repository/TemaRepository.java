package com.rede.social.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rede.social.model.Tema;

@Repository
public interface TemaRepository extends JpaRepository<Tema, Long>{
	
	//public List<Tema> findAllbyDescricaoContainingIgnoreCase (String descricao);
}
