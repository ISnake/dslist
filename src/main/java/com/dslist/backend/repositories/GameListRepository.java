package com.dslist.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dslist.backend.entities.GameList;


    public interface GameListRepository extends JpaRepository<GameList, Long> {
    

    
}
