package com.henrique.dslist.repositories;

import com.henrique.dslist.entities.Game;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}