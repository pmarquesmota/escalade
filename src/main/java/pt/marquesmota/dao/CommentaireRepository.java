package pt.marquesmota.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import pt.marquesmota.entity.Commentaire;

public interface CommentaireRepository extends JpaRepository<Commentaire, Long> {

}
