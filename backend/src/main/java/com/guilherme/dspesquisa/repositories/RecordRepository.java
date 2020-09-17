package com.guilherme.dspesquisa.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.guilherme.dspesquisa.entities.Record;

public interface RecordRepository extends JpaRepositoryImplementation<Record, Long>{

}
