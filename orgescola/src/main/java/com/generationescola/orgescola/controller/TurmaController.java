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

import com.generationescola.orgescola.model.TurmaModel;
import com.generationescola.orgescola.repository.TurmaRepository;

@RestController
@RequestMapping("/turma")
@CrossOrigin("*")
public class TurmaController {
	
	@Autowired
	private TurmaRepository repository;
	
	@GetMapping //método findAll
	public ResponseEntity<List<TurmaModel>> findAllTurma(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}") //método findById
	public ResponseEntity<TurmaModel> findByIdTurma(@PathVariable long id){
		return repository.findById(id).map(resp-> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());	
	}
	
	@PostMapping //método postTurma
	public ResponseEntity<TurmaModel> postTurmaEntity (@RequestBody TurmaModel turma){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(turma));
	}
	
	@PutMapping
	public ResponseEntity<TurmaModel> putTurma (@RequestBody TurmaModel turma){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(turma));
	}
	
	@DeleteMapping("/{id}")
	public void deleteTurma (@PathVariable long id) {
		repository.deleteById(id);
	}

}
