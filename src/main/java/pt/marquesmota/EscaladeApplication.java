package pt.marquesmota;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import pt.marquesmota.dao.TopoRepository;
import pt.marquesmota.entity.Topo;

@EnableAutoConfiguration
@ComponentScan
@SpringBootApplication
public class EscaladeApplication {
	
	@Autowired
	private TopoRepository topoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(EscaladeApplication.class, args);
	}
	
	public void run(String... args) throws Exception {
		topoRepository.save( new Topo("test", "Topo de test", "chez moi", new Date(), true));
	}
}
