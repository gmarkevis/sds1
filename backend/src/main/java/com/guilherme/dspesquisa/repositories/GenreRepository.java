package com.guilherme.dspesquisa.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.guilherme.dspesquisa.entities.Genre;

@Repository
public interface GenreRepository extends JpaRepositoryImplementation<Genre, Long>{

}
