package pt.marquesmota.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Site implements Serializable {
	@Id
	@GeneratedValue
	private Long id;
	private String nom;
	private Boolean officiel;
	@OneToMany(mappedBy = "site_id", fetch = FetchType.LAZY)
	Collection<Commentaire> commentaires;
	@OneToMany(mappedBy = "secteur_id", fetch = FetchType.LAZY)
	Collection<Secteur> secteurs;
	
	public Site() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Site(String nom, Boolean officiel) {
		super();
		this.nom = nom;
		this.officiel = officiel;
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
	public Boolean getOfficiel() {
		return officiel;
	}
	public void setOfficiel(Boolean officiel) {
		this.officiel = officiel;
	}
}
