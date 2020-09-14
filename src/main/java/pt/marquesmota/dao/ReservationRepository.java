package pt.marquesmota.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import pt.marquesmota.entity.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
