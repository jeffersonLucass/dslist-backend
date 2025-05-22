package com.jefferson.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jefferson.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game,Long>{
	
	
}
