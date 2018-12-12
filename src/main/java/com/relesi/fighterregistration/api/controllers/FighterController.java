package com.relesi.fighterregistration.api.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.relesi.fighterregistration.api.entities.Fighter;
import com.relesi.fighterregistration.api.repositories.FighterRepository;
import com.relesi.fighterregistration.api.resources.ResourceNotFoundException;

@RestController
@RequestMapping("/ms")
public class FighterController {

	@Autowired
	private FighterRepository fighterRepository;

	@GetMapping("/fighter")
	public List<Fighter> getAllFighter() {
		return fighterRepository.findAll();
	}

	@GetMapping("/fighter/{id}")
	public ResponseEntity<Fighter> buscarLutadorPorId(@PathVariable(value = "id") Long fighterId)
			throws ResourceNotFoundException {

		Fighter fighter = fighterRepository.findById(fighterId).orElseThrow(
				() -> new ResourceNotFoundException("Lutador não encontrado para esse ID :: " + fighterId));
		return ResponseEntity.ok().body(fighter);
	}

	@PostMapping("/fighter")
	public Fighter cadastrarLutador(@Valid @RequestBody Fighter fighter) {
		return fighterRepository.save(fighter);
	}

	@PutMapping("/fighter/{id}")
	public ResponseEntity<Fighter> atualizarLutador(@PathVariable(value = "id") Long fighterId,
			@Valid @RequestBody Fighter fighterDatails) throws ResourceNotFoundException {
		Fighter fighter = fighterRepository.findById(fighterId).orElseThrow(
				() -> new ResourceNotFoundException("Lutador não encontrado para esse ID :: " + fighterId));

		fighter.setNome(fighterDatails.getNome());
		fighter.setFaixa(fighterDatails.getFaixa());
		fighter.setCategoria(fighterDatails.getCategoria());
		fighter.setGrau(fighterDatails.getGrau());
		fighter.setIdade(fighterDatails.getIdade());
		fighter.setPeso(fighterDatails.getPeso());
		fighter.setEmail(fighterDatails.getEmail());

		final Fighter atualizarLutador = fighterRepository.save(fighter);

		return ResponseEntity.ok(atualizarLutador);

	}

	@DeleteMapping("/fighter/{id}")
	public Map<String, Boolean> deletandoLutador(@PathVariable(value = "id") Long fighterId)
			throws ResourceNotFoundException {
		Fighter fighter = fighterRepository.findById(fighterId).orElseThrow(
				() -> new ResourceNotFoundException("Lutador não encontrado para esse ID :: " + fighterId));

		fighterRepository.delete(fighter);
		Map<String, Boolean> response = new HashMap<>();
		response.put("Deletando Lutador com Id : " + fighterId, Boolean.TRUE);
		return response;

	}

}
