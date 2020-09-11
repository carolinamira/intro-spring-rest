package com.rede.social.controller;

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

import com.rede.social.model.Postagem;
import com.rede.social.repository.PostagemRepository;

@RestController
@RequestMapping("/postagem")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PostagemController {
	
	@Autowired
	private PostagemRepository repository;
	
	@GetMapping //GetAllPostagem
	public ResponseEntity<List<Postagem>> getAllPostagem (){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}") //getByIdPostagem
	public ResponseEntity<Postagem> getByIdPostagem(@PathVariable long id) {
		return repository.findById(id).map(resp-> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping //postPostagem
	public ResponseEntity<Postagem> postPostagem (@RequestBody Postagem descricao){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(descricao));
	}
	
	@PutMapping //putPostagem
	public ResponseEntity<Postagem> putPostagem (@RequestBody Postagem descricao) {
		return ResponseEntity.ok(repository.save(descricao));		
	}
	
	@DeleteMapping("/{id}") //deletePostagem
	public void deletePostagem (@PathVariable long id) {
		repository.deleteById(id);
	}
	
}
