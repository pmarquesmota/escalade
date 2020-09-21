package pt.marquesmota.metier;

import java.util.Date;

import org.springframework.data.domain.Page;

import pt.marquesmota.entity.Topo;

public interface TopoMetier {
	public Topo consulterTopo(String nom);
	public Page<Topo> listTopo(String nom, int page, int size);
	public void insererTopo(String nom, String description, String lieu_parution, Date date_parution, Boolean pret);
}
