package com.dslist.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dslist.backend.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
    
}
