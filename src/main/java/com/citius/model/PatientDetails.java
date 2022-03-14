package com.citius.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;

@Entity
public class PatientDetails extends User {
	
	
//	private String title;
//	
//	private String firstName;
//	
//	private String lastName;
//	
//	private LocalDate dateOfBirth;
	
	private Integer age;
	
	private String gender;
	
	private String race;
	
	private String ethnicity;
	
	private String languagesKnown;
	
//	private String email;
	
	private String homeAddress;
	
//	private Long phoneNumber;
	
	public String getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}

	@OneToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name= "emergId")
	private EmergencyContact emergencyContact;
	
	private Boolean hasAllergy;

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
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
	
	@JoinTable
	@OneToOne
	public void setEmergencyContact(EmergencyContact emergencyContact) {
		this.emergencyContact = emergencyContact;
	}

	public Boolean getHasAllergy() {
		return hasAllergy;
	}

	public void setHasAllergy(Boolean hasAllergy) {
		this.hasAllergy = hasAllergy;
	}

	

}
