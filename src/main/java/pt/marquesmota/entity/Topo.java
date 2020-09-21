package pt.marquesmota.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.context.annotation.Bean;

@Entity
public class Topo implements Serializable {
	@Id
	@GeneratedValue
	private Long id;
	private String nom;
	private String description;
	private String lieu_parution;
	private Date date_parution;
	private Boolean pret;
	
	@OneToMany(mappedBy = "site_id", fetch = FetchType.LAZY)
	Collection<Site> sites;
	
	public Topo(String nom, String description, String lieu_parution, Date date_parution, Boolean pret) {
		super();
		this.nom = nom;
		this.description = description;
		this.lieu_parution = lieu_parution;
		this.date_parution = date_parution;
		this.pret = pret;
	}
	public Topo() {
		super();
		// TODO Auto-generated constructor stub
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLieu_parution() {
		return lieu_parution;
	}
	public void setLieu_parution(String lieu_parution) {
		this.lieu_parution = lieu_parution;
	}
	public Date getDate_parution() {
		return date_parution;
	}
	public void setDate_parution(Date date_parution) {
		this.date_parution = date_parution;
	}
	public Boolean getPret() {
		return pret;
	}
	public void setPret(Boolean pret) {
		this.pret = pret;
	}
}
