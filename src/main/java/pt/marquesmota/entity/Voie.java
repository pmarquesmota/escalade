package pt.marquesmota.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Voie implements Serializable {
	@Id
	@GeneratedValue
	private Long id;
	private String nom;
	@OneToMany(mappedBy = "voie_id")
	private Collection<Longueur> longueur;
	@ManyToOne
	@JoinColumn(name = "secteur_id")
	private Secteur secteur;

	public Voie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Voie(String nom, Secteur secteur) {
		super();
		this.nom = nom;
		this.secteur = secteur;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
}
