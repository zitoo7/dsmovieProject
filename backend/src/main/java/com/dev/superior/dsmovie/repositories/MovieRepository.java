package com.dev.superior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.superior.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}
