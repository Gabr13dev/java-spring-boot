package br.com.totvs.crudapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.totvs.crudapi.model.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long>{
	

}
