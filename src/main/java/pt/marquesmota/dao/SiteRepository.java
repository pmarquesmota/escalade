package pt.marquesmota.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import pt.marquesmota.entity.Site;

public interface SiteRepository extends JpaRepository<Site, Long> {

}
