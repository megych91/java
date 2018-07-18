package com.codingdojo.LicensesAssignement.services;

import java.util.ArrayList;
import org.springframework.stereotype.Service;
import com.codingdojo.LicensesAssignement.models.License;
import com.codingdojo.LicensesAssignement.repositories.LicenseRepository;

@Service
public class LicenseService {
	private LicenseRepository licenseRepository;

	public LicenseService(LicenseRepository licenseRepository) {
		this.licenseRepository = licenseRepository;
	}
	
	// SHOW ALL LICENSES // 
	public ArrayList<License> all() {
		return (ArrayList<License>) licenseRepository.findAll();
	}
	
	// GET A LICENSE BY ITS' ID // 
	public License findOne(Long id) {
		return licenseRepository.findById(id).get();
	}
	
	
	// CREATE A NEW LICENSE // 
	public void create(License license) {
		licenseRepository.save(license);
	}
	
	
	// DELETE A LICENSE // 
	public void delete(Long id) {
		licenseRepository.deleteById(id);
	}
	
	
	//UPDATE A LICENSE // 
	public void update(License license) {
		licenseRepository.save(license);
	}
}
	