package com.rede.social.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rede.social.model.Postagem;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long>{
	
	//public List<Postagem> findAllbyDescricaoContainingIgnoreCase (String descricao);
}
