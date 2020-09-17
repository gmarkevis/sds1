package com.guilherme.dspesquisa.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.guilherme.dspesquisa.entities.Genre;

public interface GenreRepository extends JpaRepositoryImplementation<Genre, Long>{

}
