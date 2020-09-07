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
public class Secteur implements Serializable {
	@Id
	@GeneratedValue
	private Long id;
	private Integer numero;
	private String nom;
	@ManyToOne
	@JoinColumn(name = "site_id")
	private Site site;
	@OneToMany(mappedBy = "voie_id")
	private Collection<Voie> voies;

	public Secteur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Secteur(Integer numero, String nom, Site site) {
		super();
		this.numero = numero;
		this.nom = nom;
		this.site = site;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

}
