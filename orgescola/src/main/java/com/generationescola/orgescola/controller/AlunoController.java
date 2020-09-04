package com.generationescola.orgescola.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generationescola.orgescola.model.AlunoModel;
import com.generationescola.orgescola.repository.AlunoRepository;

@RestController
@RequestMapping("/aluno")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class AlunoController {
	
	@Autowired
	private AlunoRepository repository;
	
	@GetMapping //método findAllAluno
	public ResponseEntity<List<AlunoModel>> findAllAluno(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}") //método findById
	public ResponseEntity<AlunoModel> findByIdAluno(@PathVariable long id){
		return repository.findById(id).map(resp-> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());	
	}
	
	@PostMapping //método postAluno
	public ResponseEntity<AlunoModel> postAluno (@RequestBody AlunoModel aluno){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(aluno));
	}
	
	@PutMapping
	public ResponseEntity<AlunoModel> putAluno (@RequestBody AlunoModel aluno){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(aluno));
	}
	
	@DeleteMapping("/{id}")
	public void deleteAluno (@PathVariable long id) {
		repository.deleteById(id);
	}

}
