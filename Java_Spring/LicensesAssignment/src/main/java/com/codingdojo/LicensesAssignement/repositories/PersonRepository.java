package com.codingdojo.LicensesAssignement.repositories;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.codingdojo.LicensesAssignement.models.Person;

public interface PersonRepository extends CrudRepository<Person, Long>{
	List<Person> findAll();
}

