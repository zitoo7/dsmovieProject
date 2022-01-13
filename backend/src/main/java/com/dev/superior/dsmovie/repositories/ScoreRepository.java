package com.dev.superior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.superior.dsmovie.entities.Score;
import com.dev.superior.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{

}
