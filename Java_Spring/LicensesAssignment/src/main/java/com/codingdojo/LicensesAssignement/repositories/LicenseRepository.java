package com.codingdojo.LicensesAssignement.repositories;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.codingdojo.LicensesAssignement.models.License;

public interface LicenseRepository extends CrudRepository<License, Long>{
	List<License> findAll();
}
