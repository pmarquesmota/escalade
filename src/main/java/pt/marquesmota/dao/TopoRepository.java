package pt.marquesmota.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import pt.marquesmota.entity.Topo;

@Component
public interface TopoRepository extends JpaRepository<Topo, Long>{
	@Query(nativeQuery = true, value= "select * from topo t where t.nom=:x")
	public Page<Topo> listTopos(@Param("x") String nom, Pageable pageable);
}
