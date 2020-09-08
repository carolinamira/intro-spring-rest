package com.farmacia.dez.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.farmacia.dez.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	//public List<Produto> findAllbyNomeContainingIgnoreCase(String nome);

}
