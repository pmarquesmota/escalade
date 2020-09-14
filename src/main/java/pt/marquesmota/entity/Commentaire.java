package pt.marquesmota.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Entity;
import javax.persistence.Id;

// @Entity est obsolète
// https://stackoverflow.com/questions/7985970/org-hibernate-annotations-entity-deprecated-in-hibernate-4
@Entity
public class Commentaire implements Serializable {
	@Id
	@GeneratedValue
	private Long id;
	
	private Date date;
	
	@ManyToOne
	@JoinColumn(name="site_id")
	private Site site;
	
	@OneToMany(mappedBy = "parent_id")
	@ManyToOne
	@JoinColumn(name="parent_id")
	private Commentaire parent;

	public Commentaire() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Commentaire( Date date, Site site, Commentaire parent) {
		super();
		this.date = date;
		this.site = site;
		this.parent = parent;
	}

	public Commentaire getParent() {
		return parent;
	}
	public void setParent(Commentaire parent) {
		this.parent = parent;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Site getSite() {
		return site;
	}
	public void setSite(Site site) {
		this.site = site;
	}


}
