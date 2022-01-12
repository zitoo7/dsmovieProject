package com.dev.superior.dsmovie.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_score")
public class Score {

	private Double value;
	
	//primary key
	@EmbeddedId
	private ScorePK id = new ScorePK();
	
	public Score() {}
	
	public void setMovie(Movie movie) {
		id.setMovie(movie);
	}

	public void setUser(User user) {
		id.setUser(user);
	}
	
	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public ScorePK getId() {
		return id;
	}

	public void setId(ScorePK id) {
		this.id = id;
	}
	
	
}
