package com.jodev.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jodev.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
