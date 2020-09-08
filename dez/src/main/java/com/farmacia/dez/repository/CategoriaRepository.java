package com.farmacia.dez.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.farmacia.dez.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

	//public List<Categoria> findAllbyDescricaoContainingIgnoreCase(String descricao);
}
