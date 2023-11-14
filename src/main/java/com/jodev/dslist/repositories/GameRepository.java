package com.jodev.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jodev.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
