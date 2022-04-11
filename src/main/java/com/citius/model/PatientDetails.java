package com.citius.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
@DiscriminatorValue("Patient")
public class PatientDetails extends User {
	
	
	private Integer age;
	
	private String gender;
	
	private String race;
	
	private String ethnicity;
	
	private String languagesKnown;
		
	private String homeAddress;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "emerg_id")
	private EmergencyContact emergencyContact;
	
	private Boolean hasAllergy;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Allergy> allergies;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "visit_id")
	private PatientVisit visitDetails;
//	
//	@OneToMany(cascade = CascadeType.ALL)
//	private List<Procedures> procedureDetails;
//	
//	@OneToMany(cascade = CascadeType.ALL)
//	private List<Drug> drugDetails;
	

	public Integer getAge() {
		return age;
	}

	public void setAge() {
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate date;
		date  = LocalDate.parse(this.getUserDOB(), format);
		LocalDate now =  LocalDate.now();
		this.age= now.getYear() - date.getYear();
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public String getEthnicity() {
		return ethnicity;
	}

	public void setEthnicity(String ethnicity) {
		this.ethnicity = ethnicity;
	}

	public String getLanguagesKnown() {
		return languagesKnown;
	}

	public void setLanguagesKnown(String languagesKnown) {
		this.languagesKnown = languagesKnown;
	}

	public EmergencyContact getEmergencyContact() {
		return emergencyContact;
	}
	
	
	public void setEmergencyContact(EmergencyContact emergencyContact) {
		this.emergencyContact = emergencyContact;
	}

	public Boolean getHasAllergy() {
		return hasAllergy;
	}

	public void setHasAllergy(Boolean hasAllergy) {
		this.hasAllergy = hasAllergy;
	}
	
	public String getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}

	public List<Allergy> getAllergies() {
		return allergies;
	}

	public void setAllergies(List<Allergy> allergies) {
		this.allergies = allergies;
	}

	public PatientVisit getVisitDetails() {
		return visitDetails;
	}

	public void setVisitDetails(PatientVisit visitDetails) {
		this.visitDetails = visitDetails;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

//	public List<Procedures> getProcedureDetails() {
//		return procedureDetails;
//	}
//
//	public void setProcedureDetails(List<Procedures> procedureDetails) {
//		this.procedureDetails = procedureDetails;
//	}
//
//	public List<Drug> getDrugDetails() {
//		return drugDetails;
//	}
//
//	public void setDrugDetails(List<Drug> drugDetails) {
//		this.drugDetails = drugDetails;
//	}
	
	
	
	

	

}
