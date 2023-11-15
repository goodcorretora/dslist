package com.ax.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ax.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
	
}