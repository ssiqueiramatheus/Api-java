package br.com.criandoapi.projeto.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.criandoapi.projeto.DAO.ITijolo;
import br.com.criandoapi.projeto.model.Tijolo;


@RestController
@CrossOrigin("*")
@RequestMapping("/tijolo")
public class TijoloController {
	
	@Autowired
	private ITijolo dao;
	
	@GetMapping
	public List<Tijolo> listaTijolo () {
		return (List<Tijolo>) dao.findAll();
	}
	
	@PostMapping
	public Tijolo criarTijolo(@RequestBody Tijolo tijolo) {
		Tijolo tijoloNovo = dao.save(tijolo);
		return tijoloNovo;
		
	}
	
	
	@PutMapping
	public Tijolo editarTijolo(@RequestBody Tijolo tijolo) {
		Tijolo tijoloNovo = dao.save(tijolo);
		return tijoloNovo;
		
	}
	
	@DeleteMapping("/{id}")
	public Optional <Tijolo> excluirTijolo(@PathVariable Integer id) {
		Optional<Tijolo> tijolo = dao.findById(id);
		dao.deleteById(id);
		return tijolo;
	}

}
