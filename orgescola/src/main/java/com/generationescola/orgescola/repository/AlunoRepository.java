package com.generationescola.orgescola.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generationescola.orgescola.model.AlunoModel;

public interface AlunoRepository extends JpaRepository<AlunoModel, Long>{
	public List<AlunoModel> findAllByNomeContainingIgnoreCase(String nome);
}
