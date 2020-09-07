package pt.marquesmota.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Reservation implements Serializable {
	@Id
	@GeneratedValue
	private Long id;

}
