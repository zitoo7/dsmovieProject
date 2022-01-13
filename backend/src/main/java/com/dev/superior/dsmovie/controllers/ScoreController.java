package com.dev.superior.dsmovie.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.dev.superior.dsmovie.DTO.MovieDTO;
import com.dev.superior.dsmovie.DTO.ScoreDTO;
import com.dev.superior.dsmovie.services.ScoreService;

@RestControllerAdvice
@RequestMapping(value = "/scores")
public class ScoreController {
	
	@Autowired
	private ScoreService service;
	
	@PutMapping
	public MovieDTO saveScore(@RequestBody ScoreDTO dto){
		MovieDTO movieDto = service.saveScore(dto);
		return movieDto;
	}
}
