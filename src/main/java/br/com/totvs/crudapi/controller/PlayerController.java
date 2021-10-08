package br.com.totvs.crudapi.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

import br.com.totvs.crudapi.model.Player;
import br.com.totvs.crudapi.repository.PlayerRepository;

@RestController
@RequestMapping("/players")
public class PlayerController {
	
	@Autowired
	private PlayerRepository playerRepository;
	
	@GetMapping
	public List<Player> ListAll() {
		return playerRepository.findAll();
	}
	
	@GetMapping
	public Optional<Player> ListOne(@Request Long id) {
		return playerRepository.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Player Create(@RequestBody Player player) {
		return playerRepository.save(player);
	}
	
}
