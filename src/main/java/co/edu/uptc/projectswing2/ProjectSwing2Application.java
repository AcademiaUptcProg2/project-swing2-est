package co.edu.uptc.projectswing2;


import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import co.edu.uptc.models.ManagerPeople;
import co.edu.uptc.pojos.Person;




@SpringBootApplication
public class ProjectSwing2Application {

	public static void main(String[] args) {
		SpringApplication.run(ProjectSwing2Application.class, args);

		ManagerPeople model = new ManagerPeople();		
		model.showAll("Original");
		model.add(new Person( "Cedula", "123456789", "John11", "Doe22", LocalDate.now(), 'M' ));
		model.add(new Person( "Cedula", "987654321", "Jane22", "Doe333", LocalDate.now(), 'F' ));
		model.showAll("Adicionado");
		model.removeByDocument(new Person( "Cedula", "123456789", "John11", "Doe22", LocalDate.now(), 'M' ));
		model.showAll("Eliminado");
		
		
		
		
	}

}
