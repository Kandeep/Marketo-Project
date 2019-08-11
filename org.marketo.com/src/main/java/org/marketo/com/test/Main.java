package org.marketo.com.test;

import org.marketo.com.model.Person;
import org.marketo.com.spring.config.AppConfig;
import org.marketo.com.spring.dao.PersonDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) throws Exception {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		PersonDAO personDAO = context.getBean(PersonDAO.class);
		
		  System.out.println("List of person is:"); for (Person p :
		  personDAO.getAllPersons()) { System.out.println(p); }
		 
		
		  System.out.println("\nGet person with ID 2"); 
		  Person personById =personDAO.getPersonById(2L); 
		  System.out.println(personById);
		 
		
		  System.out.println("\nCreating person: "); Person person = new Person(6L, 70,
		  "kjghjhgijewr", "uqegiurtiuq"); System.out.println(person);
		  personDAO.createPerson(person); System.out.println("\nList of person is:");
		  
		  for (Person p : personDAO.getAllPersons()) { System.out.println(p); }
		  
		  
		
		  System.out.println("\nDeleting person with ID 2");
		  personDAO.deletePerson(personById);
		 
		  
		  
		  System.out.println("\nUpdate person with ID 4");
		  
		  Person pperson = personDAO.getPersonById(4L); pperson.setLastName("kkkkkkk");
		  personDAO.updatePerson(pperson);
		  
		  System.out.println("\nList of person is:"); for (Person p :
		  personDAO.getAllPersons()) { System.out.println(p); }
		 

		context.close();

	}

}
