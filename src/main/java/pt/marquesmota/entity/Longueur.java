package pt.marquesmota.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Longueur implements Serializable{
	@Id
	@GeneratedValue
	private Long id;
	private String difficulte;
	private Integer points;
	@ManyToOne
	@JoinColumn(name = "voie_id")
	private Voie voie;
	
	public Longueur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Longueur(String difficulte, Integer points, Voie voie) {
		super();
		this.difficulte = difficulte;
		this.points = points;
		this.voie = voie;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDifficulte() {
		return difficulte;
	}

	public void setDifficulte(String difficulte) {
		this.difficulte = difficulte;
	}

	public Integer getPoints() {
		return points;
	}

	public void setPoints(Integer points) {
		this.points = points;
	}
	
}
