package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Patient;
import com.example.demo.repository.PatientRepository;

@RestController
public class PatientController {
	
	@Autowired
	private PatientRepository patientRepository;
	
	@GetMapping("/Patient")
	public List<Patient> GetAll() {
		List<Patient> patients = patientRepository.findAll();
		return patients;
	}
	
	@PostMapping("/savePatientData")
	public Patient SaveDate(@RequestBody Patient patient) {
		Patient savedPatient = patientRepository.save(patient);
		return patient;
	}
	
	@GetMapping("/patient/{idPatient}")
	public Patient GetPatientById(@PathVariable int idPatient) {
		Patient retrievedPatient = patientRepository.findById(idPatient).get();
		return retrievedPatient;
	}
	
	@DeleteMapping("/deletePatient/{idPatient}")
	public String DeletePatient(@PathVariable int idPatient) {
		Patient patientToBeDeleted = patientRepository.findById(idPatient).get();
		if (patientToBeDeleted != null)
			patientRepository.delete(patientToBeDeleted);
		return "The patient was successfuly deleted ... =!";
	}
	
	@PutMapping("/updatePatient")
	public Patient UpdatePatient(@RequestBody Patient patient) {
		Patient patientToBeUpdated = patientRepository.save(patient);
		return patientToBeUpdated;
	}
}
