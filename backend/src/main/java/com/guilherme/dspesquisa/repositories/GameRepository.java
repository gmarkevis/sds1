package com.guilherme.dspesquisa.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.guilherme.dspesquisa.entities.Game;

public interface GameRepository extends JpaRepositoryImplementation<Game, Long>{

}
