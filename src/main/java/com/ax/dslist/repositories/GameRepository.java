package com.ax.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.ax.dslist.entities.Game;

@Component
public interface GameRepository extends JpaRepository<Game, Long> {

	
}