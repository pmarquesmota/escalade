package pt.marquesmota.metier;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pt.marquesmota.dao.TopoRepository;
import pt.marquesmota.entity.Topo;

@Service
@Transactional
public class TopoImpl {
	@Autowired
	private TopoRepository topoRepository;

	public Topo consulterTopo(String nom) {
		Topo t = topoRepository.findByNom(nom);
		if(t==null) throw new RuntimeException("Topo introuvable");
		return t;
	}

	public void insererTopo(String nom, String description, String lieu_parution, Date date_parution, Boolean pret) {
		Topo t = new Topo(nom, description, lieu_parution, date_parution, pret);
		topoRepository.save(t);
	}
	
	public Page<Topo> listTopo(String nom, int page, int size){
		return topoRepository.listTopos(nom, PageRequest.of(page, size));
	}

}
