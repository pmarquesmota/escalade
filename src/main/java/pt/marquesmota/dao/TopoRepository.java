package pt.marquesmota.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import pt.marquesmota.entity.Topo;

@Component
public interface TopoRepository extends JpaRepository<Topo, Long>{
	Topo findByNom(String nom);
	
	public Page<Topo> listTopos(String nom, Pageable pageable);
}
